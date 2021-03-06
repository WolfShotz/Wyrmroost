//package com.github.wolfshotz.wyrmroost.client.render;
//
//import com.github.wolfshotz.wyrmroost.client.ClientEvents;
//import com.github.wolfshotz.wyrmroost.client.model.ModelAnimator;
//import com.github.wolfshotz.wyrmroost.client.model.WRModelRenderer;
//import com.github.wolfshotz.wyrmroost.client.render.entity.fog_wraith.FogWraithModel;
//import com.github.wolfshotz.wyrmroost.client.render.entity.fog_wraith.FogWraithRenderer;
//import com.github.wolfshotz.wyrmroost.items.FogWraithTailsItem;
//import com.github.wolfshotz.wyrmroost.util.animation.Animation;
//import com.github.wolfshotz.wyrmroost.util.animation.IAnimatable;
//import com.mojang.blaze3d.matrix.MatrixStack;
//import com.mojang.blaze3d.vertex.IVertexBuilder;
//import net.minecraft.client.renderer.IRenderTypeBuffer;
//import net.minecraft.client.renderer.ItemRenderer;
//import net.minecraft.client.renderer.RenderType;
//import net.minecraft.client.renderer.model.ItemCameraTransforms;
//import net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer;
//import net.minecraft.item.ItemStack;
//
//public class FogWraithTailsStackRenderer extends ItemStackTileEntityRenderer
//{
//    public static final Animation TAIL_SWIPE_ANIMATION = new Animation(15);
//    public static final Animation GRAPPLE_ANIMATION = new Animation(13);
//    public static final FogWraithModel MODEL = new FogWraithModel();
//
//    @Override
//    public void func_239207_a_(ItemStack stack, ItemCameraTransforms.TransformType transforms, MatrixStack ms, IRenderTypeBuffer typeBuffer, int light, int overlay)
//    {
//        final IVertexBuilder buffer = ItemRenderer.getBuffer(typeBuffer, RenderType.getEntityCutout(FogWraithRenderer.TEXTURE), false, stack.hasEffect());
//        final float partialTicks = ClientEvents.getTickDelta();
//        final float tick = ClientEvents.getPlayer().ticksExisted + partialTicks;
//        float timer = 0;
//        int tailUseNum = 1;
//
//        MODEL.resetToDefaultPose();
//
//        switch (transforms)
//        {
//            case THIRD_PERSON_LEFT_HAND:
//            case FIRST_PERSON_LEFT_HAND:
//                tailUseNum = 0;
//            case THIRD_PERSON_RIGHT_HAND:
//            case FIRST_PERSON_RIGHT_HAND:
//            {
//                timer = FogWraithTailsItem.getCapability(stack).transition.get(partialTicks);
//                final IAnimatable animCap = stack.getCapability(IAnimatable.CapImpl.CAPABILITY).orElseThrow(NullPointerException::new);
//                final ModelAnimator animator = MODEL.animator;
//                final WRModelRenderer[] parts = MODEL.tails[tailUseNum];
//
//                MODEL.animator.update(animCap, partialTicks);
//
//                if (timer > 0)
//                {
//                    MODEL.setTime(timer);
//                    MODEL.chainWave(parts, 0.1f, 0.05f, -2, tick, timer * 0.5f);
//                    MODEL.rotate(parts[0], 0.8f, 0.15f, 0);
//                    for (WRModelRenderer part : parts) MODEL.rotate(part, -0.2f, 0, 0);
//                }
//
//                if (animator.setAnimation(GRAPPLE_ANIMATION))
//                {
//                    animator.startKeyframe(5);
//                    animator.rotate(parts[0], -1.6f, 0, 0);
//                    for (WRModelRenderer part : parts)
//                    {
//                        animator.rotate(part, 0.2f, 0, 0);
//                    }
//                    animator.endKeyframe();
//                    animator.setStaticKeyframe(5);
//                    animator.resetKeyframe(3);
//                }
//                else if (animator.setAnimation(TAIL_SWIPE_ANIMATION))
//                {
//                    animator.startKeyframe(2);
//                    animator.rotate(parts[0], -1.3f, 0, 0);
//                    for (WRModelRenderer part : parts) animator.rotate(part, 0.2f, 0, 0);
//                    animator.endKeyframe();
//                    animator.setStaticKeyframe(9);
//                    animator.resetKeyframe(2);
//                    MODEL.chainSwing(parts, 0.6f, 0.75f, -2, animCap.getAnimationTick() + partialTicks, 0.5f);
//                }
//            }
//            default:
//                for (int i = 0; i < MODEL.tails.length; i++)
//                {
//                    MODEL.animateTail(i, tick, (i == tailUseNum? (-timer + 1) : 1f) * 0.5f);
//                    MODEL.tails[i][0].render(ms, buffer, light, overlay);
//                }
//        }
//    }
//}
