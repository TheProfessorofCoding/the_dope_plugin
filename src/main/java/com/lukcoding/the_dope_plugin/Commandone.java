package com.lukcoding.the_dope_plugin;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Commandone implements CommandExecutor{

    ItemStack startone = new ItemStack(Material.LIGHT_GRAY_CONCRETE_POWDER, 50);
    ItemStack startto = new ItemStack(Material.WATER_BUCKET, 4);
    ItemStack startThree = new ItemStack(Material.STONE_BRICKS, 64);


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        if(sender instanceof Player){
            Player player = (Player) sender;

            player.getInventory().addItem(startone,startto,startThree);
            player.sendMessage("I've been given a start to building kit!");
        }

        return true;
    }
}
