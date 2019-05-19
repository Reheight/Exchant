package me.reheight.exchant.utilities;

import me.reheight.exchant.Main;
import me.reheight.exchant.configuration.Languages;
import me.reheight.exchant.configuration.functions.GenConf;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Books {
    public static ItemStack whitescroll = new ItemStack(Material.PAPER, 1);
    public static ItemStack blackscroll = new ItemStack(Material.INK_SACK, 1);
    public static ItemStack simple = new ItemStack(Material.BOOK, 1);
    public static ItemStack unique = new ItemStack(Material.BOOK, 1);
    public static ItemStack elite = new ItemStack(Material.BOOK, 1);
    public static ItemStack ultimate = new ItemStack(Material.BOOK, 1);
    public static ItemStack legendary = new ItemStack(Material.BOOK, 1);

    private static Logger logger = Main.getInstance().getLogger();

    public static void loadWhitescroll() {
        ItemMeta whitescrollMeta = whitescroll.getItemMeta();

        String displayName = Message.color(GenConf.itemsConfiguration.getString("whitescroll.name"));
        whitescrollMeta.setDisplayName(displayName);

        List<String> lore = new ArrayList<>();

        for (String s : GenConf.itemsConfiguration.getStringList("whitescroll.lore")) {
            lore.add(Message.color(s));
        }

        whitescrollMeta.setLore(lore);

        whitescroll.setItemMeta(whitescrollMeta);
    }

    public static void loadBlackscroll() {
        ItemMeta blackscrollMeta = blackscroll.getItemMeta();

        String displayName = Message.color(GenConf.itemsConfiguration.getString("blackscroll.name"));
        blackscrollMeta.setDisplayName(displayName);

        List<String> lore = new ArrayList<>();

        for (String s : GenConf.itemsConfiguration.getStringList("blackscroll.lore")) {
            lore.add(Message.color(s));
        }

        blackscrollMeta.setLore(lore);

        blackscroll.setItemMeta(blackscrollMeta);
    }

    public static void loadSimple() {
        ItemMeta simpleMeta = simple.getItemMeta();

        String displayName = Message.color(GenConf.itemsConfiguration.getString("simple.name"));
        simpleMeta.setDisplayName(displayName);

        List<String> lore = new ArrayList<>();

        for (String s : GenConf.itemsConfiguration.getStringList("simple.lore")) {
            lore.add(Message.color(s));
        }

        simpleMeta.setLore(lore);
        simple.setItemMeta(simpleMeta);
    }

    public static void loadUnique() {
        ItemMeta uniqueMeta = unique.getItemMeta();

        String displayName = Message.color(GenConf.itemsConfiguration.getString("unique.name"));
        uniqueMeta.setDisplayName(displayName);

        List<String> lore = new ArrayList<>();

        for (String s : GenConf.itemsConfiguration.getStringList("unique.lore")) {
            lore.add(Message.color(s));
        }

        uniqueMeta.setLore(lore);
        unique.setItemMeta(uniqueMeta);
    }

    public static void loadElite() {
        ItemMeta eliteMeta = elite.getItemMeta();

        String displayName = Message.color(GenConf.itemsConfiguration.getString("elite.name"));
        eliteMeta.setDisplayName(displayName);

        List<String> lore = new ArrayList<>();

        for (String s : GenConf.itemsConfiguration.getStringList("elite.lore")) {
            lore.add(Message.color(s));
        }

        eliteMeta.setLore(lore);
        elite.setItemMeta(eliteMeta);
    }

    public static void loadUlitmate() {
        ItemMeta ultimateMeta = ultimate.getItemMeta();

        String displayName = Message.color(GenConf.itemsConfiguration.getString("ultimate.name"));
        ultimateMeta.setDisplayName(displayName);

        List<String> lore = new ArrayList<>();

        for (String s : GenConf.itemsConfiguration.getStringList("ultimate.lore")) {
            lore.add(Message.color(s));
        }

        ultimateMeta.setLore(lore);
        ultimate.setItemMeta(ultimateMeta);
    }

    public static void loadLegendary() {
        ItemMeta legendaryMeta = legendary.getItemMeta();

        String displayName = Message.color(GenConf.itemsConfiguration.getString("legendary.name"));
        legendaryMeta.setDisplayName(displayName);

        List<String> lore = new ArrayList<>();

        for (String s : GenConf.itemsConfiguration.getStringList("legendary.lore")) {
            lore.add(Message.color(s));
        }

        legendaryMeta.setLore(lore);
        legendary.setItemMeta(legendaryMeta);
    }



    public static void buyBook(Player player, ItemStack book, boolean glow) {
        int capable = player.getInventory().firstEmpty();

        if (capable == -1) {
            player.sendMessage(Message.cColor(Languages.inventoryFull.replace("{player}", player.getName())));
            return;
        }

        if (glow) {
            ItemStack glowingBook = EnchantGlow.addGlow(Effects.disableStacking(book));
            player.getInventory().addItem(glowingBook);
        } else {
            player.getInventory().addItem(Effects.disableStacking(book));
        }

        player.sendMessage(Message.cColor(Languages.receivedBook));
        return;
    }

    /*
    public static void buyBook(Player player, ItemStack book, boolean glow) {
        int capable = player.getInventory().firstEmpty();

        if (capable == -1) {
            if (!(sender instanceof Player)) {
                logger.info("The player you attempted to give an item to, has a full inventory!");
                return;
            } else {
                Player senderPlayer = (Player)sender;

                senderPlayer.sendMessage(Message.cColor(Languages.inventoryFull.replace("{player}", player.getName())));
                return;
            }
        }

        if (glow == true) {
            player.getInventory().addItem(Effects.addGlow(book));
        } else {
            player.getInventory().addItem(book);
        }

        if (!(sender instanceof Player)) {
            logger.info("You have given " + player.getName() + " a book!");
        }

        sender.sendMessage(Message.cColor(Languages.givenBook));
        player.sendMessage(Message.cColor(Languages.receivedBook.replace("{sender}", sender.getName())));
        return;
    }
     */
}