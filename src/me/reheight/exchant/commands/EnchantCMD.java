package me.reheight.exchant.commands;

import me.reheight.exchant.Main;
import me.reheight.exchant.configuration.Languages;
import me.reheight.exchant.inventories.GUI;
import me.reheight.exchant.utilities.Message;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnchantCMD implements CommandExecutor {
    Main plugin;
    public EnchantCMD(Main instance) {
        plugin = instance;
    }

    private GUI gui = new GUI();
    private Message message = new Message();

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            plugin.getServer().getLogger().info("You must be a player to execute this command!");
            return true;
        }

        Player player = (Player)sender;

        if (command.getName().equalsIgnoreCase("enchant")) {
            player.sendMessage(message.cColor(Languages.openingEnchantGUI));

            gui.openInventory(player);
            return true;
        }
        return false;
    }
}
