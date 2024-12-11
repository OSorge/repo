//blueprint for all beverages
public abstract class Beverage {
	private String bevName;
	private Type type;
	private Size size;
	private static final double BASE_PRICE = 2.0;
	private static final double SIZE_PRICE_MEDIUM = 1.0;
	private static final double SIZE_PRICE_LARGE = 2.0;
	public Beverage(String bevName, Type type, Size size) {
		this.bevName = bevName;
		this.type = type;
		this.size = size;
	}
	public abstract double calcPrice();
	public double getBasePrice() {
		return BASE_PRICE;
	}
	public String getBevName() {
		return bevName;
	}
	public Type getType() {
		return type;
	}
	public Size getSize() {
		return size;
	}
	public double addSizePrice() {
		switch(size) {
		case MEDIUM:
			return SIZE_PRICE_MEDIUM;
		case LARGE:
			return SIZE_PRICE_LARGE;
		default:
			return 0.0;
		}
	}
	@Override
	public String toString() {
		return String.format("Beverage [Name: %s, Size: %s]", bevName, size);
	}
	@Override
	public boolean equals(Object anotherBev) {
		if(this == anotherBev)
			return true;
		Beverage other = (Beverage) anotherBev;
		if(bevName.equals(other.bevName) && type == other.type && size == other.size)
			return true;
		else
			return false;
	}
}
