package me.reheight.exchant.events;

import me.reheight.exchant.Main;
import me.reheight.exchant.configuration.Languages;
import me.reheight.exchant.configuration.functions.GenConf;
import me.reheight.exchant.utilities.Message;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class AbilityAccess implements Listener {
    Main plugin;
    public AbilityAccess(Main instance) {
        plugin = instance;
    }

    @EventHandler
    public void onEnchantUse(InventoryOpenEvent event) {
        if (!(event.getPlayer() instanceof Player)) return;

        Player player = (Player)event.getPlayer();

        Inventory openedInventory = event.getInventory();

        if (openedInventory == null) return;

        if (GenConf.configuration.getBoolean("allowTables") == false) {
            if (openedInventory.getType().equals(InventoryType.ENCHANTING)) {
                event.setCancelled(true);
                player.sendMessage(Message.cColor(Languages.tablesDisabled));
            }
        }

        if (GenConf.configuration.getBoolean("allowAnvils") == false) {
            if (openedInventory.getType().equals(InventoryType.ANVIL)) {
                event.setCancelled(true);
                player.sendMessage(Message.cColor(Languages.anvilsDisabled));
            }
        }

        if (GenConf.configuration.getBoolean("allowMerchants") == false) {
            if (openedInventory.getType().equals(InventoryType.MERCHANT)) {
                event.setCancelled(true);
                player.sendMessage(Message.cColor(Languages.merchantsDisabled));
            }
        }
    }
}
