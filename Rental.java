

public class Rental {
	private int daysRented;
	private Movie movie;

	Rental() {		
	}

	public Rental(int days, Movie myMovie) {
		setMovie(myMovie);
		setDaysRented(days);
	}

	private void setMovie(Movie movie) {
		this.movie = movie;
	}
	private void setDaysRented(int daysRented) {
		this.daysRented = daysRented;
	}

	public int getDaysRented() {
		return this.daysRented;
	}
	public String getMovieName() {
		return movie.getName();
	}
	
	public int calculateBonusPoints() {	
		return movie.calculateBonus(daysRented);
	}
	
	public int calculateLineAmount() {
		return movie.calculatePrice(daysRented);
	}
}