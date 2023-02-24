package implementlinkedlist;

public class MyLinkedListTests {
    public static void main(String[] args) {

        MyLinkedList<String> list = new MyLinkedList<String>();

        list.add("Vlad");
        list.add("Maks");
        list.add("Kate");
        list.add("John");
        list.add("Bill");

        System.out.println("list.size() = " + list.size());

        System.out.println("list.get(1) = " + list.get(1));

        for(int i = 0; i < list.size(); i++) {
            System.out.println("list.get(i) = " + list.get(i));
        }

        System.out.println();

        System.out.println("list.size() before remove = " + list.size());
        list.remove(3);
        System.out.println("list.size() after remove = " + list.size());

        System.out.println();

        list.clear();
        System.out.println("list.size() = " + list.size());


    }
}
