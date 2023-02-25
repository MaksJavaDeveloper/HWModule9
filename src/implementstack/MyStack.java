package implementstack;

import java.util.StringJoiner;

public class MyStack<T> {

    /*
   1) push(Object value) додає елемент в кінець
   2) remove(int index) видаляє елемент за індексом
   3) clear() очищає колекцію
   4) size() повертає розмір колекції
   5) peek() повертає перший елемент стеку
   6) pop() повертає перший елемент стеку та видаляє його з колекції
     */


    private Node<T> first;

    private int size;


    public MyStack() {
        createNewEmptyStack();
    }

    private void createNewEmptyStack() {
        first = new Node<>();
        size = 0;
    }

    public int size() {
        return this.size;
    }

    public void checkSize() {
        if(size() == 0) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
    }

    public void checkIsIndexOk(int index) {
        if(index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index + ", size: " + size());
        }
    }



    public void clear() {
        createNewEmptyStack();
    }

    public void push(T data) {
        if(size() == 0) {
            first.setData(data);
        }
        else {
            Node<T> node = new Node<>(data);
            Node<T> lastNode = first;
            while(lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }
            lastNode.setNext(node);

        }
        size++;
    }

    public void remove(int index) {
        checkIsIndexOk(index);
        checkSize();

        Node<T> elemToRem = first;

        if(index == 0) {
            first = first.getNext();
        } else if(index == (size() - 1)) {
            for(int i = 0; i < size() -1; i++) {
                elemToRem = elemToRem.getNext();
            }

            elemToRem.setNext(null);
        }
        else {
            Node<T> prevNode = new Node<>();
            for(int i = 0; i < index; i++) {
                prevNode = elemToRem;
                elemToRem = elemToRem.getNext();
            }
            prevNode.setNext(elemToRem.getNext());
        }
        size--;
    }

    public T peek() {
        checkSize();
        Node<T> lastNode = first;
        for(int i = 0; i < size() - 1; i++) {
            lastNode = lastNode.getNext();
        }
        return lastNode.getData();
    }

    public T pop() {
        checkSize();
        Node<T> lastNode = first;

        if(size() == 1) {
            first = null;
        } else {
            Node<T> prev = new Node<>();
            while(lastNode.getNext() != null) {
                prev = lastNode;
                lastNode = lastNode.getNext();
            }

            prev.setNext(null);
            size--;
        }
        return lastNode.getData();

    }

    @Override
    public String toString() {
        if(size == 0) {
            return "My stack is: []";
        }
        StringJoiner res = new StringJoiner(", ");
        Node<T> node = first;
        for(int i = 0; i < size(); i++) {
            res.add(node.getData().toString());
            node = node.getNext();
        }
        return "My Stack = [" + res + "]";
    }
}
