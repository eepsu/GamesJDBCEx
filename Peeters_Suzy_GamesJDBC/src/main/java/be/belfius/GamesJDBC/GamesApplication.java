package be.belfius.GamesJDBC;

import be.belfius.GamesJDBC.Menu;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class GamesApplication {
	Logger logger = LoggerFactory.getLogger(GamesApplication.class);
	public String inMenuChoice;
		
	static Menu gameMenu = new Menu();
					
			
	public static void main(String[] args){
		System.setProperty("org.slf4j.simpleLogger.showDateTime", "true");  //Use this setting to show the date and time
        System.setProperty("org.slf4j.simpleLogger.dateTimeFormat", "yyyy-MM-dd HH:mm:ss"); //Use this setting to format te date and time
        new GamesApplication().logMessage("log info");
        
		gameMenu.menuOptions();
				
	}
	 private void logMessage(String message) {
		 logger.info(message);
	     
	    }
		
}


