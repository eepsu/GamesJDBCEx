package be.belfius.GamesJDBC;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	import be.belfius.GamesJDBC.domain.Category;
	import be.belfius.GamesJDBC.domain.Game;
	import be.belfius.GamesJDBC.repository.CategRepository;
	import be.belfius.GamesJDBC.services.GameService;


	public class Menu {
		public String menuChoice;
		public boolean gameFound = false;
		
		static GameService gameService = new GameService();
		static public Scanner scanner = new Scanner(System.in);
		
		
		public void showMenu(String menuChoice) {
			System.out.println("Make your choice :");
			System.out.println("0. Stop");
			System.out.println("1. Show the first game category");
			System.out.println("2. Show the fifth game");
			System.out.println("3. Show the first borrower");
			System.out.println("4. Show a game of your choice");
//			System.out.println("5. Show all games");
//			System.out.println("6. Show a list of games with category");
			String inChoice = scanner.next();
			setMenuChoice(inChoice);
			}
			
		public void setMenuChoice(String menuChoice) {
			this.menuChoice = menuChoice;
		}

		public void menuOptions() {
			do {
				showMenu(menuChoice);
				
				switch(menuChoice) {
				case "0" :
					System.out.println("Bye bye");
					break;
				case "1" :
					System.out.println("The first game category is : " + gameService.getFirstCategory().getCatName());
					break;
				case "2" :
					System.out.println("The fifth game is : ");
					System.out.println(gameService.getFifthGame());
					break;
				case "3" :
					System.out.print("The first borrower is : ");
					System.out.println(gameService.getFirstBorrower().getBorrowerName() + " from " + gameService.getFirstBorrower().getBorrowerCity());
					break;
				case "4" :
					System.out.print("Give a part of the game name : ");
					String inGameName = scanner.next();
					gameService.getGameByName(inGameName);
					break;
//				case "5" :
//					List<Game> sortedList = gameService.sortedGames();
//					for (Game oneGame : sortedList) { 
//						System.out.println(oneGame.getGameName() + "\t" + oneGame.getGameEditor() + "\t" + oneGame.getPrice());
//					}
//					break;
//				case "6" :
//					List<Game> allGames = gameService.getAllGames();
//					List<Category> allCats = gameService.getAllCategories();
//					for (Game oneGame : allGames) { 
//						for (Category foundCat : allCats) {
//							if (oneGame.getGameCatId()==(foundCat.getCatId())){
//								System.out.println("GAME : " + oneGame.getGameName()+ "\t" + "TYPE : " + foundCat.getCatName());
//							}
//						}
//					}
//					break;
				default :
					System.out.println("Wrong choice");
				}
			}while (!menuChoice.contentEquals("0"));
			}	
		}
		

