package me.reheight.exchant.events;

import me.reheight.exchant.Main;
import me.reheight.exchant.configuration.functions.GenConf;
import me.reheight.exchant.utilities.Books;
import me.reheight.exchant.utilities.Message;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;

public class InventorySelectEvent implements Listener {
    Main plugin;
    public InventorySelectEvent(Main instance) {
        plugin = instance;
    }

    @EventHandler
    public void inventorySelectEvent(InventoryClickEvent event) {
        if (event.getCurrentItem() == null) {
            return;
        }

        if (!event.getWhoClicked().getType().equals(EntityType.PLAYER)) return;

        Player player = (Player)event.getWhoClicked();

        String guiTitle = GenConf.guiConfiguration.getString("title");

        InventoryView currentInventory = player.getOpenInventory();
        String openInventoryTitle = currentInventory.getTitle();

        ItemStack clickedItem = event.getCurrentItem();

        if (openInventoryTitle.equals(Message.color(guiTitle))) {
            event.setCancelled(true);

            String borderName = Message.color(GenConf.guiConfiguration.getString("border.name"));
            String whitescrollName = Message.color(GenConf.guiConfiguration.getString("whitescroll.name"));
            String blackscrollName = Message.color(GenConf.guiConfiguration.getString("blackscroll.name"));
            String simplebookName = Message.color(GenConf.guiConfiguration.getString("simpleenchantment.name"));
            String uniquebookName = Message.color(GenConf.guiConfiguration.getString("uniqueenchantment.name"));
            String elitebookName = Message.color(GenConf.guiConfiguration.getString("eliteenchantment.name"));
            String ultimatebookName = Message.color(GenConf.guiConfiguration.getString("ultimateenchantment.name"));
            String legendarybookName = Message.color(GenConf.guiConfiguration.getString("legendaryenchantment.name"));

            String clickedName = clickedItem.getItemMeta().getDisplayName();

            if (clickedName.equals(borderName)) {
                return;
            } else if (clickedName.equals(whitescrollName)) {
                boolean glow = GenConf.itemsConfiguration.getBoolean("whitescroll.glow");
                Books.buyBook(player, Books.whitescroll, glow);
            } else if (clickedName.equals(blackscrollName)) {
                boolean glow = GenConf.itemsConfiguration.getBoolean("blackscroll.glow");
                Books.buyBook(player, Books.blackscroll, glow);
            } else if (clickedName.equals(simplebookName)) {
                boolean glow = GenConf.itemsConfiguration.getBoolean("simple.glow");
                Books.buyBook(player, Books.simple, glow);
            } else if (clickedName.equals(uniquebookName)) {
                boolean glow = GenConf.itemsConfiguration.getBoolean("unique.glow");
                Books.buyBook(player, Books.unique, glow);
            } else if (clickedName.equals(elitebookName)) {
                boolean glow = GenConf.itemsConfiguration.getBoolean("elite.glow");
                Books.buyBook(player, Books.elite, glow);
            } else if (clickedName.equals(ultimatebookName)) {
                boolean glow = GenConf.itemsConfiguration.getBoolean("ultimate.glow");
                Books.buyBook(player, Books.ultimate, glow);
            } else if (clickedName.equals(legendarybookName)) {
                boolean glow = GenConf.itemsConfiguration.getBoolean("legendary.glow");
                Books.buyBook(player, Books.legendary, glow);
            } else {
                return;
            }
        }
    }
}
