package dev.pages.pain.item.manager;

import dev.pages.pain.item.Main;
import org.bukkit.plugin.java.JavaPlugin;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;

public class LoadItems {

    Class<? extends JavaPlugin> plugin;

    public static void loadItem(){
        String packagename = Main.getInstance().getClass().getPackage().getName();
        for(Class<?> clazz : new Reflections(packagename + "impl")
                .getSubTypesOf(CustomItem.class)
        ){
            try {
                clazz.getDeclaredConstructor().newInstance();
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                     NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
    }
}