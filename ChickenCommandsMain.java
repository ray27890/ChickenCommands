package com.chickencommands;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import com.chickencommands.commands.Info;
import com.chickencommands.commands.Staff;

public class ChickenCommandsMain extends JavaPlugin {
	
	public void onEnable() {
		
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = Logger.getLogger("Minecraft");
		
		getCommand("Info").setExecutor(new Info());
		getCommand("Staff").setExecutor(new Staff());
		
		logger.info(pdfFile.getName() + "has been enabled! (V." + pdfFile.getVersion() +")");
		
	}
	
public void onDisable() {
		
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = Logger.getLogger("Minecraft");
		
		logger.info(pdfFile.getName() + " has been disabled! (V." + pdfFile.getVersion() +")");
		
		
		
	}
            


}




