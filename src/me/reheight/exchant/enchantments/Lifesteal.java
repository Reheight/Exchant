package me.reheight.exchant.enchantments;

import me.reheight.exchant.Main;
import me.reheight.exchant.configuration.functions.GenConf;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class Lifesteal implements Listener {
    // This class corresponds to the Lifesteal enchantment

    Main plugin;
    public Lifesteal(Main instance) {
        plugin = instance;
    }

    @EventHandler
    public void playerDamage(EntityDamageByEntityEvent event) {
        if (GenConf.enchantsConfiguration.getBoolean("Lifesteal.enabled") == false) {
            return;
        }

        Entity damager = event.getDamager();
        Entity damaged = event.getEntity();

        if (!(damager instanceof Player)) return;

        String lifestealLore = ChatColor.translateAlternateColorCodes('&', "&7Lifesteal");

        Player player = (Player)damager;

        ItemStack itemInHand = player.getItemInHand();
        ItemMeta itemInHandMeta = itemInHand.getItemMeta();

        List<String> lores = itemInHandMeta.getLore();

        if (lores.contains(lifestealLore)) {
            Bukkit.broadcastMessage("Detection successful!");
        }
    }
}
