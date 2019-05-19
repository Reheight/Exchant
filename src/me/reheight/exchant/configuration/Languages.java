package me.reheight.exchant.configuration;

import me.reheight.exchant.configuration.functions.GenConf;

public class Languages {
    public static String prefix = GenConf.configuration.getString("prefix");
    public static String openingEnchantGUI = GenConf.languageConfiguration.getString("openingEnchantGUI");
    public static String inventoryFull = GenConf.languageConfiguration.getString("inventoryFull");
    public static String receivedBook = GenConf.languageConfiguration.getString("receivedBook");
    public static String givenBook = GenConf.languageConfiguration.getString("givenBook");
    public static String tablesDisabled = GenConf.languageConfiguration.getString("tablesDisabled");
    public static String anvilsDisabled = GenConf.languageConfiguration.getString("anvilsDisabled");
    public static String merchantsDisabled = GenConf.languageConfiguration.getString("merchantsDisabled");
}
