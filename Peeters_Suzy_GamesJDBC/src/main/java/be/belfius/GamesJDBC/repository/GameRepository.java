package be.belfius.GamesJDBC.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


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
