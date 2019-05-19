package me.reheight.exchant;

import me.reheight.exchant.commands.EnchantCMD;
import me.reheight.exchant.configuration.functions.GenConf;
import me.reheight.exchant.enchantments.Lifesteal;
import me.reheight.exchant.events.AbilityAccess;
import me.reheight.exchant.events.InventorySelectEvent;
import me.reheight.exchant.utilities.Books;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Main extends JavaPlugin {
    private static Main instance;

    GenConf genConf = new GenConf(this);

    Logger logger = getLogger();

    public static Main getInstance() {
        return instance;
    }

    private EnchantCMD enchant = new EnchantCMD(this);
    private InventorySelectEvent inventorySelect = new InventorySelectEvent(this);
    private AbilityAccess abilityAccess = new AbilityAccess(this);
    private Lifesteal lifesteal = new Lifesteal(this);

    @Override
    public void onEnable() {
        instance = this;

        genConf.checkDataFolder();
        genConf.checkConfiguration();
        genConf.checkEnchanter();
        genConf.checkEnchants();
        genConf.checkGUI();
        genConf.checkItems();
        genConf.checkLanguage();
        genConf.checkTinkerer();

        Books.loadWhitescroll();
        Books.loadBlackscroll();
        Books.loadSimple();
        Books.loadUnique();
        Books.loadElite();
        Books.loadUlitmate();
        Books.loadLegendary();

        getCommand("enchant").setExecutor(enchant);

        getServer().getPluginManager().registerEvents(inventorySelect, this);
        getServer().getPluginManager().registerEvents(abilityAccess, this);
        getServer().getPluginManager().registerEvents(lifesteal, this);

        logger.info("Activation Successful");
    }

    @Override
    public void onDisable() {
        logger.info("Deactivation Successful");
    }
}
