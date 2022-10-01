package me.zenithatic.simplevault;

import me.zenithatic.simplevault.Commands.VaultCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class SimpleVault extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("[SimpleVault] SimpleVault has loaded successfully.");
        this.getCommand("vault").setExecutor(new VaultCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("[SimpleVault] SimpleVault has unloaded successfully.");
    }
}
