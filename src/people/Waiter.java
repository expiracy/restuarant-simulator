package people;

import order.Order;
import order.Orders;

public class Waiter extends RestaurantPerson implements Runnable {
    public Waiter(String name, Orders orders) {
        this.name = name;
        this.orders = orders;
    }

    public void serve() throws InterruptedException {
        synchronized (this.orders) {
            if (this.orders.getNumberOfOrders() == 0) {
                this.orders.wait(); // Must be inside the synchronized block
            } else {
                Order order = this.orders.serve();
                System.out.println("SERVICE: " + this.name + " served " + order.getFood() + " to " + order.getCustomer());
            }
        }
        Thread.sleep(5000);
    }

    @Override
    public void run() {
        try {
            while (true) {
                this.serve();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
