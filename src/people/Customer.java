package people;

import order.Foods;
import order.Order;
import order.Orders;

public class Customer extends RestaurantPerson implements Runnable {
    public Customer(String name, Orders orders) {
        this.name = name;
        this.orders = orders;
    }

    public void order() {
        synchronized (this.orders) {
            String food = Foods.foods[(int) (Math.random() * Foods.foods.length)];
            this.orders.add(new Order(food, this.name));
            System.out.println("ORDER: " + this.name + " has ordered " + food);
            this.orders.notify();
        }
    }

    @Override
    public void run() {
        this.order();
    }
}
