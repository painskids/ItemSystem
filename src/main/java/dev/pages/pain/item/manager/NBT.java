package dev.pages.pain.item.manager;

import dev.pages.pain.item.Main;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

public class NBT {

    private ItemStack itemStack;
    public NBT(ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    private NamespacedKey getkey(String key){
        return new NamespacedKey(Main.getInstance(), key);
    }

    public void setString(String main, String feild){
        ItemMeta ItemMeta = itemStack.getItemMeta();
        ItemMeta.getPersistentDataContainer().set(new NamespacedKey(Main.getInstance(), main), PersistentDataType.STRING, feild);
        itemStack.setItemMeta(ItemMeta);
    }

    public void removeString(String main){
        ItemMeta ItemMeta = itemStack.getItemMeta();
        ItemMeta.getPersistentDataContainer().remove(new NamespacedKey(Main.getInstance(), main));
        itemStack.setItemMeta(ItemMeta);
    }

    public String getString(String main){
        ItemMeta meta = itemStack.getItemMeta();
        String s = meta.getPersistentDataContainer().get(new NamespacedKey(Main.getInstance(), main), PersistentDataType.STRING);
        return s;
    }

    public boolean hasString(String main){
        ItemMeta ItemMeta = itemStack.getItemMeta();
        if(ItemMeta.getPersistentDataContainer().has(getkey(main), PersistentDataType.STRING)){
            return true;
        }
        else {
            return false;
        }
    }
}
