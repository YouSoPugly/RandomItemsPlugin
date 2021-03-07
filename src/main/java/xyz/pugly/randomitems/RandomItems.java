package xyz.pugly.randomitems;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class RandomItems extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        Bukkit.getServer().getPluginManager().registerEvents(new Events(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
