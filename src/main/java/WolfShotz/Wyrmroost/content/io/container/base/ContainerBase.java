package WolfShotz.Wyrmroost.content.io.container.base;

import WolfShotz.Wyrmroost.content.entities.dragon.AbstractDragonEntity;
import WolfShotz.Wyrmroost.content.entities.dragon.butterflyleviathan.ButterflyLeviathanEntity;
import WolfShotz.Wyrmroost.content.entities.dragon.rooststalker.RoostStalkerEntity;
import WolfShotz.Wyrmroost.content.items.DragonArmorItem;
import WolfShotz.Wyrmroost.registry.SetupIO;
import WolfShotz.Wyrmroost.util.ModUtils;
import WolfShotz.Wyrmroost.util.entityutils.multipart.IMultiPartEntity;
import WolfShotz.Wyrmroost.util.entityutils.multipart.MultiPartEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

import javax.annotation.Nonnull;
import java.util.function.Predicate;

public abstract class ContainerBase<T extends AbstractDragonEntity> extends Container
{
    public T dragon;
    
    public ContainerBase(T dragon, ContainerType<?> type, int windowID)
    {
        super(type, windowID);
        this.dragon = dragon;
    }
    
    /**
     * Determines whether supplied player can use this container
     */
    @Override
    public boolean canInteractWith(PlayerEntity playerIn)
    {
        if (dragon instanceof IMultiPartEntity)
            for (MultiPartEntity part : ((IMultiPartEntity) dragon).getParts())
                if (part.getDistance(playerIn) < 10) return true;
        
        return dragon.getDistance(playerIn) < 10;
    }
    
    public void buildSlotArea(IInventory inventory, int index, int initialX, int initialY, int length, int height)
    {
        for (int y = 0; y < height; ++y)
        {
            for (int x = 0; x < length; ++x)
            {
                addSlot(new Slot(inventory, index, initialX + x * 18, initialY + y * 18));
                ++index;
            }
        }
    }
    
    public void buildSlotArea(ISlotArea slotArea, int index, int initialX, int initialY, int length, int height)
    {
        for (int y = 0; y < height; ++y)
        {
            for (int x = 0; x < length; ++x)
            {
                addSlot(slotArea.slotPos(index, initialX + x * 18, initialY + y * 18));
                ++index;
            }
        }
    }
    
    public void buildPlayerSlots(PlayerInventory playerInv, int initialX, int initialY)
    {
        buildSlotArea(playerInv, 9, initialX, initialY, 9, 3); // Player inv
        buildSlotArea(playerInv, 0, initialX, initialY + 58, 9, 1); // Hotbar
    }
    
    public SlotItemHandler buildSaddleSlot(IItemHandler handler, int x, int y)
    {
        return new SlotItemHandler(handler, 0, x, y)
        {
            @Override
            public boolean isItemValid(ItemStack stack)
            {
                return stack.getItem() == Items.SADDLE;
            }
            
            @Override
            public boolean isEnabled()
            {
                return !dragon.isChild();
            }
            
            @Override
            public void onSlotChanged()
            {
                if (!getStack().isEmpty()) dragon.playSound(SoundEvents.ENTITY_HORSE_SADDLE, 1f, 1f);
            }
        };
    }
    
    public static SlotItemHandler buildSaddleSlot(AbstractDragonEntity dragon, IItemHandler handler, int x, int y)
    {
        return new SlotItemHandler(handler, 0, x, y)
        {
            @Override
            public boolean isItemValid(ItemStack stack)
            {
                return stack.getItem() == Items.SADDLE;
            }
            
            @Override
            public boolean isEnabled()
            {
                return !dragon.isChild();
            }
            
            @Override
            public void onSlotChanged()
            {
                if (!getStack().isEmpty()) dragon.playSound(SoundEvents.ENTITY_HORSE_SADDLE, 1f, 1f);
            }
        };
    }
    
    public SlotItemHandler buildArmorSlot(IItemHandler handler, int x, int y)
    {
        return new SlotItemHandler(handler, 1, x, y)
        {
            Predicate<Item> isArmor = DragonArmorItem.class::isInstance;
            
            @Override
            public boolean isItemValid(@Nonnull ItemStack stack)
            {
                return isArmor.test(stack.getItem());
            }
            
            @Override
            public void onSlotChanged()
            {
                dragon.setArmored();
            }
            
            @Override
            public ResourceLocation getBackgroundLocation()
            {
                return ModUtils.resource("textures/io/slots/armor_slot.png");
            }
        };
    }
    
    @Override
    public ItemStack transferStackInSlot(PlayerEntity playerIn, int index)
    {
        ItemStack itemStack = ItemStack.EMPTY;
        Slot slot = inventorySlots.get(index);
        if (slot != null && slot.getHasStack())
        {
            ItemStack itemStack1 = slot.getStack();
            itemStack = itemStack1.copy();
            if (index < 36 && !mergeItemStack(itemStack1, 36, inventorySlots.size(), false)) return ItemStack.EMPTY;
            else if (!mergeItemStack(itemStack1, 0, 37, true)) return ItemStack.EMPTY;
            
            if (itemStack1.isEmpty()) slot.putStack(ItemStack.EMPTY);
            else slot.onSlotChanged();
        }
        
        return itemStack;
    }
    
    public static ContainerBase<RoostStalkerEntity> stalkerInv(Entity entity, PlayerInventory playerInv, int windowID)
    {
        return new ContainerBase<RoostStalkerEntity>((RoostStalkerEntity) entity, SetupIO.STALKER_CONTAINER.get(), windowID)
        {{
            buildPlayerSlots(playerInv, 7, 83);
            dragon.getInvHandler().ifPresent(i -> addSlot(new SlotItemHandler(i, 0, 85, 65)
            {
                @Override
                public boolean isItemValid(@Nonnull ItemStack stack)
                {
                    return !(stack.getItem() instanceof BlockItem);
                }
            }));
        }};
    }
    
    public static ContainerBase<ButterflyLeviathanEntity> butterflyInv(Entity entity, PlayerInventory playerInv, int windowID)
    {
        return new ContainerBase<ButterflyLeviathanEntity>((ButterflyLeviathanEntity) entity, SetupIO.BUTTERFLY_CONTAINER.get(), windowID)
        {{
            buildPlayerSlots(playerInv, 7, 83);
            
            dragon.getInvHandler().ifPresent(i -> addSlot(new SlotItemHandler(i, 0, 127, 56)
            {
                @Override
                public boolean isItemValid(@Nonnull ItemStack stack)
                {
                    return stack.getItem() == Items.CONDUIT;
                }
                
                @Override
                public int getSlotStackLimit()
                {
                    return 1;
                }
                
                @Override
                public int getItemStackLimit(@Nonnull ItemStack stack)
                {
                    return 1;
                }
            }));
        }};
    }
}