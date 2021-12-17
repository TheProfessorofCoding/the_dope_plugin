package com.lukcoding.the_dope_plugin;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BreakBlock implements Listener{

    ItemStack coppers = new ItemStack(Material.RAW_COPPER_BLOCK, 2);
    ItemStack coals = new ItemStack(Material.COAL_BLOCK, 2);
    ItemStack irons = new ItemStack(Material.RAW_IRON_BLOCK, 2);
    ItemStack golds = new ItemStack(Material.RAW_GOLD_BLOCK, 1);
    ItemStack diamonds = new ItemStack(Material.DIAMOND_BLOCK, 1);
    ItemStack redstone = new ItemStack(Material.REDSTONE_BLOCK, 2);

    @EventHandler
    public void onPlayerBreakBlock(BlockBreakEvent e){
        Block blockBreaked = e.getBlock();
        
        if(blockBreaked.getType()==Material.OAK_DOOR){
            e.setCancelled(true);
            blockBreaked.setType(Material.OAK_DOOR);
        }else if(blockBreaked.getType()==Material.BIRCH_DOOR){
            e.setCancelled(true);
            blockBreaked.setType(Material.BIRCH_DOOR);
        }else if(blockBreaked.getType()==Material.DARK_OAK_DOOR){
            e.setCancelled(true);
            blockBreaked.setType(Material.DARK_OAK_DOOR);
        }else if(blockBreaked.getType()==Material.JUNGLE_DOOR){
            e.setCancelled(true);
            blockBreaked.setType(Material.JUNGLE_DOOR);
        }else if(blockBreaked.getType()==Material.ACACIA_DOOR){
            e.setCancelled(true);
            blockBreaked.setType(Material.ACACIA_DOOR);
        }
    }

    @EventHandler
    public void onPlayerBreakOre(BlockBreakEvent e){
        Block blockBroken = e.getBlock();

        if(blockBroken.getType() == Material.COPPER_ORE){
            e.setCancelled(true);
            blockBroken.setType(Material.AIR);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), coppers);
        } else if(blockBroken.getType() == Material.COAL_ORE){
            e.setCancelled(true);
            blockBroken.setType(Material.AIR);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), coals);
        } else if(blockBroken.getType() == Material.IRON_ORE){
            e.setCancelled(true);
            blockBroken.setType(Material.AIR);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), irons);
        } else if(blockBroken.getType()==Material.GOLD_ORE){
            e.setCancelled(true);
            blockBroken.setType(Material.AIR);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), golds);
        } else if(blockBroken.getType()==Material.DIAMOND_ORE){
            e.setCancelled(true);
            blockBroken.setType(Material.AIR);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), diamonds);
        } else if(blockBroken.getType() == Material.REDSTONE_ORE){
            e.setCancelled(true);
            blockBroken.setType(Material.AIR);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), redstone);
        }
    }

    @EventHandler
    public void onPlayerBreakDeepslateOre(BlockBreakEvent e){
        Block blockBroken = e.getBlock();

        if(blockBroken.getType() == Material.DEEPSLATE_COPPER_ORE){
            e.setCancelled(true);
            blockBroken.setType(Material.AIR);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), coppers);
        } else if(blockBroken.getType() == Material.DEEPSLATE_COAL_ORE){
            e.setCancelled(true);
            blockBroken.setType(Material.AIR);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), coals);
        } else if(blockBroken.getType() == Material.DEEPSLATE_IRON_ORE){
            e.setCancelled(true);
            blockBroken.setType(Material.AIR);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), irons);
        } else if(blockBroken.getType()==Material.DEEPSLATE_GOLD_ORE){
            e.setCancelled(true);
            blockBroken.setType(Material.AIR);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), golds);
        } else if(blockBroken.getType()==Material.DEEPSLATE_DIAMOND_ORE){
            e.setCancelled(true);
            blockBroken.setType(Material.AIR);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), diamonds);
        } else if(blockBroken.getType() == Material.DEEPSLATE_REDSTONE_ORE){
            e.setCancelled(true);
            blockBroken.setType(Material.AIR);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), redstone);
        }
    }

}
