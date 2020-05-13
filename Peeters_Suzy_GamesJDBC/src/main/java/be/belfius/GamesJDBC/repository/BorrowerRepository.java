package be.belfius.GamesJDBC.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
	 public ArrayList<Borrower> getBorrowerByName(String inBorrowerName) {
	  	   ArrayList<Borrower> borrowerByName = new ArrayList();
	  	   Borrower foundBorrower =  null;
	  	   String inUpperName = inBorrowerName.toUpperCase();
	  	   try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/games", "root", "");) {
	  		   PreparedStatement stmnt = connection.prepareStatement("Select borrower_name, city,telephone, email FROM games.borrower WHERE UPPER(borrower_name) LIKE ? ORDER BY borrower_name");
	  		   stmnt.setString(1,"%" + inUpperName + "%");
	  		   ResultSet rsBorrowerByName = stmnt.executeQuery();
	  		   while (rsBorrowerByName.next()){
	  			   foundBorrower = new Borrower();
	  			   foundBorrower.setBorrowerName(rsBorrowerByName.getString("borrower_name"));
	  			   foundBorrower.setBorrowerCity(rsBorrowerByName.getString("city"));
	  			   foundBorrower.setBorrowerTel(rsBorrowerByName.getString("telephone"));
	  			   foundBorrower.setBorrowerMail(rsBorrowerByName.getString("email"));
	  			   borrowerByName.add(foundBorrower);
	  			   }
         } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getErrorCode());
         }
        return borrowerByName;
}
}