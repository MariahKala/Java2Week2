package model;
/**
 * mkennedy13
 * CIS175 - Spring 2023
 * 1/29/23
 */
import model.PlayerLevelLogic;
import model.Player;
public class PlayerHealthLogic {
	public int healthDamage(Player player) {
		int health = player.getHealth();
		--health;
		if (health > 0) {
			System.out.print("OUCH!");
		}
		return health;
	}
	public int healthRecovery(Player player) {
		int health = player.getHealth();
		++health;
		System.out.print("Wow! I feel better");
		return health;
	}
	public void gameOver(Player player) {
		System.out.print("You are dead. Try again from the beginning.");		
	}
	public boolean isDead(Player player) {
		int health = player.getHealth();
		if (health <= 0) {
			System.out.print("You are dead.");
			return true;
		}else {
			return false;
		}
		
	}
	
	
}
