package simpleGame;

/**
* @author RudhraRaji
* 21 Aug. 2018
*/
public class User {

	private String playerId;
	private String password;
	private boolean isLoggedIn;
	private int gamesPlayed;
	private int gamesWon;
	private int gameLost;
	private int currentScore;
	private int totalScore;
	
	public User(String playerId, String password) {
		this.playerId = playerId;
		this.password = password;
	}
	
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isLoggedIn() {
		return isLoggedIn;
	}
	public void setLoggedIn(boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}
	public int getGamesPlayed() {
		return gamesPlayed;
	}
	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}
	public int getGamesWon() {
		return gamesWon;
	}
	public void setGamesWon(int gamesWon) {
		this.gamesWon = gamesWon;
	}
	public int getGameLost() {
		return gameLost;
	}
	public void setGameLost(int gameLost) {
		this.gameLost = gameLost;
	}
	public int getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}
	public int getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	
	
}
