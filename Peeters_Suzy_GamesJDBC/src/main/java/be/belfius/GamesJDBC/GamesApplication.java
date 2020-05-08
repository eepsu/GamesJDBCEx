package be.belfius.GamesJDBC;

import be.belfius.GamesJDBC.domain.Game;
import be.belfius.GamesJDBC.services.GameService;

public class GamesApplication {

	public static void main(String[] args) {
		 
		GameService gameService = new GameService();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(gameService.getFirstCategory());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


