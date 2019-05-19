package me.reheight.exchant.utilities;

import me.reheight.exchant.configuration.Languages;
import org.bukkit.ChatColor;

public class Message {
    public static String color (String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }

    public static String cColor (String s) {
        return ChatColor.translateAlternateColorCodes('&', Languages.prefix + s);
    }
}
