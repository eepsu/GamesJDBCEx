package be.belfius.GamesJDBC;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;



import be.belfius.GamesJDBC.domain.Borrower;
import be.belfius.GamesJDBC.domain.Category;
import be.belfius.GamesJDBC.domain.Difficulty;
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
			System.out.println("5. Show all games");
			System.out.println("6. Show a list of games and choose a game");
			System.out.println("7. Show borrowed games");
			System.out.println("8. Advanced search : difficulty");
			System.out.println("9. Complex search borrowers");
			String inChoice = scanner.next();
			setMenuChoice(inChoice);
			}
			
		public void setMenuChoice(String menuChoice) {
			this.menuChoice = menuChoice;
		}

		public void menuOptions() {
			do {
				System.out.println();
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
				case "5" :
					List<Game> sortedList = gameService.sortedGames();
					for (Game oneGame : sortedList) { 
						System.out.println(oneGame.getGameName() + "\t" + oneGame.getGameEditor() + "\t" + oneGame.getPrice());
					}
					break;
				case "6" :
					List<Game>gameCat = gameService.getGameCat();
					for (Game oneGame : gameCat) {
						System.out.println("Game name : " + oneGame.getGameName() + "\t" +  "Game Category : " + oneGame.getGameCat().getCatName() );
					}
					System.out.print("Give a part of the game name : ");
					String inGameCatName = scanner.next();
					gameService.getChosenGameDet(inGameCatName);
					break;
				case "7" :
					List <Game> borrowedGames = gameService.getBorrowedGames();
					if (borrowedGames.size() == 0) {
						System.out.println("No matches");
					}else {
						System.out.printf("%-30s %-40s %-20s %-20s\n","Borrowername","Gamename","Borrow date","Return date" );
						System.out.printf("%-30s %-40s %-20s %-20s\n","------------","--------","-----------","-----------" );
						for (Game oneGame : borrowedGames)
							System.out.printf("%-30s %-40s %-20s %-20s\n",oneGame.getGameBorrower().getBorrowerName(),oneGame.getGameName(),oneGame.getGameBorrow().getBorrowDate(),oneGame.getGameBorrow().getReturnDate());
					}
					break;
				case "8" :		
					List<Difficulty>getAllDiff = gameService.getAllDiff();
					for (Difficulty oneDif : getAllDiff) {
						System.out.println(oneDif.getDifficultyId() + "  " + oneDif.getDifficultyName() );
						}
					System.out.println("Choose the minimum level by entering the number : ");
					Integer inDiff = scanner.nextInt();
					gameService.getGamesByDiff(inDiff);
					break;
				case "9" :
					System.out.print("Give a part of the borrower name : ");
					String inBorrowerName = scanner.next();
					gameService.getBorrowerByName(inBorrowerName);
					List<Borrower>foundBorrowers = gameService.getBorrowerByName(inBorrowerName);
					if (foundBorrowers.size() == 0) {
						System.out.println("No borrowers found with that name");
					}else {
						System.out.printf("%-15s %-15s %-15s %-15s\n","Name","City","Telephone","Mail" );
						System.out.printf("%-15s %-15s %-15s %-15s\n","----","----","---------","----" );
						for (Borrower oneBorrower : foundBorrowers) {
							System.out.printf("%-15s %-15s %-15s %-15s\n",oneBorrower.getBorrowerName(),oneBorrower.getBorrowerCity(),oneBorrower.getBorrowerTel(),oneBorrower.getBorrowerMail());
						}
					}
					break;
					
				default :
					System.out.println("Wrong choice");
				}
			}while (!menuChoice.contentEquals("0"));
			}	
		}
		

