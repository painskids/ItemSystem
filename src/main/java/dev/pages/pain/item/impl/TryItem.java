package dev.pages.pain.item.impl;

import dev.pages.pain.item.manager.CustomItem;
import dev.pages.pain.item.manager.Item;
import dev.pages.pain.item.manager.ItemHandler;
import org.bukkit.inventory.ItemStack;

import static org.bukkit.Material.*;
import static dev.pages.pain.item.enums.ItemRarity.*;

@ItemHandler
public class TryItem implements CustomItem {

    private static ItemStack item;

    public TryItem() {
        Item i = new Item(item, SOUL_TORCH ,"try_item");
        i.setName("Tarch");
        i.setItemRarity(EPIC);
        i.save(i);
    }

    public static void main(String[] args) {
        TryItem myInstance = new TryItem(); // This will automatically call the constructor
    }
}
