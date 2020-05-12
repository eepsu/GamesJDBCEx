package be.belfius.GamesJDBC.domain;

public class Difficulty {
	private int difficultyId;
	private String difficultyName;
		
	public Difficulty(int difficultyId, String difficultyName) {
		super();
		this.difficultyId = difficultyId;
		this.difficultyName = difficultyName;
	}
	public Difficulty() {
		// TODO Auto-generated constructor stub
	}
	public int getDifficultyId() {
		return difficultyId;
	}
	public void setDifficultyId(int difficultyId) {
		this.difficultyId = difficultyId;
	}
	public String getDifficultyName() {
		return difficultyName;
	}
	public void setDifficultyName(String difficultyName) {
		this.difficultyName = difficultyName;
	}
	@Override
	public String toString() {
		return "Difficulty [difficultyId=" + difficultyId + ", difficultyName=" + difficultyName + "]";
	}
	
	

}
