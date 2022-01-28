package me.nglam.testplugin.testplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class TestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new EventListener(), this);
        this.getLogger().info("Plugin Enabled");
    }

    @Override
    public void onDisable() {
        this.getLogger().info("Plugin Disabled");
    }
}
