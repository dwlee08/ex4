
public class Main {

	public static void main(String[] args) {
		Customer me = new Customer("DO");

		Movie godfather = new Movie("God Father", Movie.CLASSIC);
		Movie avatar = new Movie("Avatar", Movie.REGULAR);
		Movie avengers = new Movie("Avengers", Movie.RELEASE);
		
		me.addRental(new Rental(14, godfather));
		me.addRental(new Rental(3, avatar));
		me.addRental(new Rental(7, avengers));

		System.out.println(me.statement());
	}
}
