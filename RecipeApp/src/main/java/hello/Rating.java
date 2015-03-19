package hello;

public class Rating {
	private long recipeId;
	private long addedBy;
	private String description;
	private double rating;
	
	public Rating(){
		recipeId = 0;
		addedBy = 0;
		description = "";
		rating = 0;
		
	}
	
	public Rating(long recipeId, long addedBy, String description, double rating){
		this.recipeId = recipeId;
		this.addedBy = addedBy;
		this.description = description;
		this.rating = rating;		
	}
	
	
	public long getRecipeId() {
		return recipeId;
	}
	public void setRecipeId(long recipeId) {
		this.recipeId = recipeId;
	}
	public long getAddedBy() {
		return addedBy;
	}
	public void setAddedBy(long addedBy) {
		this.addedBy = addedBy;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}	
	
	public String toString(){
		return "{"
				+ "	recipeId: "+recipeId+","
				+ "	addedBy: "+addedBy+","
				+ "	description: \""+description+"\","
						+ "	rating: "+rating
						+ "	}";
	}
	
}
