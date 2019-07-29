package de.cryt4x.oretocobble.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import de.cryt4x.oretocobble.main.Main;

public class BlockBreaks implements Listener
{

	@EventHandler
	public void onBreak (BlockBreakEvent eventBlockBreak) //If a block is breaking
	{
		Block block = eventBlockBreak.getBlock();
		Material material = block.getType();
		Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable() //20 Tick delay (1 second)
		{
			@Override
			public void run()
			{
				if (material==Material.EMERALD_ORE)
				{
					block.setType(Material.DIAMOND_ORE);
				}
				else if (material==Material.DIAMOND_ORE)
				{
					block.setType(Material.REDSTONE_ORE);
				}
				else if (material==Material.REDSTONE_ORE)
				{
				block.setType(Material.LAPIS_ORE);
				}
				else if (material==Material.LAPIS_ORE)
				{
					block.setType(Material.GOLD_ORE);
				}
				else if (material==Material.GOLD_ORE)
				{
					block.setType(Material.IRON_ORE);
				}
				else if (material==Material.IRON_ORE)
				{
					block.setType(Material.COAL_ORE);
				}
				else if (material==Material.COAL_ORE)
				{
					block.setType(Material.STONE);
				}
			}	
		}, 0L);
	}
}
