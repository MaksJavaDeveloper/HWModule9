package implementqueue;

import java.util.StringJoiner;

public class MyQueue<T> {

    private int size;

    private Node<T> first;

    public MyQueue() {
        createNewEmptyQueue();
    }


    private void createNewEmptyQueue() {
        first = new Node<>();
        size = 0;
    }

    private void checkSize() {
        if (size() == 0) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
    }

        public int size() {
             return size;
        }


        private void isIndexOk(int index) {
        if(index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index + ", size: " + size);
        }
        }

        public void clear() {
        createNewEmptyQueue();
        }

        public void add(T value) {

        if(size() == 0) {
            first.setData(value);
        } else {
            Node<T> newNode = new Node<>(value);
            Node<T> lastNode = first;

            while(lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }

            lastNode.setNext(newNode);
        }
        size++;
        }

        public T peek() {
        checkSize();
        return first.getData();
        }

        public T poll() {
        checkSize();
        Node<T> node = new Node<>(first.getData());

        if(size() == 1) {
            first = null;
        } else {
            first = first.getNext();
        }

        size--;
        return node.getData();
        }

        public void remove(int index) {
        checkSize();
        isIndexOk(index);

        Node<T> elemToRem = first;

        if(index == 0) {
            first = first.getNext();
        } else if(index == size() - 1) {
            for (int i = 0; i < size() - 1; i++) {
                elemToRem = elemToRem.getNext();
            }
            elemToRem.setNext(null);
        }
        else {
            Node<T> prev = new Node<>();
            for(int i = 0; i < index; i++) {
                prev = elemToRem;
                elemToRem = elemToRem.getNext();
            }

            prev.setNext(elemToRem.getNext());
        }
        size--;
        }





    @Override
    public String toString() {
        if(size == 0) {
            return "My queue: []";
        }

        StringJoiner res = new StringJoiner(", ");
        Node<T> node = first;

        for(int i = 0; i < size(); i++) {
            res.add(node.getData().toString());
            node = node.getNext();
        }

        return "My queue is [" + res + "]";
    }
}
