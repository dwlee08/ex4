
public class RegularMoviePriceType implements MoviePriceType {
	@Override
	public int calculatePrice(int daysRented) {
		int price = 2000;
		
		if(daysRented > 2)
			price += (daysRented - 2) * 1500;
		
		return price;
	}

	@Override
	public int calculateBonus(int daysRented) {
		return DEFAULT_BONUS_POINT;
	}

}
