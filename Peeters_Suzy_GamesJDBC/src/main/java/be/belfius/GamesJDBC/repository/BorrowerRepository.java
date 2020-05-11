package be.belfius.GamesJDBC.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import be.belfius.GamesJDBC.domain.Borrower;


public class BorrowerRepository {
	public Borrower getFirstBorrower() { 
		Borrower firstBorrower =  null;
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/games", "root", "");) {
            Statement stmnt = connection.createStatement();
            ResultSet foundBorrower = stmnt.executeQuery("Select borrower_name, city FROM borrower WHERE id = 1");
            if (foundBorrower.next()){
            	firstBorrower = new Borrower();
            	firstBorrower.setBorrowerName(foundBorrower.getString("borrower_name"));
            	firstBorrower.setBorrowerCity(foundBorrower.getString("city"));
            }
        } catch (SQLException e) {
           e.printStackTrace();
           System.out.println(e.getErrorCode());
        }
        return firstBorrower;
    }
}
