

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
	
	public int calculateBonusPoints(Rental rent) {	
		if((rent.getMovie().getPriceCode() == Movie.RELEASE)
				&& (rent.getDaysRented() > 1))
			return 2;
		
		return 1;
	}
	
	public int calculateLineAmount(Rental rent) {
		int lineAmount = 0;
		
		switch(rent.getMovie().getPriceCode()) {
		case Movie.REGULAR:
			lineAmount += 2000;
			if(rent.getDaysRented() > 2) {
				lineAmount += (rent.getDaysRented() - 2) * 1500;
			}
			break;
		case Movie.CLASSIC:
			lineAmount += 1500;
			if(rent.getDaysRented() > 3) {
				lineAmount += (rent.getDaysRented() - 3) * 1500;
			}
			break;
		case Movie.RELEASE:
			lineAmount += (rent.getDaysRented() * 3000);
			break;
		}
		
		return lineAmount;
	}
	
	public String statement() {
		String rentalList = "Statement\n";
		int totalAmount = 0;
		int bonusPoints = 0;
		int lineAmount = 0;
		
		for(Rental rent:rentals) {
			lineAmount = calculateLineAmount(rent);
			bonusPoints += calculateBonusPoints(rent);

			rentalList += rent.getMovie().getName() + "\t" + String.valueOf(lineAmount) + "\n";			
			totalAmount += lineAmount;
		}

		rentalList += "Total\t" + String.valueOf(totalAmount) + "\n";
		rentalList += "Bonus Point:\t" + String.valueOf(bonusPoints) + "\n";
		return rentalList;
	}
}
