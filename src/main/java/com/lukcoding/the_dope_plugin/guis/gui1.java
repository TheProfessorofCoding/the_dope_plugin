package com.lukcoding.the_dope_plugin.guis;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class gui1 implements Listener{

    public final Inventory i;


    public gui1() {
        i = Bukkit.createInventory(null, 20, "S E R V E R  M A R K E T P L A C E");
        
        initailizeItems();
    }

    private void initailizeItems() {

        i.addItem(createGuiItem(Material.POLISHED_BASALT, "Basalt", "Basalt, but rethinked"));
        i.addItem(createGuiItem(Material.POLISHED_ANDESITE, "Andesite", "Andesite, but rethinked"));

    }

    protected ItemStack createGuiItem(final Material material, final String name, final String... lore) {
        final ItemStack item = new ItemStack(material, 1);
        final ItemMeta meta = item.getItemMeta();

        // Set the name of the item
        meta.setDisplayName(name);
        // Set the lore of the item
        meta.setLore(Arrays.asList(lore));

        item.setItemMeta(meta);

        return item;
    }

    // You can open the inventory with this
    public void openInventory(final HumanEntity ent) {
        ent.openInventory(i);
    }

    // Check for clicks on items
    @EventHandler
    public void onInventoryClick(final InventoryClickEvent e) {

    }

    // Cancel dragging in our inventory
    @EventHandler
    public void onInventoryClick(final InventoryDragEvent e) {
        if (e.getInventory().equals(i)) {
            e.setCancelled(true);
        }
    }
}

