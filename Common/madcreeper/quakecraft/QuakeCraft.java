package madcreeper.quakecraft;

import madcreeper.quakecraft.ammo.EntityPlasma;
import madcreeper.quakecraft.ammo.EntityRocket;
import madcreeper.quakecraft.client.Hammer3D;
import madcreeper.quakecraft.client.PlasmaGun3D;
import madcreeper.quakecraft.client.RocketLauncher3D;
import madcreeper.quakecraft.weapon.PlasmaGun;
import madcreeper.quakecraft.weapon.RocketLauncher;
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
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid="QuakeCraftID", name="QuakeCraft from MadCreeper", version="0.1 aplha")
public class QuakeCraft 
{
	
    @Instance(value = "QuakeCraftID")
    public static QuakeCraft instance;
    public static Item itemHammer;
    public static Item itemRocketLauncher;
    public static Item itemPlasmaGun;
    public static CreativeTabs tabQCraft = new CreativeTabs("tabQCraft") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return itemRocketLauncher;
        }
    };
    
    @SidedProxy(clientSide="madcreeper.quakecraft.client.ClientProxy", serverSide="madcreeper.quakecraft.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void modInit(FMLInitializationEvent event) 
    {
    	MinecraftForgeClient.registerItemRenderer(itemPlasmaGun, (IItemRenderer)new PlasmaGun3D());
    	MinecraftForgeClient.registerItemRenderer(itemHammer, (IItemRenderer)new Hammer3D());
    	MinecraftForgeClient.registerItemRenderer(itemRocketLauncher, (IItemRenderer)new RocketLauncher3D());
    }
        
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) 
    {
    	itemHammer = new QWeapon("itemHammer");
        GameRegistry.registerItem(itemHammer, "Hammer");

        itemRocketLauncher = new RocketLauncher("itemRocketLauncher");
        GameRegistry.registerItem(itemRocketLauncher, "rocketLauncher");
        EntityRegistry.registerModEntity(EntityRocket.class, "Rocket", 2, instance, 160, 1, false);

        itemPlasmaGun = new PlasmaGun("itemPlasmaGun");
        GameRegistry.registerItem(itemPlasmaGun, "plasmaGun");
        EntityRegistry.registerModEntity(EntityPlasma.class, "Plasma", 3, instance, 160, 1, false);
    }
        
    @EventHandler
    public void load(FMLInitializationEvent event) 
    {

    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) 
    {
    	// Stub Method
    }
}