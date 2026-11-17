public class Main {
    public static void main(String[] args) throws InterruptedException {
        SafeList list = new SafeList();
        ListWorker first = new ListWorker("First", list);
        ListWorker second = new ListWorker("Second", list);

        first.start();
        second.start();
        first.join();
        second.join();

        System.out.println("Expected size: 1000");
        System.out.println("Actual size: " + list.size());
    }
}
