public class ListWorker extends Thread {
    private SafeList list;

    public ListWorker(String name, SafeList list) {
        super(name);
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            list.add(getName() + i);
        }

        for (int i = 0; i < 500; i++) {
            list.remove(getName() + i);
        }

        System.out.println(getName() + " sees size: " + list.size());
    }
}
