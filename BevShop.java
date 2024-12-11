import java.util.ArrayList;
//Utilizes every class to process orders
public class BevShop implements BevShopInterface {
    private ArrayList<Order> orders;
    private Order currentOrder;
    public BevShop() {
        orders = new ArrayList<>();
    }
    @Override
    public boolean isValidTime(int time) {
        return time >= MIN_TIME && time <= MAX_TIME;
    }
    @Override
    public int getMaxNumOfFruits() {
        return MAX_FRUIT;
    }
    @Override
    public int getMinAgeForAlcohol() {
        return MIN_AGE_FOR_ALCOHOL;
    }
    @Override
    public boolean isMaxFruit(int numOfFruits) {
        return numOfFruits > MAX_FRUIT;
    }
    @Override
    public int getMaxOrderForAlcohol() {
        return MAX_ORDER_FOR_ALCOHOL;
    }
    @Override
    public boolean isEligibleForMore() {
        return getNumOfAlcoholDrink() < MAX_ORDER_FOR_ALCOHOL;
    }
    @Override
    public int getNumOfAlcoholDrink() {
        return currentOrder.findNumOfBeveType(Type.ALCOHOL);
    }
    @Override
    public boolean isValidAge(int age) {
        return age >= MIN_AGE_FOR_ALCOHOL;
    }
    @Override
    public void startNewOrder(int time, Day day, Customer customer) {
        currentOrder = new Order(time, day, customer);
        orders.add(currentOrder);
    }
    @Override
    public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
        currentOrder.addNewBeverage(bevName, size, extraShot, extraSyrup);
    }
    @Override
    public void processAlcoholOrder(String bevName, Size size, boolean isWeekend) {
        if (isEligibleForMore()) {
            currentOrder.addNewBeverage(bevName, size, isWeekend);
        }
    }
    @Override
    public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
        if (!isMaxFruit(numOfFruits)) {
            currentOrder.addNewBeverage(bevName, size, numOfFruits, addProtein);
        }
    }
    @Override
    public int findOrder(int orderNo) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderNo() == orderNo) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public double totalOrderPrice(int orderNo) {
        int index = findOrder(orderNo);
        if (index != -1) {
            return orders.get(index).calcOrderTotal();
        }
        return 0;
    }
    @Override
    public double totalMonthlySale() {
        double total = 0;
        for (Order order : orders) {
            total += order.calcOrderTotal();
        }
        return total;
    }
    @Override
    public int totalNumOfMonthlyOrders() {
        return orders.size();
    }
    @Override
    public Order getCurrentOrder() {
        return currentOrder;
    }
    @Override
    public Order getOrderAtIndex(int index) {
        if (index >= 0 && index < orders.size()) {
            return orders.get(index);
        }
        return null;
    }
    @Override
    public void sortOrders() {
        for (int i = 0; i < orders.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < orders.size(); j++) {
                if (orders.get(j).getOrderNo() < orders.get(minIndex).getOrderNo()) {
                    minIndex = j;
                }
            }
            Order temp = orders.get(minIndex);
            orders.set(minIndex, orders.get(i));
            orders.set(i, temp);
        }
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Monthly Orders:\n");
        for (Order order : orders) {
            result.append(order.toString()).append("\n");
        }
        result.append("Total Monthly Sale: $").append(totalMonthlySale());
        return result.toString();
    }
}