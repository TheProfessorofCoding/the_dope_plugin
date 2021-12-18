package com.lukcoding.the_dope_plugin;

import com.lukcoding.the_dope_plugin.guis.gui1;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class The_dope_plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new BreakBlock(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
