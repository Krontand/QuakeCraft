package madcreeper.quakecraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class QWeapon extends Item 
{

	public QWeapon(String texture) 
	{
		setMaxStackSize(1);
		setFull3D();
		setMaxStackSize(maxStackSize);
        setCreativeTab(CreativeTabs.tabCombat);
        setTextureName("madcreeper:" + texture);
	}

}

