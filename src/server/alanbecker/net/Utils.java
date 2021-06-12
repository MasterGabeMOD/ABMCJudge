package server.alanbecker.net;

import org.bukkit.ChatColor;
import org.bukkit.inventory.ItemStack;

public class Utils {

	public static String chat (String s) {
		return ChatColor.translateAlternateColorCodes('&', s);
		
		public static ItemStack createItem(Inventory inv, int materialId, int amount, int invSlot, String displayName, String... loreString) {
			ItemStack item;
			List<String> lore = new ArrayList();
			
			item = new ItemStack(Material.getMaterial(materialID), amount);
			
			ItemMeta meta = item.getItemMeta();
			meta.setDisplayName(Utils.chat(displayName));
			for (String = : loreString) {
				lore.add(Utils.chat(s));
				
			}
			meta.setLore(lore);
			item.setItemMeta(meta);
			return item;
		}
	}
	
}
