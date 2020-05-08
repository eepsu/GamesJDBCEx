package be.belfius.GamesJDBC.services;

import java.util.List;

import be.belfius.GamesJDBC.domain.Category;
import be.belfius.GamesJDBC.domain.Game;
import be.belfius.GamesJDBC.repository.GameRepository;
import be.belfius.GamesJDBC.repository.CategRepository;


public class GameService {
	private GameRepository gameRepository = new GameRepository();
	private CategRepository categRepository = new CategRepository();
	

	public Category getFirstCategory()  {
	return categRepository.getFirstCategory();
}
	
		public void addGame(Game game) {
		gameRepository.addGame(game);
	}
}
