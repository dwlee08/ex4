public interface MoviePriceType {
	static final int DEFAULT_BONUS_POINT = 1; 
	
	abstract int calculatePrice(int daysRented);
	abstract int calculateBonus(int daysRented);
}
