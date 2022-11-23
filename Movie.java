

public class Movie {
	public static final int REGULAR = 0;
	public static final int CLASSIC = 1;
	public static final int RELEASE = 2;

	private String name;
	private MoviePriceType priceType;

	public Movie() {
	}

	private MoviePriceType createPriceTypeFromLegacyPriceCode(int priceCode) {
		switch (priceCode) {
		case REGULAR:
			return new RegularMoviePriceType();
		case CLASSIC:
			return new ClassicMoviePriceType();
		case RELEASE:
			return new ReleaseMoviePriceType();
		default:
			return null;
		} 
	}

	public Movie(String name, int legacyPriceCode) {
		this.name = name;
		this.priceType = createPriceTypeFromLegacyPriceCode(legacyPriceCode);
	}

	public Movie(String name, MoviePriceType priceType) {
		this.name = name;
		this.priceType = priceType;
	}

	public String getName() {
		return this.name;
	}

	public MoviePriceType getPriceType() {
		return this.priceType;
	}
	
	public void setPriceType(MoviePriceType priceType) {
		this.priceType = priceType;
	}
	
	public void setPriceType(int legacyPriceCode) {
		this.priceType = createPriceTypeFromLegacyPriceCode(legacyPriceCode);
	}
	

	public int calculateBonus(int daysRented) {	
		return priceType.calculateBonus(daysRented);
	}
	
	public int calculatePrice(int daysRented) {
		return priceType.calculatePrice(daysRented);
	}
}

