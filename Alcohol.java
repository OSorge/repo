//blueprint for alcohol beverages
public class Alcohol extends Beverage {
	private boolean isWeekend;
	public Alcohol(String bevName, Size size, boolean isWeekend) {
		super(bevName, Type.ALCOHOL, size);
		this.isWeekend = isWeekend;
	}
	@Override
	public double calcPrice() {
		double price = getBasePrice();
		price += addSizePrice();
		if(isWeekend) {
			price += 0.60;
		}
		return price;
	}
	public boolean isWeekend() {
		return isWeekend;
	}
	@Override
	public String toString() {
		return String.format("Alcohol [Name: %s, Size: %s, Weekend: %b, Price: %.2f]", getBevName(), getSize(), isWeekend, calcPrice());
	}
	@Override
	public boolean equals(Object anotherBev) {
		if(this == anotherBev) {
			return true;
		}
		Alcohol other = (Alcohol) anotherBev;
		if(super.equals(other) && this.isWeekend == other.isWeekend) {
			return true;
		}
		else {
			return false;
		}
	}
}
