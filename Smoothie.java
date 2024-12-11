//blueprint for a smoothie beverage
public class Smoothie extends Beverage{
	private int numOfFruits;
	private boolean addProtein;
	private static final double FRUIT_COST = 0.5;
	private static final double PROTEIN_COST = 1.5;
	public Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein) {
		super(bevName, Type.SMOOTHIE, size);
		this.numOfFruits = numOfFruits;
		this.addProtein = addProtein;
	}
	public int getNumOfFruits() {
		return numOfFruits;
	}
	public boolean getAddProtein() {
		return addProtein;
	}
	@Override
	public double calcPrice() {
		double price = getBasePrice();
		price += addSizePrice();
		price += numOfFruits * FRUIT_COST;
		if(addProtein) {
			price += PROTEIN_COST;
		}
		return price;
	}
	@Override
	public String toString() {
		return String.format("Smoothie [Name: %s, Size: %s, Number of Fruits: %d, Add Protein: %b, Price: %.2f]", getBevName(), getSize(), numOfFruits, addProtein, calcPrice());
	}
	@Override
	public boolean equals(Object anotherBev) {
		if(this == anotherBev) {
			return true;
		}
		Smoothie other = (Smoothie) anotherBev;
		if(super.equals(other) && this.numOfFruits == other.numOfFruits && this.addProtein == other.addProtein) {
			return true;
		}
		else {
			return false;
		}
	}
}
