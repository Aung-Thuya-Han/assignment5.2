public class Customer extends Thread {
    private Theater theater;
    private int tickets;

    public Customer(String name, Theater theater, int tickets) {
        super(name);
        this.theater = theater;
        this.tickets = tickets;
    }

    @Override
    public void run() {
        theater.reserve(getName(), tickets);
    }
}
