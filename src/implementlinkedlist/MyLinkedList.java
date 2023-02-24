package implementlinkedlist;

import java.util.LinkedList;

public class MyLinkedList<T> {
        /*
        1) add(Object value) додає елемент в кінець
        2) remove(int index) видаляє елемент із вказаним індексом
        3) clear() очищає колекцію
        4) size() повертає розмір колекції
        5) get(int index) повертає елемент за індексом

         */


    private int size;

    private Node<T> first;
    private Node<T> last;


    public MyLinkedList() {
        createEmptyLinkedList();
    }

    public void createEmptyLinkedList() {
        first = new Node<>();
        last = new Node<>();

        first.setNext(last);
        last.setPrev(first);

        size = 0;
    }

    public int size() {
        return this.size;
    }

    public void checkSize() {
        if(size == 0) {
            throw new IndexOutOfBoundsException("List is empty");
        }
    }

    public void checkIsIndexOk(int index) {
        if(index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index + ", Size: " + size());
        }
    }

    public void add(T item) {

        if(size() == 0) {
            first.setValue(item);
        } else if(size() == 1) {
            last.setValue(item);
        } else {
            Node<T> newNode = last;
            last = new Node<>(item, null, newNode);
            newNode.setNext(last);
        }
        size++;
    }

    public T get(int index) {
        checkIsIndexOk(index);
        checkSize();

        Node<T> searchElem = first;
        for(int i = 0; i < index; i++) {
            searchElem = searchElem.getNext();
        }

        return searchElem.getValue();
    }

    public void clear() {
        createEmptyLinkedList();
    }

    public void remove(int index) {
        checkIsIndexOk(index);
        checkSize();

        if(index == 0) {
            first = first.getNext();
            first.setPrev(null);
            size--;
        } else if(index == (size() - 1)) {
            last = last.getPrev();
            last.setNext(null);
            size--;
        } else {
            Node<T> next;
            Node<T> prev;
            Node<T> removeElem = first;

            for(int i = 0; i < index; i++) {
                removeElem = removeElem.getNext();
            }

            next = removeElem.getNext();
            prev = removeElem.getPrev();
            prev.setNext(next);
            next.setPrev(prev);
            size--;
        }
    }

}
