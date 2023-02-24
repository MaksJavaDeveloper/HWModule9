package implementarraylist;

import java.util.ArrayList;
import java.util.StringJoiner;

public class MyArrayList<T> {

    /*
        1) add(Object value) додає елемент в кінець
        2) remove(int index) видаляє елемент із вказаним індексом
        3) clear() очищає колекцію
        4) size() повертає розмір колекції
        5) get(int index) повертає елемент за індексом
     */

    private static final int INIT_SIZE = 8;
    private int index;

    private Object[] data;

    public MyArrayList() {
        data = new Object[INIT_SIZE];
    }

    public void add(T value) {
        resize();

        data[index] = value;
        index++;
    }

    private void resize() {
        if(index == data.length) {
            int newSize = data.length * 2;
            Object[] newData = new Object[newSize];

            System.arraycopy(data,0,newData,0,data.length);

            data = newData;

        }
    }


    public T get(int i) {
        return (T) data[i];
    }

    public void remove(int index) {
        checkIndex(index);
        System.arraycopy(data,0,index + 1, data.length, INIT_SIZE - index - 1);
    }

    private void checkIndex(int index) throws IndexOutOfBoundsException {
        if(index < 0 || index > data.length || data[index] == null) {
            throw new IndexOutOfBoundsException("Invalid index: " + index + ", Size: " + size());
        }
    }

    public Object clear() {
        return new MyArrayList<>();
    }

    public int size(){
        return index;
    }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for(int i = 0; i < index; i++) {
            result.add(data[i].toString());
        }

        return "[" + result + "]";

    }
}