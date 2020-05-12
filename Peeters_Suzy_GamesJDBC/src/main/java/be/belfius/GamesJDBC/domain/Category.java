package be.belfius.GamesJDBC.domain;

public class Category {
	private int catId;
	private String catName;
	
	public Category(int catId, String catName) {
		super();
		this.catId = catId;
		this.catName = catName;
	}

	
	public Category(String catName) {
		this.catName = catName;
		// TODO Auto-generated constructor stub
	}


	public int getCatId() {
		return catId;
	}
	
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	@Override
	public String toString() {
		return "Category [catId=" + catId + ", catName=" + catName + "]";
	}
	
	
}
