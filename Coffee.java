//blueprint for a coffee beverage
public class Coffee extends Beverage {
	private boolean extraShot;
	private boolean extraSyrup;
	private static final double EXTRA_SHOT_PRICE = 0.5;
	private static final double EXTRA_SYRUP_PRICE = 0.5;
	public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		super(bevName, Type.COFFEE, size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}
	public boolean getExtraShot() {
		return extraShot;
	}
	public boolean getExtraSyrup() {
		return extraSyrup;
	}
	@Override
	public double calcPrice() {
		double price = getBasePrice();
		price += addSizePrice();
		if(extraShot) {
			price += EXTRA_SHOT_PRICE;
		}
		if(extraSyrup) {
			price += EXTRA_SYRUP_PRICE;
		}
		return price;
	}
	@Override
	public String toString() {
		return String.format("Coffee [Name: %s, Size: %s, Extra Shot: %b, Extra Syrup: %b, Price: %.2f]", getBevName(), getSize(), extraShot, extraSyrup, calcPrice());
	}
	@Override
	public boolean equals(Object anotherBev) {
		if(this == anotherBev)
			return true;
		Coffee other = (Coffee) anotherBev;
		if(super.equals(other) && this.extraShot == other.extraShot && this.extraSyrup == other.extraSyrup) {
			return true;
		}
		else {
			return false;
		}
	}
}
