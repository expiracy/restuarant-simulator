package order;

import java.util.LinkedList;
import java.util.List;


public class Orders {
    List<Order> orders = new LinkedList<>();

    public void add(Order food) {
        this.orders.add(food);
    }

    public Order serve() {
        Order food = this.orders.get(0);
        this.orders.remove(0);
        return food;
    }

    public int getNumberOfOrders() {
        return this.orders.size();
    }
}
