package madcreeper.quakecraft.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class modelRocketLauncher extends ModelBase
{
  //fields
    ModelRenderer barrelLeft;
    ModelRenderer barrelRight;
    ModelRenderer barrelUp;
    ModelRenderer barrelDown;
    ModelRenderer barrelUp2;
    ModelRenderer barrelLeft2;
    ModelRenderer barrelRight2;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shap3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shap7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape15;
    ModelRenderer Shape16;
  
  public modelRocketLauncher()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      barrelLeft = new ModelRenderer(this, 0, 0);
      barrelLeft.addBox(0F, 0F, 0F, 1, 2, 16);
      barrelLeft.setRotationPoint(0F, 2F, -5F);
      barrelLeft.setTextureSize(64, 32);
      barrelLeft.mirror = true;
      setRotation(barrelLeft, 0F, 0F, 0F);
      barrelRight = new ModelRenderer(this, 1, 0);
      barrelRight.addBox(0F, 0F, 0F, 1, 2, 16);
      barrelRight.setRotationPoint(-4F, 2F, -5F);
      barrelRight.setTextureSize(64, 32);
      barrelRight.mirror = true;
      setRotation(barrelRight, 0F, 0F, 0F);
      barrelUp = new ModelRenderer(this, 1, 0);
      barrelUp.addBox(0F, 0F, 0F, 3, 1, 12);
      barrelUp.setRotationPoint(-3F, 0F, -5F);
      barrelUp.setTextureSize(64, 32);
      barrelUp.mirror = true;
      setRotation(barrelUp, 0F, 0F, 0F);
      barrelDown = new ModelRenderer(this, 0, 0);
      barrelDown.addBox(0F, 0F, 0F, 3, 1, 16);
      barrelDown.setRotationPoint(-3F, 4F, -5F);
      barrelDown.setTextureSize(64, 32);
      barrelDown.mirror = true;
      setRotation(barrelDown, 0F, 0F, 0F);
      barrelUp2 = new ModelRenderer(this, 0, 0);
      barrelUp2.addBox(0F, 0F, 0F, 1, 1, 12);
      barrelUp2.setRotationPoint(-2F, -0.6F, -5F);
      barrelUp2.setTextureSize(64, 32);
      barrelUp2.mirror = true;
      setRotation(barrelUp2, 0F, 0F, 0F);
      barrelLeft2 = new ModelRenderer(this, 0, 0);
      barrelLeft2.addBox(0F, 0F, 0F, 1, 1, 2);
      barrelLeft2.setRotationPoint(0.7F, 2F, 9F);
      barrelLeft2.setTextureSize(64, 32);
      barrelLeft2.mirror = true;
      setRotation(barrelLeft2, 0F, 0F, 0F);
      barrelRight2 = new ModelRenderer(this, 0, 0);
      barrelRight2.addBox(0F, 0F, 0F, 1, 1, 2);
      barrelRight2.setRotationPoint(-4.7F, 2F, 9F);
      barrelRight2.setTextureSize(64, 32);
      barrelRight2.mirror = true;
      setRotation(barrelRight2, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 2, 2, 9);
      Shape1.setRotationPoint(-2.5F, 5F, 2F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(0F, 0F, -3F, 2, 1, 14);
      Shape2.setRotationPoint(-2.5F, 5F, -9F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 0);
      Shape3.addBox(0F, 0F, 0F, 3, 1, 1);
      Shape3.setRotationPoint(-3F, 0F, 8F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shap3 = new ModelRenderer(this, 0, 0);
      Shap3.addBox(0F, 0F, 0F, 3, 1, 1);
      Shap3.setRotationPoint(-3F, 0F, 10F);
      Shap3.setTextureSize(64, 32);
      Shap3.mirror = true;
      setRotation(Shap3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 0, 0);
      Shape4.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape4.setRotationPoint(-2F, -0.7F, 8F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 0, 0);
      Shape5.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape5.setRotationPoint(-2F, -0.7F, 10F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 0, 0);
      Shape6.addBox(0F, 0F, 0F, 1, 1, 12);
      Shape6.setRotationPoint(0F, 1F, -5F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 0, 0);
      Shape7.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape7.setRotationPoint(0F, 1F, 8F);
      Shape7.setTextureSize(64, 32);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shap7 = new ModelRenderer(this, 0, 0);
      Shap7.addBox(0F, 0F, 0F, 1, 1, 1);
      Shap7.setRotationPoint(0F, 1F, 10F);
      Shap7.setTextureSize(64, 32);
      Shap7.mirror = true;
      setRotation(Shap7, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 0, 0);
      Shape8.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape8.setRotationPoint(-4F, 1F, 10F);
      Shape8.setTextureSize(64, 32);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 38, 0);
      Shape9.addBox(0F, 0F, 0F, 6, 6, 7);
      Shape9.setRotationPoint(-4.5F, -0.5F, -12F);
      Shape9.setTextureSize(64, 32);
      Shape9.mirror = true;
      setRotation(Shape9, 0F, 0F, 0F);
      Shape10 = new ModelRenderer(this, 40, 0);
      Shape10.addBox(0F, 0F, 0F, 5, 8, 7);
      Shape10.setRotationPoint(-4F, 1F, -19F);
      Shape10.setTextureSize(64, 32);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, 0F);
      Shape11 = new ModelRenderer(this, 46, 0);
      Shape11.addBox(0F, 0F, 0F, 5, 6, 4);
      Shape11.setRotationPoint(-4F, -1F, -23F);
      Shape11.setTextureSize(64, 32);
      Shape11.mirror = true;
      setRotation(Shape11, 0F, 0F, 0F);
      Shape12 = new ModelRenderer(this, 0, 0);
      Shape12.addBox(0F, 0F, 0F, 2, 5, 2);
      Shape12.setRotationPoint(-2.5F, 4F, -21.5F);
      Shape12.setTextureSize(64, 32);
      Shape12.mirror = true;
      setRotation(Shape12, -0.4461433F, 0F, 0F);
      Shape13 = new ModelRenderer(this, 0, 0);
      Shape13.addBox(0F, 0F, 0F, 3, 1, 7);
      Shape13.setRotationPoint(-3F, 0F, -19F);
      Shape13.setTextureSize(64, 32);
      Shape13.mirror = true;
      setRotation(Shape13, 0F, 0F, 0F);
      Shape14 = new ModelRenderer(this, 2, 0);
      Shape14.addBox(0F, 0F, 0F, 3, 3, 5);
      Shape14.setRotationPoint(-3F, -3F, -10F);
      Shape14.setTextureSize(64, 32);
      Shape14.mirror = true;
      setRotation(Shape14, -0.5576792F, 0F, 0F);
      Shape15 = new ModelRenderer(this, 0, 0);
      Shape15.addBox(0F, 0F, 0F, 1, 1, 12);
      Shape15.setRotationPoint(-4F, 1F, -5F);
      Shape15.setTextureSize(64, 32);
      Shape15.mirror = true;
      setRotation(Shape15, 0F, 0F, 0F);
      Shape16 = new ModelRenderer(this, 0, 0);
      Shape16.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape16.setRotationPoint(-4F, 1F, 8F);
      Shape16.setTextureSize(64, 32);
      Shape16.mirror = true;
      setRotation(Shape16, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    barrelLeft.render(f5);
    barrelRight.render(f5);
    barrelUp.render(f5);
    barrelDown.render(f5);
    barrelUp2.render(f5);
    barrelLeft2.render(f5);
    barrelRight2.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shap3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shap7.render(f5);
    Shape8.render(f5);
    Shape9.render(f5);
    Shape10.render(f5);
    Shape11.render(f5);
    Shape12.render(f5);
    Shape13.render(f5);
    Shape14.render(f5);
    Shape15.render(f5);
    Shape16.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity ent)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, ent);
	}

}
