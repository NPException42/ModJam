// Date: 14.12.2013 12:23:53
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package npe.arcade.client;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelArcadeScreen extends ModelBase
{
    //fields
    ModelRenderer Screen;
    private final int scale = 8;

    public ModelArcadeScreen()
    {
        textureWidth = 128 / scale;
        textureHeight = 128 / scale;

        Screen = new ModelRenderer(this, 0, 0);
        Screen.addBox(-6F, -16F, 0F, 12, 16, 0);
        Screen.setRotationPoint(0F, 8F, -2.0F);
        Screen.setTextureSize(128 / scale, 128 / scale);
        Screen.mirror = true;
        setRotation(Screen, -0.5F, 0F, 0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Screen.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
}
