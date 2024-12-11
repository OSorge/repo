//interface implemented by BevShop
public interface BevShopInterface {
    int MAX_FRUIT = 5;
    int MAX_ORDER_FOR_ALCOHOL = 3;
    int MAX_TIME = 23;
    int MIN_AGE_FOR_ALCOHOL = 21;
    int MIN_TIME = 8;
    int findOrder(int orderNo);
    Order getCurrentOrder();
    int getMaxNumOfFruits();
    int getMaxOrderForAlcohol();
    int getMinAgeForAlcohol();
    int getNumOfAlcoholDrink();
    Order getOrderAtIndex(int index);
    boolean isEligibleForMore();
    boolean isMaxFruit(int numOfFruits);
    boolean isValidAge(int age);
    boolean isValidTime(int time);
    void processAlcoholOrder(String bevName, Size size, boolean isWeekend);
    void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup);
    void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein);
    void sortOrders();
    void startNewOrder(int time, Day day, Customer customer);
    double totalMonthlySale();
    int totalNumOfMonthlyOrders();
    double totalOrderPrice(int orderNo);
}