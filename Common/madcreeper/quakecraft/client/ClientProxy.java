package madcreeper.quakecraft.client;

import madcreeper.quakecraft.CommonProxy;
import madcreeper.quakecraft.ammo.EntityPlasma;
import madcreeper.quakecraft.ammo.EntityRocket;
import madcreeper.quakecraft.model.ammo.RocketRenderer;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ClientProxy extends CommonProxy 
{
        
        @Override
        public void registerRenderers() 
        {
        	super.registerRenderers();    
            EntityRegistry.registerGlobalEntityID(EntityRocket.class, "Rocket", 2);
            EntityRegistry.registerGlobalEntityID(EntityPlasma.class, "Plasma", 3);
            RenderingRegistry.registerEntityRenderingHandler(EntityRocket.class, new RocketRenderer());
            RenderingRegistry.registerEntityRenderingHandler(EntityPlasma.class, new RocketRenderer());
        }
        
}