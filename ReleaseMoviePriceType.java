
public class ReleaseMoviePriceType implements MoviePriceType {
	@Override
	public int calculatePrice(int daysRented) {
		return 3000 * daysRented;
	}

	@Override
	public int calculateBonus(int daysRented) {
		if(daysRented > 1)
			return DEFAULT_BONUS_POINT + 1;
			
		return DEFAULT_BONUS_POINT;
	}

}
