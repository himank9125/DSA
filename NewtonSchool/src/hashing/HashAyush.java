package hashing;
import java.util.Map;

public class HashAyush<K, V> {
	NodeAyush<K, V>[] bucket;
    int size;

    public HashAyush() {
        bucket = new NodeAyush[16];
    }

    public void put(K key, V value) {
        int validIndex = key.hashCode() % bucket.length;
        NodeAyush<K, V> head = bucket[validIndex];
        NodeAyush<K, V> prev = null;
        NodeAyush<K, V> curr = head;
        while (curr != null) {
            // When I need to override the value.
            if (curr.key.equals(key)) {
                curr.value = value;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
        NodeAyush<K, V> newNode = new NodeAyush<>(key, value);
        if (prev == null) {
            bucket[validIndex] = newNode;
        } else {
            prev.next = newNode;
        }
        size++;
        double loadFactor = (size * 1.0) / bucket.length;
        if (loadFactor > 0.7) {
            rehash();
        }
    }

    private void rehash() {
    	NodeAyush<K, V>[] data = bucket;
        bucket = new NodeAyush[2 * data.length];

        // Copying all the elements of data array in my bucket array.
        for (NodeAyush<K, V> head : data) {
            while (head != null) {
                put(head.key, head.value);
            }
        }
    }

    /*
    1. Calculate the validIdx = key.hashCode() % bucket.length
    2. Go to that idx, traverse the LL on that idx and check whether the key is present or not?
     */
    public boolean containsKey(K key) {
        int validIdx = key.hashCode() % bucket.length;
        NodeAyush<K, V> head = bucket[validIdx];
        while (head != null) {
            if (head.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public V get(K key) {
        int validIdx = key.hashCode() % bucket.length;
        NodeAyush<K, V> head = bucket[validIdx];
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
        }
        return null;
    }

    public void remove(K key) {
        if (!containsKey(key)) {
            return;
        }
        int validIdx = key.hashCode() % bucket.length;
        NodeAyush<K, V> head = bucket[validIdx];
        if (head.key.equals(key)) {
            bucket[validIdx] = head.next;
            return;
        }
        NodeAyush<K, V> prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                break;
            }
            prev = head;
            head = head.next;
        }
        prev.next = head.next;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

	

}
