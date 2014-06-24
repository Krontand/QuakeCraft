package madcreeper.quakecraft.client;

import madcreeper.quakecraft.model.modelRocketLauncher;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

public class RocketLauncher3D implements IItemRenderer 
{
	protected modelRocketLauncher modelRocketLauncher;
	
	public RocketLauncher3D() 
	{
		modelRocketLauncher = new modelRocketLauncher();
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type)
	{
		switch(type) 
		{
		case EQUIPPED: return true;
		case EQUIPPED_FIRST_PERSON: return true;
		case ENTITY: return true;
		default: return false;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) 
	{
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) 
	{
		switch (type) 
		{
			case EQUIPPED: 
			{
					GL11.glPushMatrix();
					GL11.glRotatef(-70, 0F, 0F, 1F);
					GL11.glRotatef(-90, 0F, 1F, 0F);
					GL11.glTranslatef(0.1F, 0.25F, 1.6F);
					Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("madcreeper","/textures/items/rocketlauncher.png"));
					modelRocketLauncher.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.07F);
					GL11.glPopMatrix();
				
			}
			case EQUIPPED_FIRST_PERSON: 
			{
				if(((EntityPlayer)data[1] == Minecraft.getMinecraft().renderViewEntity && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0 && !((Minecraft.getMinecraft().currentScreen instanceof GuiInventory || Minecraft.getMinecraft().currentScreen instanceof GuiContainerCreative) && RenderManager.instance.playerViewY == 180.0F))) 
				{

					GL11.glPushMatrix();
					GL11.glRotatef(90, 0F, 0F, 1F);
					GL11.glRotatef(-90, 0F, 1F, 0F);
					GL11.glRotatef(130, 1F, 0F, 0F);
					GL11.glTranslatef(-0.1F, 0.35F, 1.6F);
					Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("madcreeper","/textures/items/rocketlauncher.png"));
					modelRocketLauncher.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.07F);
					GL11.glPopMatrix();
				}
			}
			case ENTITY: 
			{
				if (data[1] == null || !(data[1] instanceof EntityPlayer)) 
				{
					GL11.glPushMatrix();
					GL11.glRotatef(-180, 0F, 0F, 1F);
					GL11.glTranslatef(0F, -0.5F, 0F);
					Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("madcreeper","/textures/items/rocketlauncher.png"));
					modelRocketLauncher.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.07F);
					GL11.glPopMatrix();
				}
				
			}
			default: {};
		}
	}
}

