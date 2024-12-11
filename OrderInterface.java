//interface implemented by the Order class
public interface OrderInterface {
	void addNewBeverage(String bevName, Size size, boolean isWeekend);
	void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup);
	void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein);
	double calcOrderTotal();
	int findNumOfBeveType(Type type);
	Beverage getBeverage(int itemNo);
	boolean isWeekend();
}
