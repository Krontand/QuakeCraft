package madcreeper.quakecraft.client;

import org.lwjgl.opengl.GL11;

import madcreeper.quakecraft.model.HammerModel;
import madcreeper.quakecraft.model.modelRocketLauncher;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;

public class RocketLauncher3D implements IItemRenderer {
	protected modelRocketLauncher modelRocketLauncher;
	
	public RocketLauncher3D() {
		modelRocketLauncher = new modelRocketLauncher();
	}
	

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		switch(type) {
		case EQUIPPED: return true;
		case EQUIPPED_FIRST_PERSON: return true;
		case ENTITY: return true;
		case INVENTORY: return true;
		default: return false;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		switch (type) {
			case EQUIPPED: {
				GL11.glPushMatrix();
				GL11.glRotatef(0, 0F, 0F, 1F);
				GL11.glRotatef(0, 0F, 1F, 0F);
				GL11.glTranslatef(0F, 0F, 0F);
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("madcreeper","/textures/items/rocketlauncher.png"));
				modelRocketLauncher.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0925F);
				GL11.glPopMatrix();
			}
			case EQUIPPED_FIRST_PERSON: {
				GL11.glPushMatrix();
				GL11.glRotatef(0, 0F, 0F, 1F);
				GL11.glRotatef(0, 0F, 1F, 0F);
				GL11.glTranslatef(0F, 0F, 0F);
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("madcreeper","/textures/items/rocketlauncher.png"));
				modelRocketLauncher.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0925F);
				GL11.glPopMatrix();
			}
			case ENTITY: {
				GL11.glPushMatrix();
				GL11.glRotatef(0, 0F, 0F, 1F);
				GL11.glRotatef(0, 0F, 1F, 0F);
				GL11.glTranslatef(0F, 0F, 0F);
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("madcreeper","/textures/items/rocketlauncher.png"));
				modelRocketLauncher.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0925F);
				GL11.glPopMatrix();
			}
			default: {};
		
			
		}
		
		
	}

}

