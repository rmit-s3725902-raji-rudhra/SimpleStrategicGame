package testGame;
// * @author Raghul Karthik
import static org.junit.Assert.*;
import simpleGame.Posion;

import org.junit.Before;
import org.junit.Test;
import simpleGame.SimpleStrategicGame;

public class TestPoison {

	private int x = 0;
	private int y = 0;
	private int timeCount = 0;
	private int foodCount=0;
	private Posion program;
	@Before
	public void setUp() {
		program = new Posion();
		x = 5;
		y = 6;
		timeCount = 19;
		foodCount = 2;
	}

	@Test
	public void CheckFoodPresent() {
		assertTrue(program.isFoodPresent(x, y));
	}
	@Test
	public void maximumTwoFood() {
		assertTrue(program.isMaximumTwoFood(foodCount));
	}
	 @Test
	
	 public void CheckPoisonTime() { 
		 assertEquals(1, program.isFoodPresentTimeCount(timeCount)); 
	 }
}
