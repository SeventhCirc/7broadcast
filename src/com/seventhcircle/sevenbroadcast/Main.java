package com.seventhcircle.sevenbroadcast;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	
	public void onEnable()
	{
		// Tells the Console that the plugin has been loaded
		getLogger().info("Plugin Enabled!");
	}
	// The Prefix used before any broadcast messages
	String prefix = ChatColor.RED + "[" + ChatColor.GRAY + "Admin Broadcast" + ChatColor.RED + "] " + ChatColor.LIGHT_PURPLE;

	// The Broadcast Command
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("broadcast")){
				String message = "";
				for(String part : args){
					if(message != "") message += " ";
				message += part;
				}	
					if(sender.isOp()){
						Bukkit.broadcastMessage(prefix + message);
						return true;
					}
					else sender.sendMessage(ChatColor.DARK_RED + "You lack permission to do this");
					return true;			
			}
				return false;
		}
	}

	

