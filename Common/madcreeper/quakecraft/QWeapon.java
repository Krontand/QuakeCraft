package madcreeper.quakecraft;

import net.minecraft.item.Item;

public class QWeapon extends Item 
{

	public QWeapon(String texture) 
	{
		setMaxStackSize(1);
		setFull3D();
		setMaxStackSize(maxStackSize);
        setCreativeTab(QuakeCraft.tabQCraft);
        setTextureName("madcreeper:" + texture);
        setUnlocalizedName(texture);
	}

}

