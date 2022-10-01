package me.zenithatic.simplevault.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class VaultCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            // Get player and their ender chest
            Player player = (Player) sender;
            Inventory echest = player.getEnderChest();

            // Open player ender chest
            player.openInventory(echest);
        }
        else{
            // Notify that this command cannot be used except by a player.
            Bukkit.getLogger().info("[SimpleVault] This command can only be executed by players.");
        }

        // Disable echo
        return true;
    }
}
