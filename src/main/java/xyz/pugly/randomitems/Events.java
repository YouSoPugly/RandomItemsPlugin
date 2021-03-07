package xyz.pugly.randomitems;

import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class Events implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        Material[] items = Material.values();
        Random r = new Random();
        e.setCancelled(true);
        e.getBlock().setType(Material.AIR);
        ItemStack random = new ItemStack(items[r.nextInt(items.length)]);
        e.getBlock().getWorld().dropItem(e.getBlock().getLocation(), random);
    }
}
