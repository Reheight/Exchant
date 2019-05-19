package me.reheight.exchant.inventories;

import me.reheight.exchant.configuration.functions.GenConf;
import me.reheight.exchant.utilities.Message;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class GUI {
    public void openInventory(Player player) {
        String title = GenConf.guiConfiguration.getString("title");
        Inventory GUI = Bukkit.createInventory(null, 27, Message.color(title));

        // Border
        ItemStack border = new ItemStack(Material.STAINED_GLASS_PANE, 1);
        ItemMeta borderMeta = border.getItemMeta();

        String borderName = Message.color(GenConf.guiConfiguration.getString("border.name"));
        borderMeta.setDisplayName(borderName);

        List<String> borderLore = new ArrayList<>();

        for (String s : GenConf.guiConfiguration.getStringList("border.lore")) {
            borderLore.add(Message.color(s));
        }

        borderMeta.setLore(borderLore);
        border.setItemMeta(borderMeta);
        border.setDurability((short) 15);

        // Whitescroll
        ItemStack whitescroll = new ItemStack(Material.PAPER, 1);
        ItemMeta whitescrollMeta = whitescroll.getItemMeta();

        String whitescrollName = Message.color(GenConf.guiConfiguration.getString("whitescroll.name"));
        whitescrollMeta.setDisplayName(whitescrollName);

        List<String> whitescrollLore = new ArrayList<>();

        for (String s : GenConf.guiConfiguration.getStringList("whitescroll.lore")) {
            whitescrollLore.add(Message.color(s));
        }

        whitescrollMeta.setLore(whitescrollLore);
        whitescroll.setItemMeta(whitescrollMeta);

        // Blackscroll
        ItemStack blackscroll = new ItemStack(Material.INK_SACK, 1);
        ItemMeta blackscrollMeta = blackscroll.getItemMeta();

        String blackscrollName = Message.color(GenConf.guiConfiguration.getString("blackscroll.name"));
        blackscrollMeta.setDisplayName(blackscrollName);

        List<String> blackscrollLore = new ArrayList<>();

        for (String s : GenConf.guiConfiguration.getStringList("blackscroll.lore")) {
            blackscrollLore.add(Message.color(s));
        }

        blackscrollMeta.setLore(blackscrollLore);
        blackscroll.setItemMeta(blackscrollMeta);
        
        // Simple Enchantment Book
        ItemStack simplebook = new ItemStack(Material.BOOK, 1);
        ItemMeta simplebookMeta = simplebook.getItemMeta();
        
        String simplebookName = Message.color(GenConf.guiConfiguration.getString("simpleenchantment.name"));
        simplebookMeta.setDisplayName(simplebookName);
        
        List<String> simplebookLore = new ArrayList<>();
        
        for (String s : GenConf.guiConfiguration.getStringList("simpleenchantment.lore")) {
            simplebookLore.add(Message.color(s));
        }
        
        simplebookMeta.setLore(simplebookLore);
        simplebook.setItemMeta(simplebookMeta);

        // Unique Enchantment Book
        ItemStack uniquebook = new ItemStack(Material.BOOK, 1);
        ItemMeta uniquebookMeta = uniquebook.getItemMeta();

        String uniquebookName = Message.color(GenConf.guiConfiguration.getString("uniqueenchantment.name"));
        uniquebookMeta.setDisplayName(uniquebookName);

        List<String> uniquebookLore = new ArrayList<>();

        for (String s : GenConf.guiConfiguration.getStringList("uniqueenchantment.lore")) {
            uniquebookLore.add(Message.color(s));
        }

        uniquebookMeta.setLore(uniquebookLore);
        uniquebook.setItemMeta(uniquebookMeta);
        
        // Elite Enchantment Book
        ItemStack elitebook = new ItemStack(Material.BOOK, 1);
        ItemMeta elitebookMeta = elitebook.getItemMeta();
        
        String elitebookName = Message.color(GenConf.guiConfiguration.getString("eliteenchantment.name"));
        elitebookMeta.setDisplayName(elitebookName);
        
        List<String> elitebookLore = new ArrayList<>();
        
        for (String s : GenConf.guiConfiguration.getStringList("eliteenchantment.lore")) {
            elitebookLore.add(Message.color(s));
        }
        
        elitebookMeta.setLore(elitebookLore);
        elitebook.setItemMeta(elitebookMeta);

        // Ultimate Enchantment Book
        ItemStack ultimatebook = new ItemStack(Material.BOOK, 1);
        ItemMeta ultimatebookMeta = ultimatebook.getItemMeta();

        String ultimatebookName = Message.color(GenConf.guiConfiguration.getString("ultimateenchantment.name"));
        ultimatebookMeta.setDisplayName(ultimatebookName);

        List<String> ultimatebookLore = new ArrayList<>();

        for (String s : GenConf.guiConfiguration.getStringList("ultimateenchantment.lore")) {
            ultimatebookLore.add(Message.color(s));
        }

        ultimatebookMeta.setLore(ultimatebookLore);
        ultimatebook.setItemMeta(ultimatebookMeta);

        // Legendary Enchantment Book
        ItemStack legendarybook = new ItemStack(Material.BOOK, 1);
        ItemMeta legendarybookMeta = legendarybook.getItemMeta();

        String legendarybookName = Message.color(GenConf.guiConfiguration.getString("legendaryenchantment.name"));
        legendarybookMeta.setDisplayName(legendarybookName);

        List<String> legendarybookLore = new ArrayList<>();

        for (String s : GenConf.guiConfiguration.getStringList("legendaryenchantment.lore")) {
            legendarybookLore.add(Message.color(s));
        }

        legendarybookMeta.setLore(legendarybookLore);
        legendarybook.setItemMeta(legendarybookMeta);

        // Setting Inventory
        GUI.setItem(0, border);
        GUI.setItem(1, border);
        GUI.setItem(2, border);
        GUI.setItem(3, border);
        GUI.setItem(4, border);
        GUI.setItem(5, border);
        GUI.setItem(6, border);
        GUI.setItem(7, border);
        GUI.setItem(8, border);
        GUI.setItem(9, border);
        GUI.setItem(10, whitescroll); // Whitescroll
        GUI.setItem(11, simplebook); // Simple
        GUI.setItem(12, uniquebook); // Unique
        GUI.setItem(13, elitebook); // Elite
        GUI.setItem(14, ultimatebook); // Ultimate
        GUI.setItem(15, legendarybook); // Legendary
        GUI.setItem(16, blackscroll); // Blackscroll
        GUI.setItem(17, border);
        GUI.setItem(18, border);
        GUI.setItem(19, border);
        GUI.setItem(20, border);
        GUI.setItem(21, border);
        GUI.setItem(22, border);
        GUI.setItem(23, border);
        GUI.setItem(24, border);
        GUI.setItem(25, border);
        GUI.setItem(26, border);

        player.openInventory(GUI);
    }
}
