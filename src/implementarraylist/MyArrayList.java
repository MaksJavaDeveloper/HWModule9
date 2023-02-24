package implementarraylist;

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
    private int endIndex;

    private Object[] data;

    public MyArrayList() {
        createNewEmptyArray();
    }

    private void createNewEmptyArray() {
        data = new Object[INIT_SIZE];
        endIndex = 0;
    }

    public void add(T value) {
        resize();

        data[endIndex] = value;
        endIndex++;
    }

    private void resize() {
        if(endIndex == data.length) {
            Object[] newData = new Object[endIndex * 2];

            System.arraycopy(data,0,newData,0, endIndex);

            data = newData;

        }
    }


    public T get(int index) {
        checkIndex(index);
        return (T) data[index];
    }

    public void remove(int index) {
        checkIndex(index);
        System.arraycopy(data, index + 1, data, index, endIndex - index - 1);
        this.endIndex--;
    }

    private void checkIndex(int index) throws IndexOutOfBoundsException {
        if(index < 0 || index > data.length || data[index] == null) {
            throw new IndexOutOfBoundsException("Invalid index: " + index + ", Size: " + size());
        }
    }

    public void clear() {
        createNewEmptyArray();
    }

    public int size(){
        return endIndex;
    }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for(int i = 0; i < endIndex; i++) {
            result.add(data[i].toString());
        }

        return "[" + result + "]";

    }
}