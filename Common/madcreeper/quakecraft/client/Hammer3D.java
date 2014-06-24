package madcreeper.quakecraft.client;

import madcreeper.quakecraft.model.HammerModel;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

public class Hammer3D implements IItemRenderer 
{
	
	protected HammerModel modelHammer;
	
	public Hammer3D() 
	{
		modelHammer = new HammerModel();
	}
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type)
	{
		switch(type) {
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
					GL11.glRotatef(-120, 0F, 0F, 1F);
					GL11.glRotatef(-90, 0F, 1F, 0F);
					GL11.glTranslatef(0F, -1.1F, 0.4F);
					Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("/assets/madcreeper/textures/items/texture.png"));
					modelHammer.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0925F);
					GL11.glPopMatrix();
				}
				case EQUIPPED_FIRST_PERSON: 
				{
					GL11.glPushMatrix();
					GL11.glRotatef(-120, 0F, 0F, 1F);
					GL11.glRotatef(-90, 0F, 1F, 0F);
					GL11.glTranslatef(0F, -1.1F, 0.4F);
					Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("/assets/madcreeper/textures/items/texture.png"));
					modelHammer.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0925F);
					GL11.glPopMatrix();
				}
				case ENTITY: 
				{
					GL11.glPushMatrix();
					GL11.glRotatef(-120, 0F, 0F, 1F);
					GL11.glRotatef(-90, 0F, 1F, 0F);
					GL11.glTranslatef(0F, -1.1F, 0.4F);
					Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("/assets/madcreeper/textures/items/texture.png"));
					modelHammer.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0925F);
					GL11.glPopMatrix();
				}
				default: {};
			}
		}
	}