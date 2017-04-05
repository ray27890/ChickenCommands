package com.chickencommands.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Staff implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command command,
			String label,String[] args) {
		if(label.equalsIgnoreCase("staff")){
		
		if (!(sender instanceof Player)) {
			sender.sendMessage("You must be a player to use this command!");
			return false;
		}
		Player player = (Player) sender;
		player.sendMessage(ChatColor.DARK_BLUE + "The staff members as of now are p3i and iFrostbite ");
		return false;
		}
		return false;

}
}
