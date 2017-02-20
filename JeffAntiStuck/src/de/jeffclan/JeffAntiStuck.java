package de.jeffclan;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class JeffAntiStuck extends JavaPlugin implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		if (arg0 instanceof Player) {
			if (arg1.getName().equalsIgnoreCase("stuck")) {
				Player p = (Player) arg0;
				if (p.hasPermission("jeff.antistuck")) {
					p.teleport(p.getLocation().add(0, 0.2, 0));
					p.sendMessage(ChatColor.PURPLE+"Du Tölpel...");
				}
			}
		}
		return false;
	}
}
