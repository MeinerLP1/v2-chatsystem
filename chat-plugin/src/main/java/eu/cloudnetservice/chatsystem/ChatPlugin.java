package eu.cloudnetservice.chatsystem;

import eu.cloudnetservice.chatsystem.listener.ChatListener;
import org.bukkit.plugin.java.JavaPlugin;

public class ChatPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults(true);
        saveConfig();
        getServer().getPluginManager().registerEvents(new ChatListener(), this);
    }
}
