

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
	
	public String statement() {
		String rentalList = "Statement\n";
		int totalAmount = 0;
		int bonusPoints = 0;
		int lineAmount = 0;
		
		for(Rental rent:rentals) {
			lineAmount = rent.calculateLineAmount();
			bonusPoints += rent.calculateBonusPoints();

			rentalList += rent.getMovieName() + "\t" + String.valueOf(lineAmount) + "\n";			
			totalAmount += lineAmount;
		}

		rentalList += "Total\t" + String.valueOf(totalAmount) + "\n";
		rentalList += "Bonus Point:\t" + String.valueOf(bonusPoints) + "\n";
		return rentalList;
	}
}
