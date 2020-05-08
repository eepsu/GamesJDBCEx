package be.belfius.GamesJDBC.domain;

//public class Game implements Comparable<Game>{
public class Game{

	private int gameId;
	private String gameName;
	
	
	public Game(String gameName) {
		this.gameName = gameName;
		
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	

	

//	@Override
//	public String toString() {
//		return "Game [gameId=" + gameId + ", gameName=" + gameName + ", gameEditor=" + gameEditor + ", gameAuthor="
//				+ gameAuthor + ", gameYearEdition=" + gameYearEdition + ", gameAge=" + gameAge + ", minPlayers="
//				+ minPlayers + ", maxPlayers=" + maxPlayers + ", gameCatId=" + gameCatId + ", playDuration="
//				+ playDuration + ", gameDifId=" + gameDifId + ", price=" + price + ", gameImage=" + gameImage + "]";
//	}
//
//	@Override
//	public int compareTo(Game o) {
//		return this.getGameName().compareTo(o.getGameName());
//	}
//	
	
	
}
