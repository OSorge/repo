import java.util.ArrayList;
import java.util.Random;
//blueprint for a customer's order
public class Order implements OrderInterface, Comparable<Order>{
	private int orderNo;
	private int orderTime;
	private Day orderDay;
	private Customer customer;
	private ArrayList<Beverage> beverages;
	public Order(int orderTime, Day orderDay, Customer customer) {
		this.orderNo = generateOrder();
		this.orderTime = orderTime;
		this.orderDay = orderDay;
		this.customer = customer;
		this.beverages = new ArrayList<>();
	}
	public int generateOrder() {
		Random random = new Random();
		return random.nextInt(80001) + 10000;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public int getOrderTime() {
		return orderTime;
	}
	public Day getOrderDay() {
		return orderDay;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		beverages.add(new Coffee(bevName, size, extraShot, extraSyrup));
	}
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
		beverages.add(new Smoothie(bevName, size, numOfFruits, addProtein));
	}
	public void addNewBeverage(String bevName, Size size, boolean isWeekend) {
		beverages.add(new Alcohol(bevName, size, isWeekend));
	}
	public int getTotalItems() {
		return beverages.size();
	}
	public Beverage getBeverage(int itemNo) {
		if(itemNo >= 0 && itemNo < beverages.size()) {
			return beverages.get(itemNo);
		}
		return null;
	}
	public double calcOrderTotal() {
		double total = 0;
		for(Beverage beverage : beverages) {
			total += beverage.calcPrice();
		}
		return total;
	}
	public int findNumOfBeveType(Type type) {
		int count = 0;
		for(Beverage beverage : beverages) {
			if(beverage.getType() == type) {
				count++;
			}
		}
		return count;
	}
	public boolean isWeekend() {
		return orderDay == Day.SATURDAY || orderDay == Day.SUNDAY;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Order Number: %d\nOrder Time: %d\nOrder Day: %s\nCustomer: %s\n", orderNo, orderTime, orderDay, customer));
		sb.append("Beverages:\n");
		for(Beverage beverage : beverages) {
			sb.append(beverage.toString()).append("\n");
		}
		return sb.toString();
	}
	@Override
	public int compareTo(Order anotherOrder) {
		return Integer.compare(this.orderNo, anotherOrder.getOrderNo());
	}
}
