package com.lukcoding.the_dope_plugin.guis;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

public class gui1 implements Listener{

    public final Inventory i;


    public gui1() {
        i = Bukkit.createInventory(null, 20, "S E R V E R  M A R K E T P L A C E");
    }
}
