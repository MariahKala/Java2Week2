package model;
/**
 * mkennedy13
 * CIS175 - Spring 2023
 * 1/29/23
 */
import model.Player;
import model.PlayerHealthLogic;

public class PlayerLevelLogic {
	public int resetToLevelOne(Player player) {
		int level = player.getLevel();
		if (player.getHealth() <= 0) {
			level = 1;
			;
		}return level;
	}
	public int advanceLevel(Player player) {
		int level = player.getLevel();
		++level;
		return level;
	}
}
