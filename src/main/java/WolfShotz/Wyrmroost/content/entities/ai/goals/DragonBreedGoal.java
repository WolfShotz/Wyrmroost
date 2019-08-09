package WolfShotz.Wyrmroost.content.entities.ai.goals;

import WolfShotz.Wyrmroost.content.entities.AbstractDragonEntity;
import WolfShotz.Wyrmroost.event.SetupBlocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.BreedGoal;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.stats.Stats;
import net.minecraft.world.GameRules;

public class DragonBreedGoal extends BreedGoal
{
    private final AbstractDragonEntity dragon;
    private final int hatchTimer;
    
    /**
     * @param dragon dragon type were breeding
     * @param hatchTimer the time, in ticks, it takes to hatch
     */
    public DragonBreedGoal(AbstractDragonEntity dragon, int hatchTimer) {
        super(dragon, 1.0d);
        this.dragon = dragon;
        this.hatchTimer = hatchTimer;
    }
    
    @Override
    public boolean shouldExecute() {
        if (super.shouldExecute())
            return ((AbstractDragonEntity) field_75391_e).getGender() == !dragon.getGender();
        return false;
    }
    
    /**
     * Spawns an egg item at the dragons location when bred.
     * Forge breed events are taking in <code>AgeableEntity</code> as a param, thus, they cannot be posted.
     * Mod Makers: Feel free to PR a workaround if you need this!
     */
    @Override
    protected void spawnBaby() {
        CompoundNBT tag = new CompoundNBT();
        ItemStack eggStack = new ItemStack(SetupBlocks.egg);
    
        tag.putString("dragonType", EntityType.getKey(dragon.getType()).toString());
        tag.putInt("hatchTimer", hatchTimer);
        eggStack.setTag(tag);
    
        ItemEntity eggItem = new ItemEntity(world, dragon.posX, dragon.posY, dragon.posZ, eggStack);
        ServerPlayerEntity serverplayerentity = animal.getLoveCause();
        
        if (serverplayerentity == null && field_75391_e.getLoveCause() != null) serverplayerentity = field_75391_e.getLoveCause();
    
        if (serverplayerentity != null) serverplayerentity.addStat(Stats.ANIMALS_BRED);
    
        animal.setGrowingAge(6000);
        field_75391_e.setGrowingAge(6000);
        animal.resetInLove();
        field_75391_e.resetInLove();
        world.addEntity(eggItem);
        if (world.getGameRules().getBoolean(GameRules.DO_MOB_LOOT))
            world.addEntity(new ExperienceOrbEntity(world, dragon.posX, dragon.posY, dragon.posZ, dragon.getRNG().nextInt(7) + 1));
    }
}