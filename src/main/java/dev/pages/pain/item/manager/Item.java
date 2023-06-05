package dev.pages.pain.item.manager;

import dev.pages.pain.item.enums.ItemRarity;
import dev.pages.pain.item.enums.ItemType;
import dev.pages.pain.item.Main;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Item {

    protected static String idKey = "id";

    private Material material;
    private String name;
    private String id;
    private ItemRarity itemRarity;
    private ItemStack item;
    private String ability;
    private int intid;
    private ItemType itemType;
    private String warrning;
    private List<String> lore;
    private boolean isEnchanted;
    private static HashMap<String, Item> items = new HashMap<>();

    public static HashMap<String, Item> getItems() {
        return items;
    }

    public Item(ItemStack item, Material material , String id) {
        this.item = new ItemStack(material);
        this.id = id;
    }

    @NotNull
    public ItemStack getFinishedItem(){
        ItemMeta meta = item.getItemMeta();
        meta.getPersistentDataContainer().set(new NamespacedKey(Main.getInstance(), "id"), PersistentDataType.STRING, id);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.setDisplayName(name);
        List<String> lore = new ArrayList<>();
        if(itemRarity != null) {
            lore.add(itemRarity.getColor() + itemRarity.toString());
        }

        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public void save(Item i){
        items.put(getId(), i);
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ItemRarity getItemRarity() {
        return itemRarity;
    }

    public void setItemRarity(ItemRarity itemRarity) {
        this.itemRarity = itemRarity;
    }

    public ItemStack getItem() {
        return item;
    }

    public void setItem(ItemStack item) {
        this.item = item;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public int getIntid() {
        return intid;
    }

    public void setIntid(int intid) {
        this.intid = intid;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public String getWarrning() {
        return warrning;
    }

    public void setWarrning(String warrning) {
        this.warrning = warrning;
    }

    public List<String> getLore() {
        return lore;
    }

    public void setLore(List<String> lore) {
        this.lore = lore;
    }

    public boolean isEnchanted() {
        return isEnchanted;
    }

    public void setEnchanted(boolean enchanted) {
        isEnchanted = enchanted;
    }
}
