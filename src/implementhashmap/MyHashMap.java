package implementhashmap;


import java.util.StringJoiner;

/**
 * клас MyHashMap як аналог класу HashMap.
 * put(Object key, Object value) додає пару ключ + значення
 * remove(Object key) видаляє пару за ключем
 * clear() очищає колекцію
 * size() повертає розмір колекції
 * get(Object key) повертає значення (Object value) за ключем
 */

public class MyHashMap<K, V> {
    private Node<K, V> firstNode;
    private int size = 0;

    public void put(K key, V value) {
        int h = hash(key);
        Node<K, V> newNode = new Node<>(hash(key), key, value, null);
        if (size == 0) {
            firstNode = newNode;
            size++;
        } else {
            Node<K, V> lastNode = firstNode;
            while (lastNode.getNext() != null) {
                if (lastNode.getKey() == key || lastNode.getKey().equals(key)) {
                    break;
                }
                lastNode = lastNode.getNext();
            }
            if (lastNode.getKey() == key || lastNode.getKey().equals(key)) {
                lastNode.setValue(value);
            } else {
                lastNode.setNext(newNode);
                size++;
            }
        }
    }

    public Node<K, V> get(K key) {
        Node<K, V> desired = firstNode;
        if (size() == 1) {
            return firstNode;
        }
        while (desired != null) {
            if (desired.getKey() == key || desired.getKey().equals(key)) {
                return desired;
            }
            desired = desired.getNext();
        }
        throw new IllegalArgumentException("No such key exists");
    }

    public void remove(K key) {
        if (get(key) == null) {
            throw new IllegalArgumentException("No such key exists");
        }
        if (get(key) == firstNode) {
            firstNode = firstNode.getNext();
            size--;
            return;
        }
        if (size == 1) {
            firstNode = null;
            size--;
            return;
        }
        Node<K, V> desired = firstNode;
        Node<K, V> prev = null;
        while (desired.getNext() != null) {
            prev = desired;
            desired = desired.getNext();
            if (desired.getKey() == key || desired.getKey().equals(key)) {
                prev.setNext(desired.getNext());
                size--;
                return;
            }
        }
        throw new IllegalArgumentException("No such key exists");
    }

    public int size() {
        return size;
    }

    public void clear() {
        firstNode = null;
        size = 0;
    }

    private int hash(K key) {
        int h = (key == null) ? 0 : key.hashCode();
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }

    @Override
    public String toString() {
        StringJoiner res = new StringJoiner(", ");

        Node<K, V> node = firstNode;
        while (node != null) {
            res.add(node.toString());
            node = node.getNext();
        }
        return "[" + res + "]";
    }
}