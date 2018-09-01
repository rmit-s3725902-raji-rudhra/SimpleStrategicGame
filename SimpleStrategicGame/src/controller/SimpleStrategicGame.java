package controller;
/**
* @author RudhraRaji

* 21 Aug. 2018
*/
import java.util.ArrayList;
import model.User;

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
	//find the player id array position
	public int findPlayer(String playerID) {
		
		int playerPosition = 0;
		if(playerID.equals("")) {
		System.out.println("Player Not Found");	
		return playerPosition;
		}
		
		if(playerList.size() == 0) {
			System.out.println("There are no players in the system");
			return playerPosition;
		}
		
		for(int i = 0; i <= playerList.size(); i++) {
			if (playerList.get(i).getPlayerId().equals(playerID)) {
				playerPosition = i;
				return playerPosition;
			}
		}
		return playerPosition;
	}

	

}
