package de.cryt4x.oretocobble.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.cryt4x.oretocobble.commands.OreToCobbleInfo;
import de.cryt4x.oretocobble.listeners.BlockBreaks;

public class Main extends JavaPlugin
{
	private static Main plugin;
	public void onEnable ()
	{
		plugin = this;
		
		//Server-Console Output
		System.out.println("[O2C] Ores-To-Cobble (ctpl3) loaded!");
		
		//Plugin-Info
		getCommand("oretocobbleinfo").setExecutor(new OreToCobbleInfo());
		
		//Commands
		//getCommand("WriteACommandHere").setExecutor(new "ACommandClass()");
		
		//Listeners
		PluginManager pluginManager = Bukkit.getPluginManager();
		pluginManager.registerEvents(new BlockBreaks(), this);
		//pluginManager.registerEvents(new BlockPlaced(), this);
	}
	public static Main getPlugin() {
		return plugin;
	}
}
