package tests;
/**
 * mkennedy13
 * CIS175 - Spring 2023
 * 1/29/23
 */
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.Player;
import model.PlayerHealthLogic;
import model.PlayerLevelLogic;
public class HealthTest {
	Player link = new Player("Link");
	PlayerHealthLogic playerHLogic = new PlayerHealthLogic();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testHealthDamage() {
		link.setHealth(2);
		int health = playerHLogic.healthDamage(link);
		assertEquals(1,1);
		
	}
	public void testHealthRecovery() {
		link.setHealth(2);
		int health = playerHLogic.healthDamage(link);
		assertEquals(3,3);
		
	}
	public void testIsDead() {
		link.setHealth(0);
		assertTrue(playerHLogic.isDead(link));
	}

}
