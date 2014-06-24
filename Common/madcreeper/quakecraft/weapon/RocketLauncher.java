package madcreeper.quakecraft.weapon;

import madcreeper.quakecraft.QWeapon;
import madcreeper.quakecraft.ammo.EntityRocket;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class RocketLauncher	extends QWeapon 
{

	public RocketLauncher(String texture) 
	{
		super(texture);
	}
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) 
	{
		par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		if (!par2World.isRemote)
			par2World.spawnEntityInWorld(new EntityRocket(par2World, (EntityLivingBase)par3EntityPlayer));
		
		return par1ItemStack;
	}
	
}
