package services;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Assert;

import be.belfius.GamesJDBC.services.GameService;

public class GameServiceTest {
	 
	    public GameService gameService = new GameService();
	    
	    @Test
	    public void testGetAllDIff() {
	        Assert.assertFalse(gameService.getAllDiff().isEmpty());
	    }
	    
	    

	}