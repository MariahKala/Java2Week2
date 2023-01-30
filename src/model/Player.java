package model;
/**
 * mkennedy13
 * CIS175 - Spring 2023
 * 1/29/23
 */
public class Player {
	private String playerName;
	private int level;
	private int health;
	
	
	public Player() {
		super();
	}
	public Player(String playerName) {
		super();
		this.playerName = playerName;
	}
	public Player(String playerName, int level, int health) {
		super();
		this.playerName = playerName;
		this.level = level;
		this.health = health;
	}

	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int printLevel() {
		return level;
	}
	public int printHealth() {
		return health;
	}
	public String printPlayerName() {
		return playerName;
	}
}
