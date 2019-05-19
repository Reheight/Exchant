package me.reheight.exchant.configuration.functions;

import me.reheight.exchant.Main;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class GenConf {
    Main plugin;
    // Language
    private File lFile = null;

    // Configuration
    private File cFile = null;

    // Enchantments
    private File eFile = null;

    // Items
    private File iFile = null;

    // GUI
    private File gFile = null;

    // Tinkerer
    private File tFile = null;

    // Enchanter
    private File erFile = null;

    public static FileConfiguration configuration = null;
    public static FileConfiguration languageConfiguration = null;
    public static FileConfiguration enchantsConfiguration = null;
    public static FileConfiguration itemsConfiguration = null;
    public static FileConfiguration guiConfiguration = null;
    public static FileConfiguration tinkererConfiguration = null;
    public static FileConfiguration enchanterConfiguration = null;

    public GenConf(Main instance) {
        plugin = instance;
    }


    public void checkDataFolder() {
        if (!plugin.getDataFolder().exists()) {
            plugin.getDataFolder().mkdir();

            plugin.getServer().getLogger().info("The DataFold for Exchant was not created, so we generated it!");
        }
        return;
    }

    public void checkLanguage() {
        lFile = new File(plugin.getDataFolder() + File.separator +  "language.yml");

        if (!lFile.exists()) {
            plugin.saveResource("language.yml", false);
        }

        languageConfiguration = YamlConfiguration.loadConfiguration(lFile);
        return;
    }

    public void checkConfiguration() {
        cFile = new File(plugin.getDataFolder() + File.separator +  "config.yml");

        if (!cFile.exists()) {
            plugin.saveResource("config.yml", false);
        }

        configuration = YamlConfiguration.loadConfiguration(cFile);
        return;
    }

    public void checkEnchants() {
        eFile = new File(plugin.getDataFolder() + File.separator +  "enchantments.yml");

        if (!eFile.exists()) {
            plugin.saveResource("enchantments.yml", false);
        }

        enchantsConfiguration = YamlConfiguration.loadConfiguration(eFile);
        return;
    }

    public void checkItems() {
        iFile = new File(plugin.getDataFolder() + File.separator +  "items.yml");

        if (!iFile.exists()) {
            plugin.saveResource("items.yml", false);
        }

        itemsConfiguration = YamlConfiguration.loadConfiguration(iFile);
        return;
    }

    public void checkGUI() {
        gFile = new File(plugin.getDataFolder() + File.separator +  "gui.yml");

        if (!gFile.exists()) {
            plugin.saveResource("gui.yml", false);
        }

        guiConfiguration = YamlConfiguration.loadConfiguration(gFile);
        return;
    }

    public void checkTinkerer() {
        tFile = new File(plugin.getDataFolder() + File.separator +  "tinkerer.yml");

        if (!tFile.exists()) {
            plugin.saveResource("tinkerer.yml", false);
        }

        tinkererConfiguration = YamlConfiguration.loadConfiguration(tFile);
        return;
    }

    public void checkEnchanter() {
        erFile = new File(plugin.getDataFolder() + File.separator +  "enchanter.yml");

        if (!erFile.exists()) {
            plugin.saveResource("enchanter.yml", false);
        }

        enchanterConfiguration = YamlConfiguration.loadConfiguration(erFile);
        return;
    }
}
