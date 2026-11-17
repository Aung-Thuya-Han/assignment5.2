public class Theater {
    private int seats;

    public Theater(int seats) {
        this.seats = seats;
    }

    public synchronized void reserve(String customer, int tickets) {
        if (tickets > 0 && tickets <= seats) {
            seats -= tickets;
            System.out.println(customer + " reserved " + tickets + " tickets.");
        } else {
            System.out.println(customer + " couldn't reserve " + tickets + " tickets.");
        }
    }

    public synchronized int getSeats() {
        return seats;
    }
}
