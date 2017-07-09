package com.seventhcircle.sevenbroadcast;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	
	public void onEnable()
	{
		getLogger().info("Plugin Enabled!");
	}
	
	//String[] messages = {"Message 1", "Message 2", "Message 3", "Message 4"};
	String prefix = ChatColor.RED + "[" + ChatColor.GRAY + "Admin Broadcast" + ChatColor.RED + "] " + ChatColor.LIGHT_PURPLE;
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("broadcast")){
			Player player = (Player) sender;
			if(player.isOp()){
			
				
				
				
				
				
				/** if(args[0].equalsIgnoreCase("1")){
					Bukkit.broadcastMessage(prefix + messages[0]);
				}
				else if(args[0].equalsIgnoreCase("2")){
					Bukkit.broadcastMessage(prefix + messages[1]);
				}
				else if(args[0].equalsIgnoreCase("3")){
					Bukkit.broadcastMessage(prefix + messages[2]);
				}
				else if(args[0].equalsIgnoreCase("4")){
					Bukkit.broadcastMessage(prefix + messages[3]);
				} **/
			}
		}
		return false;
	}
}
	
/**	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("ab")){
			Player player = (Player) sender;
			if(player.isOp()){
				if(args[0].equalsIgnoreCase("1")){
					Bukkit.broadcastMessage(ChatColor.RED + "[" + ChatColor.GRAY + "Admin Broadcast" + ChatColor.RED + "]" + ChatColor.GREEN + "Message 1");
				}
			
				else if(args[0].equalsIgnoreCase("2")){
					Bukkit.broadcastMessage(ChatColor.RED + "[" + ChatColor.GRAY + "Admin Broadcast" + ChatColor.RED + "]" + ChatColor.GREEN + "Message 2");
			}
				
				else if(args[0].equalsIgnoreCase("3")){
					Bukkit.broadcastMessage(ChatColor.RED + "[" + ChatColor.GRAY + "Admin Broadcast" + ChatColor.RED + "]" + ChatColor.GREEN + "Message 3");
				}
			
				else if(args[0].equalsIgnoreCase("4")){
					Bukkit.broadcastMessage(ChatColor.RED + "[" + ChatColor.GRAY + "Admin Broadcast" + ChatColor.RED + "]" + ChatColor.GREEN + "Message 4");
				}
			}
		}
		return false;
	}
} **/
