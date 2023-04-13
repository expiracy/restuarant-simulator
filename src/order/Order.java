package order;

public class Order {
    private String food;
    private String customer;

    public Order(String food, String customer) {
        this.food = food;
        this.customer = customer;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
