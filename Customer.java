

import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Rental> rentals = new ArrayList<Rental>();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental newRental) {
		rentals.add(newRental);
	}

	public String getNmae() {
		return this.name;
	}
	
	private int getTotalAmount() {
		int totalAmount = 0;
		
		for (Rental rent:rentals)
			totalAmount += rent.calculateLineAmount();
		
		return totalAmount;
	}
	
	private int getTotalBonus() {
		int totalBonus = 0;
		
		for (Rental rent:rentals)
			totalBonus += rent.calculateBonusPoints();
		
		return totalBonus;
	}
	
	private String createMovieStatement() {
		String rentalList = "";
		
		for (Rental rent:rentals)
			rentalList += rent.getMovieName() + "\t" + rent.calculateLineAmount() + "\n";
		
		return rentalList;
	}
	
	public String statement() {
		String rentalList = "Statement\n";
		
		rentalList += createMovieStatement();
		rentalList += "Total\t" + String.valueOf(getTotalAmount()) + "\n";
		rentalList += "Bonus Point:\t" + String.valueOf(getTotalBonus()) + "\n";
		return rentalList;
	}
}
