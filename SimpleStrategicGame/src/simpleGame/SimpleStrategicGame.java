package simpleGame;
/**
* @author RudhraRaji

* 21 Aug. 2018
*/
import java.util.ArrayList;

public class SimpleStrategicGame {

	ArrayList<User> playerList = new ArrayList<User>();

	public ArrayList<User> getPlayerList(){
		return this.playerList;
	}
	public boolean registerPlayer(String playerID, String password) {
		boolean result = false;

		if (playerID.equals(" ") || (password.equals(" "))) {
			result = false;
		}else {
			User p = new User(playerID, password);

			if (playerList.size() == 0) {
				playerList.add(p);
				result = true;
			} else {
				for (int i = 0; i < playerList.size(); i++) {
//					System.out.println(playerList.get(i));
					if (playerList.get(i).getPlayerId().equals(playerID)) {
						result = false; // player already exist
					} else {
						// add this player to the list
						playerList.add(p);
						result = true;
					}
				}
			}

		}
		
		return result;
	}

}
