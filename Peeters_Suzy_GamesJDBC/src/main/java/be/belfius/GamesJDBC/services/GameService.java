package be.belfius.GamesJDBC.services;

import java.util.List;

import be.belfius.GamesJDBC.domain.Game;
import be.belfius.GamesJDBC.repository.GameRepository;


public class GameService {
	private GameRepository gameRepository = new GameRepository();
	
	
//	public List<Game> getAllGames() {
//		return gameRepository.getAllGames();
//	}
		
	public void addGame(Game game) {
		gameRepository.addGame(game);
	}
}
