package simpleGame;

/**
 * 
 * 
 * @author RudhraRaji
 * 
 * 
 * 
 *         21 Aug. 2018
 * 
 * 
 */

public class Monster {

	private int Mspeed;
        private int x;
        public Monster(int initialX, int initialMspeed)//Constructor

	{
                x = initialX;
                Mspeed = initialMspeed;
        }

	public void Move()//Monster movement

	{
            if (x + Mspeed <= 2);
            x = x + Mspeed;
        }

	public boolean notMove()

	{
            if (Mspeed == 1)
                  return true;
            else
                  return false;
        }

	public int getX()

	{
               return x;
        }
}
