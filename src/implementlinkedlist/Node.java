package implementlinkedlist;

public class Node<T> {
    private T value;

    private Node<T> next;
    private Node<T> prev;

    public Node(T value, Node<T> next, Node<T> prev) {
        setValue(value);;
        setNext(next);
        setPrev(prev);
    }

    public Node() {
        setValue(null);
        setNext(null);
        setPrev(null);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }
}
