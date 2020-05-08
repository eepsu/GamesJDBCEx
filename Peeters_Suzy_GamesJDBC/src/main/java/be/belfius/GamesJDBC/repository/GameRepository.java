package be.belfius.GamesJDBC.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import be.belfius.GamesJDBC.domain.Game;



public class GameRepository {
//	private List<Game> games = new ArrayList<>();
//	
//public List<Game>getAllGames(){
//		return games;
//	}
	
   public void addGame(Game game) { // CREATE
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/games", "root", "");) {
//    //      PreparedStatement statement = connection.prepareStatement("insert into games values ((SELECT LAST_INSERT_ID(),?))");
            PreparedStatement statement = connection.prepareStatement("insert into game values ((1,?,?,?,?,?,?,?,?,?,?,?,?))");
            statement.setString(1, game.getGameName());
            statement.execute();

        } catch (SQLException e) {
           e.printStackTrace();
           System.out.println(e.getErrorCode());
        }
    }


}
