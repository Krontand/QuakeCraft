package madcreeper.quakecraft;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class QWeapon extends Item {

	public QWeapon(int id, String texture, String name) {
		super(id);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabCombat);
		setUnlocalizedName(name);
		setTextureName("madcreeper:" + texture);
	    
	}

	
}

