
public class ClassicMoviePriceType implements MoviePriceType {
	@Override
	public int calculatePrice(int daysRented) {
		int price = 1500;
		
		if(daysRented > 3)
			price += (daysRented - 3) * 1500;
		
		return price;
	}

	@Override
	public int calculateBonus(int daysRented) {
		return DEFAULT_BONUS_POINT;
	}

}
