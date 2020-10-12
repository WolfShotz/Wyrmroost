package WolfShotz.Wyrmroost.client.render.entity.orbwyrm;

import WolfShotz.Wyrmroost.client.model.WREntityModel;
import WolfShotz.Wyrmroost.entities.dragon.OrbwyrmEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.model.ModelRenderer;

public class OrbwyrmModel extends WREntityModel<OrbwyrmEntity>
{
    public ModelRenderer body1;
    public ModelRenderer body2;
    public ModelRenderer neck1;
    public ModelRenderer wing1L;
    public ModelRenderer wing1R;
    public ModelRenderer arm1L;
    public ModelRenderer arm1R;
    public ModelRenderer quills4;
    public ModelRenderer tail1;
    public ModelRenderer quills5;
    public ModelRenderer tail2;
    public ModelRenderer quills6;
    public ModelRenderer tail3;
    public ModelRenderer quills7;
    public ModelRenderer tail4;
    public ModelRenderer tail5;
    public ModelRenderer tail6;
    public ModelRenderer tail7;
    public ModelRenderer tail8;
    public ModelRenderer tail9;
    public ModelRenderer spike1L;
    public ModelRenderer spike1R;
    public ModelRenderer tail10;
    public ModelRenderer quills8;
    public ModelRenderer spike2L;
    public ModelRenderer spike2R;
    public ModelRenderer tail11;
    public ModelRenderer quills9;
    public ModelRenderer spike3L;
    public ModelRenderer spike3R;
    public ModelRenderer tail12;
    public ModelRenderer spike4L;
    public ModelRenderer spike4R;
    public ModelRenderer tail13;
    public ModelRenderer spike5L;
    public ModelRenderer spike5R;
    public ModelRenderer tail14;
    public ModelRenderer spike6L;
    public ModelRenderer spike6R;
    public ModelRenderer spike7L;
    public ModelRenderer spike7R;
    public ModelRenderer neck2;
    public ModelRenderer neck3;
    public ModelRenderer quills3;
    public ModelRenderer neck4;
    public ModelRenderer quills2;
    public ModelRenderer quills1;
    public ModelRenderer neck4_1;
    public ModelRenderer quills1_1;
    public ModelRenderer neck5;
    public ModelRenderer head;
    public ModelRenderer nose;
    public ModelRenderer jaw;
    public ModelRenderer horn1L;
    public ModelRenderer horn1R;
    public ModelRenderer eye1L;
    public ModelRenderer eye2L;
    public ModelRenderer eye3L;
    public ModelRenderer eye1R;
    public ModelRenderer eye2R;
    public ModelRenderer eye3R;
    public ModelRenderer chin;
    public ModelRenderer cheekL;
    public ModelRenderer cheekR;
    public ModelRenderer horn2L;
    public ModelRenderer horn2R;
    public ModelRenderer wing2L;
    public ModelRenderer palmL;
    public ModelRenderer clawL2;
    public ModelRenderer clawL1;
    public ModelRenderer clawL3;
    public ModelRenderer wing2R;
    public ModelRenderer palmR;
    public ModelRenderer clawR2;
    public ModelRenderer clawR3;
    public ModelRenderer clawR1;
    public ModelRenderer arm2L;
    public ModelRenderer spikeL;
    public ModelRenderer arm2R;
    public ModelRenderer spikeR;

    public OrbwyrmModel()
    {
        this.textureWidth = 150;
        this.textureHeight = 100;
        this.spike5R = new ModelRenderer(this, 102, 19);
        this.spike5R.setRotationPoint(-1.0F, 0.0F, 4.0F);
        this.spike5R.addBox(-3.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(spike5R, 0.0F, 0.7853981633974483F, 0.0F);
        this.spike7L = new ModelRenderer(this, 102, 19);
        this.spike7L.setRotationPoint(0.5F, 0.0F, 4.0F);
        this.spike7L.addBox(0.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(spike7L, 0.0F, -0.7853981633974483F, 0.0F);
        this.tail2 = new ModelRenderer(this, 84, 0);
        this.tail2.setRotationPoint(-0.0F, -0.0F, 6.5F);
        this.tail2.addBox(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 8.0F, -0.3F, -0.3F, 0.0F);
        this.spikeL = new ModelRenderer(this, 88, 23);
        this.spikeL.setRotationPoint(0.0F, 5.5F, 0.0F);
        this.spikeL.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 8.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(spikeL, 1.8668041519541685F, -0.4098033003787853F, 0.0F);
        this.clawR1 = new ModelRenderer(this, 57, 23);
        this.clawR1.setRotationPoint(1.2F, 6.1F, -0.5F);
        this.clawR1.addBox(-0.5F, -1.0F, -0.9F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(clawR1, -0.9105382388075086F, -0.13665927909957545F, -0.2275909337942703F);
        this.quills6 = new ModelRenderer(this, 57, 25);
        this.quills6.setRotationPoint(0.0F, -3.5F, 5.0F);
        this.quills6.addBox(0.0F, -5.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(quills6, -0.08726646259971647F, 0.0F, 0.0F);
        this.quills7 = new ModelRenderer(this, 57, 25);
        this.quills7.setRotationPoint(0.01F, -3.5F, 5.0F);
        this.quills7.addBox(0.0F, -5.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(quills7, -0.08726646259971647F, 0.0F, 0.0F);
        this.arm2L = new ModelRenderer(this, 79, 23);
        this.arm2L.setRotationPoint(1.0F, 4.0F, 0.0F);
        this.arm2L.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, -0.1F, 0.0F, -0.1F);
        this.setRotateAngle(arm2L, -1.6845917354353828F, 0.4098033003787853F, 0.0F);
        this.head = new ModelRenderer(this, 0, 47);
        this.head.setRotationPoint(0.0F, -0.1F, -4.0F);
        this.head.addBox(-2.5F, -3.0F, -7.0F, 5.0F, 3.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.18203784630933073F, 0.0F, 0.0F);
        this.tail10 = new ModelRenderer(this, 125, 45);
        this.tail10.setRotationPoint(-0.0F, -0.0F, 7.0F);
        this.tail10.addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 8.0F, -0.3F, -0.3F, 0.0F);
        this.neck2 = new ModelRenderer(this, 0, 35);
        this.neck2.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.neck2.addBox(-3.0F, -3.0F, -5.0F, 6.0F, 6.0F, 5.0F, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.13665927909957545F, 0.0F, 0.0F);
        this.eye3R = new ModelRenderer(this, 14, 65);
        this.eye3R.mirror = true;
        this.eye3R.setRotationPoint(-2.2F, -2.2F, -1.1F);
        this.eye3R.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(eye3R, 0.0F, -0.3186971254089062F, 0.0F);
        this.clawR2 = new ModelRenderer(this, 57, 23);
        this.clawR2.setRotationPoint(0.0F, 6.2F, -0.8F);
        this.clawR2.addBox(-0.5F, -0.7F, -0.8F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(clawR2, -0.9105382388075086F, 0.0F, 0.0F);
        this.clawL1 = new ModelRenderer(this, 57, 23);
        this.clawL1.setRotationPoint(-1.2F, 5.8F, 0.0F);
        this.clawL1.addBox(-0.5F, -1.0F, -0.9F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(clawL1, -0.9105382388075086F, 0.13665927909957545F, 0.2275909337942703F);
        this.spike4L = new ModelRenderer(this, 102, 19);
        this.spike4L.setRotationPoint(1.0F, 0.0F, 4.0F);
        this.spike4L.addBox(0.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(spike4L, 0.0F, -0.7853981633974483F, 0.0F);
        this.eye3L = new ModelRenderer(this, 14, 65);
        this.eye3L.setRotationPoint(2.2F, -2.2F, -1.1F);
        this.eye3L.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(eye3L, 0.0F, 0.3186971254089062F, 0.0F);
        this.quills5 = new ModelRenderer(this, 74, 23);
        this.quills5.setRotationPoint(0.01F, -4.0F, 5.0F);
        this.quills5.addBox(0.0F, -5.0F, -5.0F, 0.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(quills5, -0.08726646259971647F, 0.0F, 0.0F);
        this.spike3R = new ModelRenderer(this, 102, 19);
        this.spike3R.setRotationPoint(-1.5F, 0.0F, 4.0F);
        this.spike3R.addBox(-3.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(spike3R, 0.0F, 0.7853981633974483F, 0.0F);
        this.nose = new ModelRenderer(this, 0, 58);
        this.nose.setRotationPoint(0.0F, -1.0F, -6.4F);
        this.nose.addBox(-2.0F, -1.5F, -1.5F, 4.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(nose, -0.4363323129985824F, 0.0F, 0.0F);
        this.clawL2 = new ModelRenderer(this, 57, 23);
        this.clawL2.setRotationPoint(-0.3F, 6.1F, -0.5F);
        this.clawL2.addBox(-0.5F, -0.9F, -0.9F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(clawL2, -0.9105382388075086F, 0.0F, 0.0F);
        this.tail1 = new ModelRenderer(this, 84, 0);
        this.tail1.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail1.addBox(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, -0.27314402127920984F, 0.0F, 0.0F);
        this.jaw = new ModelRenderer(this, 0, 64);
        this.jaw.setRotationPoint(0.0F, 0.5F, -1.0F);
        this.jaw.addBox(-1.5F, 0.0F, -6.0F, 3.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.horn2L = new ModelRenderer(this, 16, 78);
        this.horn2L.setRotationPoint(0.0F, -0.2F, 3.5F);
        this.horn2L.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(horn2L, 0.18203784630933073F, 0.2275909337942703F, 0.0F);
        this.spike3L = new ModelRenderer(this, 102, 19);
        this.spike3L.setRotationPoint(1.5F, 0.0F, 4.0F);
        this.spike3L.addBox(0.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(spike3L, 0.0F, -0.7853981633974483F, 0.0F);
        this.eye1L = new ModelRenderer(this, 14, 65);
        this.eye1L.setRotationPoint(2.2F, -1.7F, -5.0F);
        this.eye1L.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(eye1L, 0.0F, 0.3186971254089062F, 0.0F);
        this.spike1L = new ModelRenderer(this, 102, 19);
        this.spike1L.setRotationPoint(2.0F, 0.0F, 4.0F);
        this.spike1L.addBox(0.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(spike1L, 0.0F, -0.7853981633974483F, 0.0F);
        this.tail14 = new ModelRenderer(this, 129, 70);
        this.tail14.setRotationPoint(-0.0F, -0.0F, 7.0F);
        this.tail14.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 8.0F, -0.3F, -0.3F, 0.0F);
        this.quills9 = new ModelRenderer(this, 57, 25);
        this.quills9.setRotationPoint(0.01F, -1.5F, 4.5F);
        this.quills9.addBox(0.0F, -5.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(quills9, -0.08726646259971647F, 0.0F, 0.0F);
        this.quills3 = new ModelRenderer(this, 100, 20);
        this.quills3.setRotationPoint(0.0F, -2.5F, -2.0F);
        this.quills3.addBox(0.0F, -4.0F, -3.0F, 0.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(quills3, -0.08726646259971647F, 0.0F, 0.0F);
        this.tail3 = new ModelRenderer(this, 117, 0);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tail3.addBox(-3.5F, -3.5F, 0.0F, 7.0F, 7.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.quills8 = new ModelRenderer(this, 57, 25);
        this.quills8.setRotationPoint(0.0F, -1.5F, 4.5F);
        this.quills8.addBox(0.0F, -5.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(quills8, -0.08726646259971647F, 0.0F, 0.0F);
        this.wing2R = new ModelRenderer(this, 40, 22);
        this.wing2R.setRotationPoint(0.0F, 10.5F, 0.0F);
        this.wing2R.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 22.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(wing2R, -0.3490658503988659F, 0.0F, -1.639038764463741F);
        this.quills2 = new ModelRenderer(this, 100, 20);
        this.quills2.setRotationPoint(0.01F, -2.5F, -2.0F);
        this.quills2.addBox(0.0F, -4.0F, -3.0F, 0.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(quills2, -0.08726646259971647F, 0.0F, 0.0F);
        this.tail7 = new ModelRenderer(this, 123, 31);
        this.tail7.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail7.addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail7, 0.04555309164612875F, 0.0F, 0.0F);
        this.spike6L = new ModelRenderer(this, 102, 19);
        this.spike6L.setRotationPoint(0.5F, 0.0F, 4.0F);
        this.spike6L.addBox(0.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(spike6L, 0.0F, -0.7853981633974483F, 0.0F);
        this.neck3 = new ModelRenderer(this, 0, 35);
        this.neck3.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.neck3.addBox(-3.0F, -3.0F, -5.0F, 6.0F, 6.0F, 5.0F, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(neck3, -0.3186971254089062F, 0.0F, 0.0F);
        this.tail13 = new ModelRenderer(this, 129, 70);
        this.tail13.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail13.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.wing1R = new ModelRenderer(this, 27, 22);
        this.wing1R.mirror = true;
        this.wing1R.setRotationPoint(-3.7F, -3.0F, 3.0F);
        this.wing1R.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 12.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(wing1R, 0.3490658503988659F, 0.0F, 2.0943951023931953F);
        this.wing2L = new ModelRenderer(this, 40, 22);
        this.wing2L.mirror = true;
        this.wing2L.setRotationPoint(0.0F, 10.5F, 0.0F);
        this.wing2L.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 22.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(wing2L, -0.3490658503988659F, 0.0F, 1.639038764463741F);
        this.tail6 = new ModelRenderer(this, 121, 16);
        this.tail6.setRotationPoint(-0.0F, -0.0F, 6.5F);
        this.tail6.addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 8.0F, -0.3F, -0.3F, 0.0F);
        this.setRotateAngle(tail6, 0.2275909337942703F, 0.0F, 0.0F);
        this.tail9 = new ModelRenderer(this, 125, 45);
        this.tail9.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail9.addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.chin = new ModelRenderer(this, 13, 58);
        this.chin.setRotationPoint(0.0F, 0.5F, -6.0F);
        this.chin.addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(chin, -0.6318092025377527F, 0.0F, 0.0F);
        this.neck4 = new ModelRenderer(this, 0, 35);
        this.neck4.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.neck4.addBox(-3.0F, -3.0F, -5.0F, 6.0F, 6.0F, 5.0F, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(neck4, 0.27960175415897487F, 0.0F, 0.0F);
        this.tail8 = new ModelRenderer(this, 123, 31);
        this.tail8.setRotationPoint(-0.0F, -0.0F, 7.0F);
        this.tail8.addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 8.0F, -0.3F, -0.3F, 0.0F);
        this.setRotateAngle(tail8, 0.04555309164612875F, 0.0F, 0.0F);
        this.palmR = new ModelRenderer(this, 25, 38);
        this.palmR.setRotationPoint(0.0F, 21.0F, 0.0F);
        this.palmR.addBox(-2.0F, 0.0F, -1.5F, 4.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(palmR, -0.3186971254089062F, 0.0F, -0.500909508638178F);
        this.arm1R = new ModelRenderer(this, 70, 23);
        this.arm1R.setRotationPoint(-4.0F, 1.7F, -2.0F);
        this.arm1R.addBox(-2.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(arm1R, 0.5462880425584197F, 0.0F, 0.45535640450848164F);
        this.spike2R = new ModelRenderer(this, 102, 19);
        this.spike2R.setRotationPoint(-1.5F, 0.0F, 4.0F);
        this.spike2R.addBox(-3.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(spike2R, 0.0F, 0.7853981633974483F, 0.0F);
        this.neck5 = new ModelRenderer(this, 0, 35);
        this.neck5.setRotationPoint(-0.0F, -0.0F, -3.5F);
        this.neck5.addBox(-3.0F, -3.0F, -5.0F, 6.0F, 6.0F, 5.0F, -0.6F, 0.0F, 0.0F);
        this.setRotateAngle(neck5, 0.27960175415897487F, 0.0F, 0.0F);
        this.clawR3 = new ModelRenderer(this, 57, 23);
        this.clawR3.setRotationPoint(-1.2F, 6.1F, -0.5F);
        this.clawR3.addBox(-0.5F, -0.7F, -0.9F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(clawR3, -0.9105382388075086F, 0.13665927909957545F, 0.2275909337942703F);
        this.quills1 = new ModelRenderer(this, 100, 20);
        this.quills1.setRotationPoint(0.0F, -2.5F, -2.0F);
        this.quills1.addBox(0.0F, -4.0F, -3.0F, 0.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(quills1, -0.08726646259971647F, 0.0F, 0.0F);
        this.cheekL = new ModelRenderer(this, 0, 73);
        this.cheekL.setRotationPoint(2.3F, 1.0F, 0.0F);
        this.cheekL.addBox(-0.5F, -2.0F, -6.0F, 1.0F, 3.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(cheekL, 0.0F, 0.0911061832922575F, 0.3642502295386026F);
        this.spike1R = new ModelRenderer(this, 102, 19);
        this.spike1R.setRotationPoint(-2.0F, 0.0F, 4.0F);
        this.spike1R.addBox(-3.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(spike1R, 0.0F, 0.7853981633974483F, 0.0F);
        this.eye2L = new ModelRenderer(this, 14, 65);
        this.eye2L.setRotationPoint(2.2F, -1.9F, -3.1F);
        this.eye2L.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(eye2L, 0.0F, 0.3186971254089062F, 0.0F);
        this.body1 = new ModelRenderer(this, 0, 0);
        this.body1.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.body1.addBox(-5.0F, -4.5F, -6.0F, 10.0F, 9.0F, 12.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body1, 0.13665927909957545F, 0.0F, 0.0F);
        this.tail11 = new ModelRenderer(this, 127, 58);
        this.tail11.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail11.addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.quills4 = new ModelRenderer(this, 95, 20);
        this.quills4.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.quills4.addBox(0.0F, -5.0F, -6.0F, 0.0F, 5.0F, 12.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(quills4, -0.08726646259971647F, 0.0F, 0.0F);
        this.neck4_1 = new ModelRenderer(this, 0, 35);
        this.neck4_1.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.neck4_1.addBox(-3.0F, -3.0F, -5.0F, 6.0F, 6.0F, 5.0F, -0.5F, 0.0F, 0.0F);
        this.setRotateAngle(neck4_1, 0.43598323915870024F, 0.0F, 0.0F);
        this.horn1R = new ModelRenderer(this, 16, 71);
        this.horn1R.mirror = true;
        this.horn1R.setRotationPoint(-1.8F, -2.0F, -1.2F);
        this.horn1R.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(horn1R, 0.18203784630933073F, -0.18203784630933073F, 0.0F);
        this.palmL = new ModelRenderer(this, 25, 38);
        this.palmL.setRotationPoint(0.0F, 21.0F, 0.0F);
        this.palmL.addBox(-2.0F, 0.0F, -1.5F, 4.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(palmL, -0.3186971254089062F, 0.0F, 0.500909508638178F);
        this.clawL3 = new ModelRenderer(this, 57, 23);
        this.clawL3.setRotationPoint(1.2F, 6.1F, -0.5F);
        this.clawL3.addBox(-0.5F, -1.0F, -0.9F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(clawL3, -0.9105382388075086F, -0.13665927909957545F, -0.2275909337942703F);
        this.tail12 = new ModelRenderer(this, 127, 58);
        this.tail12.setRotationPoint(-0.0F, -0.0F, 7.0F);
        this.tail12.addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, -0.3F, -0.3F, 0.0F);
        this.spike6R = new ModelRenderer(this, 102, 19);
        this.spike6R.setRotationPoint(-0.5F, 0.0F, 4.0F);
        this.spike6R.addBox(-3.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(spike6R, 0.0F, 0.7853981633974483F, 0.0F);
        this.cheekR = new ModelRenderer(this, 0, 73);
        this.cheekR.mirror = true;
        this.cheekR.setRotationPoint(-2.3F, 1.0F, 0.0F);
        this.cheekR.addBox(-0.5F, -2.0F, -6.0F, 1.0F, 3.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(cheekR, 0.0F, -0.0911061832922575F, -0.3642502295386026F);
        this.arm1L = new ModelRenderer(this, 70, 23);
        this.arm1L.setRotationPoint(4.0F, 1.7F, -2.0F);
        this.arm1L.addBox(0.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(arm1L, 0.5462880425584197F, 0.0F, -0.45535640450848164F);
        this.spike2L = new ModelRenderer(this, 102, 19);
        this.spike2L.setRotationPoint(1.5F, 0.0F, 4.0F);
        this.spike2L.addBox(0.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(spike2L, 0.0F, -0.7853981633974483F, 0.0F);
        this.tail5 = new ModelRenderer(this, 121, 16);
        this.tail5.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tail5.addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.eye1R = new ModelRenderer(this, 14, 65);
        this.eye1R.mirror = true;
        this.eye1R.setRotationPoint(-2.2F, -1.7F, -5.0F);
        this.eye1R.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(eye1R, 0.0F, -0.3186971254089062F, 0.0F);
        this.horn2R = new ModelRenderer(this, 16, 78);
        this.horn2R.mirror = true;
        this.horn2R.setRotationPoint(0.0F, -0.2F, 3.5F);
        this.horn2R.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(horn2R, 0.18203784630933073F, -0.2275909337942703F, 0.0F);
        this.body2 = new ModelRenderer(this, 45, 0);
        this.body2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body2.addBox(-4.5F, -4.5F, 0.0F, 9.0F, 9.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, -0.18203784630933073F, 0.0F, 0.0F);
        this.spike7R = new ModelRenderer(this, 102, 19);
        this.spike7R.setRotationPoint(-0.5F, 0.0F, 4.0F);
        this.spike7R.addBox(-3.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(spike7R, 0.0F, 0.7853981633974483F, 0.0F);
        this.wing1L = new ModelRenderer(this, 27, 22);
        this.wing1L.setRotationPoint(3.7F, -3.0F, 3.0F);
        this.wing1L.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 12.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(wing1L, 0.3490658503988659F, 0.0F, -2.0943951023931953F);
        this.eye2R = new ModelRenderer(this, 14, 65);
        this.eye2R.mirror = true;
        this.eye2R.setRotationPoint(-2.2F, -1.9F, -3.1F);
        this.eye2R.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(eye2R, 0.0F, -0.3186971254089062F, 0.0F);
        this.spikeR = new ModelRenderer(this, 88, 23);
        this.spikeR.setRotationPoint(0.0F, 5.5F, 0.0F);
        this.spikeR.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 8.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(spikeR, 1.8668041519541685F, 0.4098033003787853F, 0.0F);
        this.quills1_1 = new ModelRenderer(this, 100, 20);
        this.quills1_1.setRotationPoint(0.0F, -2.5F, -2.0F);
        this.quills1_1.addBox(0.0F, -4.0F, -3.0F, 0.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(quills1_1, -0.08726646259971647F, 0.0F, 0.0F);
        this.tail4 = new ModelRenderer(this, 117, 0);
        this.tail4.setRotationPoint(-0.0F, -0.0F, 6.5F);
        this.tail4.addBox(-3.5F, -3.5F, 0.0F, 7.0F, 7.0F, 8.0F, -0.3F, -0.3F, 0.0F);
        this.spike4R = new ModelRenderer(this, 102, 19);
        this.spike4R.setRotationPoint(-1.0F, 0.0F, 4.0F);
        this.spike4R.addBox(-3.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(spike4R, 0.0F, 0.7853981633974483F, 0.0F);
        this.horn1L = new ModelRenderer(this, 16, 71);
        this.horn1L.setRotationPoint(1.8F, -2.0F, -1.2F);
        this.horn1L.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(horn1L, 0.18203784630933073F, 0.18203784630933073F, 0.0F);
        this.spike5L = new ModelRenderer(this, 102, 19);
        this.spike5L.setRotationPoint(1.0F, 0.0F, 4.0F);
        this.spike5L.addBox(0.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(spike5L, 0.0F, -0.7853981633974483F, 0.0F);
        this.neck1 = new ModelRenderer(this, 0, 22);
        this.neck1.setRotationPoint(0.0F, -0.3F, -4.0F);
        this.neck1.addBox(-3.5F, -3.5F, -5.0F, 7.0F, 7.0F, 5.0F, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(neck1, -0.500909508638178F, 0.0F, 0.0F);
        this.arm2R = new ModelRenderer(this, 79, 23);
        this.arm2R.setRotationPoint(-1.0F, 4.0F, 0.0F);
        this.arm2R.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, -0.1F, 0.0F, -0.1F);
        this.setRotateAngle(arm2R, -1.6845917354353828F, -0.4098033003787853F, 0.0F);
        this.tail12.addChild(this.spike5R);
        this.tail14.addChild(this.spike7L);
        this.tail1.addChild(this.tail2);
        this.arm2L.addChild(this.spikeL);
        this.palmR.addChild(this.clawR1);
        this.tail1.addChild(this.quills6);
        this.tail2.addChild(this.quills7);
        this.arm1L.addChild(this.arm2L);
        this.neck5.addChild(this.head);
        this.tail9.addChild(this.tail10);
        this.neck1.addChild(this.neck2);
        this.head.addChild(this.eye3R);
        this.palmR.addChild(this.clawR2);
        this.palmL.addChild(this.clawL1);
        this.tail11.addChild(this.spike4L);
        this.head.addChild(this.eye3L);
        this.body2.addChild(this.quills5);
        this.tail10.addChild(this.spike3R);
        this.head.addChild(this.nose);
        this.palmL.addChild(this.clawL2);
        this.body2.addChild(this.tail1);
        this.head.addChild(this.jaw);
        this.horn1L.addChild(this.horn2L);
        this.tail10.addChild(this.spike3L);
        this.head.addChild(this.eye1L);
        this.tail8.addChild(this.spike1L);
        this.tail13.addChild(this.tail14);
        this.tail10.addChild(this.quills9);
        this.neck2.addChild(this.quills3);
        this.tail2.addChild(this.tail3);
        this.tail9.addChild(this.quills8);
        this.wing1R.addChild(this.wing2R);
        this.neck3.addChild(this.quills2);
        this.tail6.addChild(this.tail7);
        this.tail13.addChild(this.spike6L);
        this.neck2.addChild(this.neck3);
        this.tail12.addChild(this.tail13);
        this.body1.addChild(this.wing1R);
        this.wing1L.addChild(this.wing2L);
        this.tail5.addChild(this.tail6);
        this.tail8.addChild(this.tail9);
        this.jaw.addChild(this.chin);
        this.neck3.addChild(this.neck4);
        this.tail7.addChild(this.tail8);
        this.wing2R.addChild(this.palmR);
        this.body1.addChild(this.arm1R);
        this.tail9.addChild(this.spike2R);
        this.neck4_1.addChild(this.neck5);
        this.palmR.addChild(this.clawR3);
        this.neck4.addChild(this.quills1);
        this.jaw.addChild(this.cheekL);
        this.tail8.addChild(this.spike1R);
        this.head.addChild(this.eye2L);
        this.tail10.addChild(this.tail11);
        this.body1.addChild(this.quills4);
        this.neck4.addChild(this.neck4_1);
        this.head.addChild(this.horn1R);
        this.wing2L.addChild(this.palmL);
        this.palmL.addChild(this.clawL3);
        this.tail11.addChild(this.tail12);
        this.tail13.addChild(this.spike6R);
        this.jaw.addChild(this.cheekR);
        this.body1.addChild(this.arm1L);
        this.tail9.addChild(this.spike2L);
        this.tail4.addChild(this.tail5);
        this.head.addChild(this.eye1R);
        this.horn1R.addChild(this.horn2R);
        this.body1.addChild(this.body2);
        this.tail14.addChild(this.spike7R);
        this.body1.addChild(this.wing1L);
        this.head.addChild(this.eye2R);
        this.arm2R.addChild(this.spikeR);
        this.neck4_1.addChild(this.quills1_1);
        this.tail3.addChild(this.tail4);
        this.tail11.addChild(this.spike4R);
        this.head.addChild(this.horn1L);
        this.tail12.addChild(this.spike5L);
        this.body1.addChild(this.neck1);
        this.arm1R.addChild(this.arm2R);
    }

    @Override
    public void render(MatrixStack ms, IVertexBuilder buffer, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha)
    {
        body1.render(ms, buffer, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    @Override
    public void setRotationAngles(OrbwyrmEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
    {

    }
}