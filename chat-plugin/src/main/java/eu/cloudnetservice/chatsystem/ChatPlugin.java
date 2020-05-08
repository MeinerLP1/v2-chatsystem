package eu.cloudnetservice.chatsystem;

import eu.cloudnetservice.chatsystem.listener.ChatListener;
import org.bukkit.plugin.java.JavaPlugin;

public class ChatPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().config("Initiate Bukkit Chat System");
        getConfig().options().copyDefaults(true);
        saveConfig();
        getServer().getPluginManager().registerEvents(new ChatListener(), this);
    }

    @Override
    public void onDisable() {

    }
}
