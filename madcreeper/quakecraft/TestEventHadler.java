package madcreeper.quakecraft;

import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class TestEventHadler {

	@ForgeSubscribe
	public void onClick(PlayerInteractEvent event) {
		event.entityPlayer.addChatMessage("PlayerInteractEvent");
		if (event.action.equals(PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK)) {
			event.entityPlayer.addChatMessage("RIGHT_CLICK_BLOCK");
		ItemStack usingItem = event.entityPlayer.getCurrentEquippedItem();
			if (usingItem != null) {
			event.entityPlayer.addChatMessage(Integer.toString(usingItem.itemID));

			}
		}
	}
	
	

}
