package madcreeper.quakecraft.model.ammo;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class RocketRenderer extends Render 
{

	@Override
	public void doRender(Entity var1, double var2, double var4, double var6,
			float var8, float var9) 
	{
		   GL11.glPushMatrix();
		   GL11.glTranslatef((float)var2, (float)var4, (float)var6);
		   GL11.glEnable(GL12.GL_RESCALE_NORMAL);
		   float f2 = 1.0F;
		   GL11.glScalef(f2 / 1.0F, f2 / 1.0F, f2 / 1.0F);
		   GL11.glRotatef(180.0F - this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
		   GL11.glRotatef(-this.renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
		   GL11.glDisable(GL12.GL_RESCALE_NORMAL);
		   GL11.glPopMatrix();
		
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) 
	{
		// TODO Auto-generated method stub
		return null;
	}

}
