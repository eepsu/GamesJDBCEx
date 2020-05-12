package be.belfius.GamesJDBC.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import be.belfius.GamesJDBC.domain.Category;
import be.belfius.GamesJDBC.domain.Difficulty;
import be.belfius.GamesJDBC.domain.Game;


public class GameRepository {

   public Game getFifthGame() { 
	   Game fifthGame =  null;
       try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/games", "root", "");) {
           Statement stmnt = connection.createStatement();
           ResultSet foundGame = stmnt.executeQuery("Select * FROM game WHERE id = 5");
           if (foundGame.next()){
        	   fifthGame = new Game();
        	   fifthGame.setGameId(foundGame.getInt("id"));
        	   fifthGame.setGameName(foundGame.getString("game_name"));
        	   fifthGame.setGameEditor(foundGame.getString("editor"));
        	   fifthGame.setGameAuthor(foundGame.getString("author"));
        	   fifthGame.setGameYearEdition(foundGame.getInt("year_edition"));
        	   fifthGame.setGameAge(foundGame.getString("age"));
        	   fifthGame.setMinPlayers(foundGame.getInt("min_players"));
        	   fifthGame.setMaxPlayers(foundGame.getInt("max_players"));
        	   fifthGame.setGameCatId(foundGame.getInt("category_id"));
        	   fifthGame.setPlayDuration(foundGame.getString("play_duration"));
        	   fifthGame.setGameDifId(foundGame.getInt("difficulty_id"));
        	   fifthGame.setPrice(foundGame.getDouble("price"));
        	   fifthGame.setGameImage(foundGame.getString("image"));  	   
           }
       } catch (SQLException e) {
          e.printStackTrace();
          System.out.println(e.getErrorCode());
       }
       return fifthGame;
   }
       public Game getGameByName(String inGameName) {
    	   Game foundGame =  null;
    	   String inUpperName = inGameName.toUpperCase();
    	   try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/games", "root", "");) {
               PreparedStatement stmnt = connection.prepareStatement("Select game_name, editor,age, price FROM games.game WHERE UPPER(game_name) LIKE ?");
               stmnt.setString(1,"%" + inUpperName + "%");
               ResultSet rsGameByName = stmnt.executeQuery();
               if (rsGameByName.next()){
            	 foundGame = new Game();
            	 foundGame.setGameName(rsGameByName.getString("game_name"));
           		 foundGame.setGameEditor(rsGameByName.getString("editor"));
           		 foundGame.setGameAge(rsGameByName.getString("age"));
           		 foundGame.setPrice(rsGameByName.getDouble("price"));
           		 System.out.println("The game has been found : ");
           		 System.out.println("Name : " + "\t" + foundGame.getGameName());
           		 System.out.println("Editor : "  + foundGame.getGameEditor());
           		 System.out.println("Age : " + "\t" + foundGame.getGameAge());
           		 System.out.println("Price : "  + foundGame.getPrice());
            		 
           	   }else {
           		   System.out.println("Game not found");
           	   }
           } catch (SQLException e) {
              e.printStackTrace();
              System.out.println(e.getErrorCode());
           }
          return foundGame;
       }
          public ArrayList<Game> getSortedGames() {
           ArrayList <Game>sortedGames = new ArrayList();
       	   try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/games", "root", "");) {
                  PreparedStatement stmnt = connection.prepareStatement("Select game_name, editor, price FROM games.game ORDER BY(game_name)");
                  ResultSet rsSortedGames = stmnt.executeQuery();
                  while (rsSortedGames.next()){
                	  Game sortGame = new Game();
                	  sortGame.setGameName(rsSortedGames.getString("game_name"));
                	  sortGame.setGameEditor(rsSortedGames.getString("editor"));
                	  sortGame.setPrice(rsSortedGames.getDouble("price"));
                	  sortedGames.add(sortGame);
                  }
              } catch (SQLException e) {
                 e.printStackTrace();
                 System.out.println(e.getErrorCode());
              }
             return sortedGames;
   }
          public ArrayList<Game> getGameCat() {
        	  ArrayList <Game>gameCat = new ArrayList();
              	   try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/games", "root", "");) {
                     PreparedStatement stmnt = connection.prepareStatement("Select game_name, category_name FROM game inner join category on game.ID = category.ID");
                     ResultSet rsGameCat = stmnt.executeQuery();
                     while (rsGameCat.next()){
                    	Game foundGame = new Game();
                    	Category foundCat = new Category(rsGameCat.getString("category_name"));
                   	  	foundGame.setGameName(rsGameCat.getString("game_name"));
                   	  	foundGame.setGameCat(foundCat);
                   	  	gameCat.add(foundGame);
                     }
                 } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println(e.getErrorCode());
                 }
                return gameCat;
      }
          public Game getChosenGameDet(String inGameCatName) { 
       	   Game chosenGame =  null;
              try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/games", "root", "");) {
            	  PreparedStatement stmnt = connection.prepareStatement(
                  "Select game_name, category_name, difficulty_name FROM games.game"
                  		+ "inner join category on game.category_ID = category.ID inner join difficulty on game.difficulty_ID = difficulty.ID"
                  		+ " WHERE UPPER(game_name) LIKE ?");
                  ResultSet foundGame = stmnt.executeQuery();
                  if (foundGame.next()){
                	  chosenGame = new Game();
                	  Category chosenCat = new Category(foundGame.getString("category_name"));
                	  Difficulty chosenDif = new Difficulty(foundGame.getString("difficulty_name"));
                 	  chosenGame.setGameName(foundGame.getString("game_name"));
                 	  chosenGame.setGameCat(chosenCat);
                 	  chosenGame.setGameDif(chosenDif);
                 	  
                 	  
 //               	  chosenGame.setGameId(foundGame.getInt("id"));
//                	  chosenGame.setGameEditor(foundGame.getString("editor"));
//                	  chosenGame.setGameAuthor(foundGame.getString("author"));
//                	  chosenGame.setGameYearEdition(foundGame.getInt("year_edition"));
//                	  chosenGame.setGameAge(foundGame.getString("age"));
//                	  chosenGame.setMinPlayers(foundGame.getInt("min_players"));
//                	  chosenGame.setMaxPlayers(foundGame.getInt("max_players"));
//                	  chosenGame.setGameCatId(foundGame.getInt("category_id"));
//                	  chosenGame.setPlayDuration(foundGame.getString("play_duration"));
//                	  chosenGame.setGameDifId(foundGame.getInt("difficulty_id"));
//                	  chosenGame.setPrice(foundGame.getDouble("price"));
//                	  chosenGame.setGameImage(foundGame.getString("image"));  	   
                  }
              } catch (SQLException e) {
                 e.printStackTrace();
                 System.out.println(e.getErrorCode());
              }
              return chosenGame;
   
          }
   
   
   
   
// public void addGame(Game game) { // CREATE
// try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/games", "root", "");) {
//////      PreparedStatement statement = connection.prepareStatement("insert into games values ((SELECT LAST_INSERT_ID(),?))");
//     PreparedStatement statement = connection.prepareStatement("insert into game values ((1,?,?,?,?,?,?,?,?,?,?,?,?))");
//     statement.setString(1, game.getGameName());
//     statement.execute();
//
// } catch (SQLException e) {
//    e.printStackTrace();
//    System.out.println(e.getErrorCode());
// }
//}

}
