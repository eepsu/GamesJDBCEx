package be.belfius.GamesJDBC.domain;

//public class Game implements Comparable<Game>{
public class Game{

	private int gameId;
	private String gameName;
	private String gameEditor;
	private String gameAuthor;
	private int gameYearEdition;
	private String gameAge;
	private int minPlayers;
	private int maxPlayers;
	private int gameCatId;
	private String playDuration;
	private int gameDifId;
	private double price;
	private String gameImage;
	
	private Category gameCat;
	
	public Game(int gameId, String gameName, String gameEditor, String gameAuthor, int gameYearEdition, String gameAge,
			int minPlayers, int maxPlayers, int gameCatId, String playDuration, int gameDifId, double price,
			String gameImage) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gameEditor = gameEditor;
		this.gameAuthor = gameAuthor;
		this.gameYearEdition = gameYearEdition;
		this.gameAge = gameAge;
		this.minPlayers = minPlayers;
		this.maxPlayers = maxPlayers;
		this.gameCatId = gameCatId;
		this.playDuration = playDuration;
		this.gameDifId = gameDifId;
		this.price = price;
		this.gameImage = gameImage;
	}
	
	
	public Category getGameCat() {
		return gameCat;
	}


	public void setGameCat(Category gameCat) {
		this.gameCat = gameCat;
	}


	public Game() {	
		
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

	public String getGameEditor() {
		return gameEditor;
	}

	public void setGameEditor(String gameEditor) {
		this.gameEditor = gameEditor;
	}

	public String getGameAuthor() {
		return gameAuthor;
	}

	public void setGameAuthor(String gameAuthor) {
		this.gameAuthor = gameAuthor;
	}

	public int getGameYearEdition() {
		return gameYearEdition;
	}

	public void setGameYearEdition(int gameYearEdition) {
		this.gameYearEdition = gameYearEdition;
	}

	public String getGameAge() {
		return gameAge;
	}

	public void setGameAge(String gameAge) {
		this.gameAge = gameAge;
	}

	public int getMinPlayers() {
		return minPlayers;
	}

	public void setMinPlayers(int minPlayers) {
		this.minPlayers = minPlayers;
	}

	public int getMaxPlayers() {
		return maxPlayers;
	}

	public void setMaxPlayers(int maxPlayers) {
		this.maxPlayers = maxPlayers;
	}

	public int getGameCatId() {
		return gameCatId;
	}

	public void setGameCatId(int gameCatId) {
		this.gameCatId = gameCatId;
	}

	public String getPlayDuration() {
		return playDuration;
	}

	public void setPlayDuration(String playDuration) {
		this.playDuration = playDuration;
	}

	public int getGameDifId() {
		return gameDifId;
	}

	public void setGameDifId(int gameDifId) {
		this.gameDifId = gameDifId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getGameImage() {
		return gameImage;
	}

	public void setGameImage(String gameImage) {
		this.gameImage = gameImage;
	}

	@Override
	public String toString() {
		return "Game [gameId=" + gameId + ", gameName=" + gameName + ", gameEditor=" + gameEditor + ", gameAuthor="
				+ gameAuthor + ", gameYearEdition=" + gameYearEdition + ", gameAge=" + gameAge + ", minPlayers="
				+ minPlayers + ", maxPlayers=" + maxPlayers + ", gameCatId=" + gameCatId + ", playDuration="
				+ playDuration + ", gameDifId=" + gameDifId + ", price=" + price + ", gameImage=" + gameImage + "]";
	}

	


//	@Override
//	public int compareTo(Game o) {
//		return this.getGameName().compareTo(o.getGameName());
//	}
//	
	
	
}
