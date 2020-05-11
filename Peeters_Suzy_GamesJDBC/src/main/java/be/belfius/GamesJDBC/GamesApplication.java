package be.belfius.GamesJDBC;

import be.belfius.GamesJDBC.Menu;
//import be.belfius.GamesJDBC.domain.Game;
//import be.belfius.GamesJDBC.services.GameService;

public class GamesApplication {

	public String inMenuChoice;
		
	static Menu gameMenu = new Menu();
					
			
	public static void main(String[] args)
	{
		gameMenu.menuOptions();
				
	}	
		
}


