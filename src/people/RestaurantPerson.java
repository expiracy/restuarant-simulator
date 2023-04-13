package people;

import order.Orders;

public abstract class RestaurantPerson {
    protected String name;
    protected Orders orders;

    public String getName() {
        return this.name;
    }

    public Orders getOrders() {
        return this.orders;
    }
}
