package be.belfius.GamesJDBC.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import be.belfius.GamesJDBC.domain.Difficulty;

public class DifficultyRepository {
	
	public ArrayList<Difficulty> getAllDiff() {
        ArrayList <Difficulty>allDiff = new ArrayList();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/games", "root", "");) {
            PreparedStatement stmnt = connection.prepareStatement("Select id, difficulty_name FROM games.difficulty ");
            ResultSet rsAllDiff = stmnt.executeQuery();
            while (rsAllDiff.next()){
          	  Difficulty oneDiff = new Difficulty();
          	  oneDiff.setDifficultyId(rsAllDiff.getInt("id"));
          	  oneDiff.setDifficultyName(rsAllDiff.getString("difficulty_name"));
          	  allDiff.add(oneDiff);
            }
        } catch (SQLException e) {
           e.printStackTrace();
           System.out.println(e.getErrorCode());
        }
       return allDiff;
	}
}
