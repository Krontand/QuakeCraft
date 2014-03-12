package madcreeper.quakecraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TestItem extends Item {

	public TestItem(int id, int MaxStackSize, CreativeTabs tab, String texture, String name) {
		super(id);
		setMaxStackSize(MaxStackSize);
		setCreativeTab(tab);
		setUnlocalizedName(name);
		setTextureName("madcreeper:" + texture);
		
	}

}
