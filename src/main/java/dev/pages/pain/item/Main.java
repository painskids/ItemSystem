package dev.pages.pain.item;

import dev.pages.pain.item.manager.LoadItems;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main instance;

    @Override
    public void onEnable(){
        super.onEnable();
        instance = this;
        LoadItems.loadItem();
        getServer().getPluginManager().registerEvents(new joinEv(), this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    public static Main getInstance() {
        return instance;
    }
}
