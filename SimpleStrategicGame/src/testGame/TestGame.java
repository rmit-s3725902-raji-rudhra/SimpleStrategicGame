package testGame;
/**
* @author RudhraRaji
* 21 Aug. 2018
*/
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import simpleGame.User;
import simpleGame.SimpleStrategicGame;

public class TestGame {

	private SimpleStrategicGame ssGame;
	private ArrayList<User> pList;
	@Before
	public void setUp() {
		 ssGame = new SimpleStrategicGame();
		 pList = new ArrayList<User>();
	}
	
	//Success register player
	@Test
	public void testRegisterPlayer() {
		boolean result = ssGame.registerPlayer("id", "password");
		assertEquals(result, true);
	}
	
	@Test
	public void testRegisterPlayerIdNull() {
		boolean result = ssGame.registerPlayer(" ", "password");
		assertNotEquals(result, true);
	}
	
	@Test
	public void testRegisterPlayerPasswordNull() {
		boolean result = ssGame.registerPlayer("id", " ");
		assertNotEquals(result, true);
	}
	
	@Test
	public void testRegisterPlayerNull() {
		boolean result = ssGame.registerPlayer(" ", " ");
		assertNotEquals(result, true);
	}
	
	
	@Test
	public void testAddedPlayerInPlayerList() {
		ssGame.registerPlayer("id", "password");
		pList = ssGame.getPlayerList();
		assertEquals(pList.get(0).getPlayerId().equals("id"), true);
		assertEquals(pList.get(0).getPassword().equals("password"), true);
	}
	
	
	
	

}
