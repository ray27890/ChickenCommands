package com.chickencommands.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Info implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command command,
			String label,String[] args) {
		if(label.equalsIgnoreCase("info")){
		
		if (!(sender instanceof Player)) {
			sender.sendMessage("You must be a player to use this command!");
			return false;
		}
		Player player = (Player) sender;
		player.sendMessage(ChatColor.DARK_BLUE + "Welcome to ChickenFreedom " +   player.getName() + "!");
		return false;
		}
		return false;

} }
