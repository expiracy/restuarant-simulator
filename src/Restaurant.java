import order.Orders;
import people.Customer;
import people.Waiter;

public class Restaurant {
    public static void main(String[] args) throws InterruptedException {
        String[] names = {"John", "Tim", "Sara", "Jack", "Scarlett", "Charlotte"};

        Orders orders = new Orders();

        Thread jeeves = new Thread(new Waiter("Jeeves", orders));
        Thread bob = new Thread(new Waiter("Bob", orders));

        // Waiters are starting their job
        jeeves.start();
        bob.start();

        // Generate customers
        while (true) {
            String randomName = names[(int) (Math.random() * names.length)];
            new Thread(new Customer(randomName, orders)).start();
            Thread.sleep(3000);
        }
    }
}
