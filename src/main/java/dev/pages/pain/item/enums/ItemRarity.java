package dev.pages.pain.item.enums;

import org.bukkit.ChatColor;

public enum ItemRarity {
    COMMON(ChatColor.GRAY),
    UNCOMMON(ChatColor.GREEN),
    RARE(ChatColor.BLUE),
    EPIC(ChatColor.DARK_PURPLE);

    private ChatColor chatColor;
    ItemRarity(ChatColor chatColor) {
        this.chatColor = chatColor;
    }

    public ChatColor getColor(){
        return chatColor;
    }
}
