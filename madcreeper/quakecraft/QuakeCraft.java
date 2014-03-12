package madcreeper.quakecraft;

import madcreeper.quakecraft.client.Hammer3D;
import madcreeper.quakecraft.client.RocketLauncher3D;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="MadCreeperTest", name="Test Mod from MadCreeper", version="0.1")
@NetworkMod(clientSideRequired=true)
public class QuakeCraft {
	
	
	// The instance of your mod that Forge uses.
    @Instance(value = "MadModID")
    public static QuakeCraft instance;
    public static Item itemHammer;
    public static Item itemRocketLauncher;

    
  
  	// Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="madcreeper.quakecraft.client.ClientProxy", serverSide="madcreeper.quakecraft.CommonProxy")
    public static CommonProxy proxy;
        
    @EventHandler
    public void modInit(FMLInitializationEvent event) {
    	
	MinecraftForgeClient.registerItemRenderer(madcreeper.quakecraft.QuakeCraft.itemHammer.itemID , (IItemRenderer)new Hammer3D());
	MinecraftForgeClient.registerItemRenderer(madcreeper.quakecraft.QuakeCraft.itemRocketLauncher.itemID , (IItemRenderer)new RocketLauncher3D());
	
    }
        
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	itemHammer = new TestItem(5000, 1, CreativeTabs.tabCombat, "itemHammer", "testWeapon").setFull3D().setMaxDamage(200);
    	itemRocketLauncher = new TestItem(5001, 1, CreativeTabs.tabCombat, "itemRocketLaucner", "rocketLauncher").setFull3D().setMaxDamage(200);
    }
        
    @EventHandler
    public void load(FMLInitializationEvent event) {
    	LanguageRegistry.addName(itemHammer, "MadWeapon");
    	LanguageRegistry.addName(itemRocketLauncher, "Rocket Launcher");
    	
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	// Stub Method
    }
}