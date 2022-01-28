package me.nglam.testplugin.testplugin;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDropItemEvent;
import org.bukkit.inventory.ItemStack;

public class EventListener implements Listener {

    @EventHandler (priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onBlockBreak(BlockDropItemEvent event){
        ItemStack item = new ItemStack(Material.DIAMOND);
        item.setAmount(5);
        event.getPlayer().getInventory().addItem(item);
    }
}
