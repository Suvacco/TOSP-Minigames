package oldschoolproject.Listeners;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

import oldschoolproject.Managers.ConfigurationFile;
import oldschoolproject.Managers.LocationManager;
import oldschoolproject.Modules.Builders.ItemBuilder;
import oldschoolproject.Modules.Loaders.Listener.BaseListener;

public class Join extends BaseListener {
	
	@EventHandler
	public void join(PlayerJoinEvent e) {
		e.setJoinMessage(null);
		
		Player p = e.getPlayer();
	
		p.getInventory().clear();
		p.setHealth(20D);
		p.setFireTicks(0);
		p.setExhaustion(0);
		p.setExp(0);
		p.setFoodLevel(10);
		p.setLevel(0);
				
//		p.setGameMode(GameMode.ADVENTURE);
		
		p.getInventory().setItem(4, new ItemBuilder(Material.CHEST).setName("§a§lMinigames").toItemStack());
		
		p.teleport(LocationManager.getSpawnLocation());
	}
}
