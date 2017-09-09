package main;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import gamemode.gm;
import sub.info;

public class NuchiRPG extends JavaPlugin implements CommandExecutor
{


	public static Plugin plugin;


	@Override
    public void onEnable() {

		getLogger().info("有効にしました。");
        getCommand("gm").setExecutor(new gm());
        getCommand("nuchirpg").setExecutor(new info());
    }



	@Override
    public void onDisable() {
		// Plugin shutdown logicif (!ConfigManager.saveApologies())
		getLogger().info("無効になりました。");

    }
}

