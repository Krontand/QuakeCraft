package madcreeper.quakecraft.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import api.player.render.RenderPlayerAPI;
import api.player.render.RenderPlayerBase;

public class QCRenderPlayerBase extends RenderPlayerBase {
	
	
	public QCRenderPlayerBase(RenderPlayerAPI renderplayerapi) {
		super(renderplayerapi);
	}

}
