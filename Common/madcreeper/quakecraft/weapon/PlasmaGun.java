package madcreeper.quakecraft.weapon;

import madcreeper.quakecraft.ammo.EntityPlasma;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PlasmaGun extends Item 
{

	public PlasmaGun(String texture) 
	{
		setMaxStackSize(1);
		setFull3D();
		setMaxStackSize(maxStackSize);
        setCreativeTab(CreativeTabs.tabCombat);
        setTextureName("madcreeper:" + texture);
	}
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) 
	{
		par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
	    if (!par2World.isRemote)
	    	par2World.spawnEntityInWorld(new EntityPlasma(par2World, (EntityLivingBase)par3EntityPlayer));
	      
	    return par1ItemStack;
	  }

}