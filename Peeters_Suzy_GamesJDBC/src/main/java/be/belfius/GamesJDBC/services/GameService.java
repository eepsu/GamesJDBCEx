package be.belfius.GamesJDBC.services;

import java.util.List;

import be.belfius.GamesJDBC.domain.Borrower;
import be.belfius.GamesJDBC.domain.Category;
import be.belfius.GamesJDBC.domain.Difficulty;
import be.belfius.GamesJDBC.domain.Game;
import be.belfius.GamesJDBC.repository.GameRepository;
import be.belfius.GamesJDBC.repository.BorrowerRepository;
import be.belfius.GamesJDBC.repository.CategRepository;
import be.belfius.GamesJDBC.repository.DifficultyRepository;


public class GameService {
	private GameRepository gameRepository = new GameRepository();
	private CategRepository categRepository = new CategRepository();
	private BorrowerRepository borrowerRepository = new BorrowerRepository();
	private DifficultyRepository difficultyRepository = new DifficultyRepository();
	

	public Category getFirstCategory()  {
		return categRepository.getFirstCategory();
}
	public Game getFifthGame() {
		return gameRepository.getFifthGame();
	}
	public Borrower getFirstBorrower() {
		return borrowerRepository.getFirstBorrower();
	}
	public Game getGameByName(String inGameName) {
		return gameRepository.getGameByName(inGameName);
	}
	public List<Game> sortedGames() {
		return gameRepository.getSortedGames();
	}
	public List<Game> getGameCat() {
		return gameRepository.getGameCat();
	}
	public List<Difficulty> getAllDiff() {
		return difficultyRepository.getAllDiff();
	}
	public Game getChosenGameDet(String inGameCatName) {
		return gameRepository.getChosenGameDet(inGameCatName);
	}
	
	
	
	
	
	
//		public void addGame(Game game) {
//		gameRepository.addGame(game);
//	}
	
}
