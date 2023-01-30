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
public class NameTest {
	Player link = new Player("Link");
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPlayerNameNotNull() {
	 assertNotNull(link.printPlayerName());
	}

}
