package net.rainpaw10.nomilkclearing;

import jdk.internal.org.jline.terminal.TerminalBuilder;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoMilkClearing extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("[NoMilkClearing]: Plugin has been enabled.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("[NoMilkClearing]: Plugin has been disabled.");
    }
}
