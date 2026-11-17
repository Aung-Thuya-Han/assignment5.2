public class Main {
    public static void main(String[] args) throws InterruptedException {
        Theater theater = new Theater(10);
        Customer[] customers = new Customer[15];

        for (int i = 0; i < customers.length; i++) {
            int tickets = (int) (Math.random() * 4) + 1;
            customers[i] = new Customer("Customer " + (i + 1), theater, tickets);
            customers[i].start();
        }

        for (Customer customer : customers) {
            customer.join();
        }

        System.out.println("Seats left: " + theater.getSeats());
    }
}
