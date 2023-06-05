package dev.pages.pain.item;

import dev.pages.pain.item.manager.Item;
import dev.pages.pain.item.manager.NBT;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class joinEv implements Listener {

    @EventHandler
    protected void pje(PlayerJoinEvent event){
        event.getPlayer().getInventory().addItem(Item.getItems().get("try_item").getFinishedItem());
    }

}
