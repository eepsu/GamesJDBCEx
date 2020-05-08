package be.belfius.GamesJDBC.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import be.belfius.GamesJDBC.domain.Category;

public class CategRepository {

	public Category getFirstCategory() { 
		Category firstCat =  null;
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/games", "root", "");) {
            Statement stmnt = connection.createStatement();
            ResultSet firstCateg = stmnt.executeQuery("Select category_name FROM category");
            firstCateg.next();  //selectie van de row
            firstCat = new Category(0,firstCateg.getString("category_name")); // object maken van de row
         
        } catch (SQLException e) {
           e.printStackTrace();
           System.out.println(e.getErrorCode());
        }
        return firstCat;
    }
}
