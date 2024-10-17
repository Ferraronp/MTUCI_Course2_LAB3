import java.util.LinkedList;
public class HashTable<K, V> {
    private int size = 0;
    private LinkedList<Entry<K, V>>[] table;

    public HashTable(int capacity) {
        if (capacity <= 0) capacity = 1;
        table = new LinkedList[capacity];
    }

    public HashTable() {
        table = new LinkedList[1];
    }

    private int hash(K key) {
        return key.hashCode() % table.length;
    }

    public void put(K key, V value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<Entry<K, V>>();
        }
        for (Entry<K, V> entry: table[index]) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }
        table[index].add(new Entry<K, V>(key, value));
        size++;
    }

    public V get(K key) {
        int index = hash(key);
        if (table[index] == null) {
            return null;
        }
        for (Entry<K, V> entry: table[index]) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = hash(key);
        if (table[index] == null) {
            return;
        }
        LinkedList<Entry<K, V>> a = new LinkedList<>();
        for (Entry<K, V> entry: table[index]) {
            if (entry.getKey().equals(key)) {
                size--;
                continue;
            }
            a.add(new Entry<K, V>(entry.getKey(), entry.getValue()));
        }
        table[index] = a;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
