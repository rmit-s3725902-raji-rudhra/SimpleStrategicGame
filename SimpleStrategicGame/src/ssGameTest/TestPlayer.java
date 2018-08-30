
package ssGameTest;
/**
 * @author Suma Subbu
 * 22 Aug. 2018
 */
import static org.junit.Assert.*;

import org.junit.Before;

import simpleGame.*;

import org.junit.Test;

public class TestPlayer {
    Player player;
    @Before
    public void setUp() {
        player = new Player(5,5);
    }
    @Test
    public void moveLeftTest() {
        player.moveLeft(2);
        assertEquals(3,player.getX());
    }
    @Test
    public void isBlockTest() {
        assertEquals(false, player.isBlock(3,2));
    }
}

