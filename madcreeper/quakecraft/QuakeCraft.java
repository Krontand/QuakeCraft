package madcreeper.quakecraft;

import madcreeper.quakecraft.client.Hammer3D;
import madcreeper.quakecraft.client.PlasmaGun3D;
import madcreeper.quakecraft.client.RocketLauncher3D;
import madcreeper.quakecraft.render.QCModelPlayerBase;
import madcreeper.quakecraft.render.QCRenderPlayerBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import api.player.model.ModelPlayerAPI;
import api.player.render.RenderPlayerAPI;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="QuakeCraftID", name="QuakeCraft from MadCreeper", version="0.1 aplha")
@NetworkMod(clientSideRequired=true)
public class QuakeCraft {
	
    @Instance(value = "QuakeCraftID")
    public static QuakeCraft instance;
    public static Item itemHammer;
    public static Item itemRocketLauncher;
    public static Item itemPlasmaGun;
    
    @SidedProxy(clientSide="madcreeper.quakecraft.client.ClientProxy", serverSide="madcreeper.quakecraft.CommonProxy")
    public static CommonProxy proxy;
        
    public void ModsLoaded() {
    	RenderPlayerAPI.register("MyModId", QCRenderPlayerBase.class);
    	ModelPlayerAPI.register("MyModId", QCModelPlayerBase.class);
    }
    
    @EventHandler
    public void modInit(FMLInitializationEvent event) {
 
    MinecraftForgeClient.registerItemRenderer(itemPlasmaGun.itemID , (IItemRenderer)new PlasmaGun3D());
	MinecraftForgeClient.registerItemRenderer(itemHammer.itemID , (IItemRenderer)new Hammer3D());
	MinecraftForgeClient.registerItemRenderer(itemRocketLauncher.itemID , (IItemRenderer)new RocketLauncher3D());
	
    }
        
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	itemHammer = new QWeapon(5000, "itemHammer", "testWeapon").setFull3D().setMaxDamage(200);
    	itemRocketLauncher = new QWeapon(5001, "rocketLauncher", "RocketLauncher").setFull3D();
    	itemPlasmaGun = new QWeapon(5002, "plasmaGun", "PlasmaGun").setFull3D();
    }
        
    @EventHandler
    public void load(FMLInitializationEvent event) {
    	LanguageRegistry.addName(itemHammer, "MadWeapon");
    	LanguageRegistry.addName(itemRocketLauncher, "Rocket Launcher");
    	LanguageRegistry.addName(itemPlasmaGun, "Plasma Gun");
    	
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	// Stub Method
    }
}