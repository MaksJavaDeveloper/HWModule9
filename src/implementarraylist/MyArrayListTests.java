package implementarraylist;

public class MyArrayListTests {
    public static void main(String[] args) {

        MyArrayList list = new MyArrayList();

        for(int i = 0; i <= 20; i++) {
            list.add(i);
        }

        System.out.println("list = " + list);
        System.out.println("list.get(20) = " + list.get(20));

        System.out.println("list.size() = " + list.size());

        list.remove(4);
        System.out.println("list after remove = " + list);

        list.clear();
        System.out.println("list after clear = " + list);

    }
}
