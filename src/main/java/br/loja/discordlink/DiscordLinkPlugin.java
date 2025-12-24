package br.loja.discordlink;

import org.bukkit.plugin.java.JavaPlugin;

public class DiscordLinkPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("DiscordLink Plugin ativado!");
    }

    @Override
    public void onDisable() {
        getLogger().info("DiscordLink Plugin desativado!");
    }
}
