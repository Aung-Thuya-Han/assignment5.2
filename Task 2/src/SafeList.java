import java.util.ArrayList;

public class SafeList {
    private ArrayList<String> items = new ArrayList<>();

    public synchronized void add(String item) {
        items.add(item);
    }

    public synchronized boolean remove(String item) {
        return items.remove(item);
    }

    public synchronized int size() {
        return items.size();
    }
}
