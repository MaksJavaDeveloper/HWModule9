package implementqueue;

public class MyQueueTests {
    public static void main(String[] args) {

        MyQueue<String> queue = new MyQueue<>();

        queue.add("John");
        queue.add("Stefan");
        queue.add("Ilona");
        System.out.println(queue);

        System.out.println("queue.size() = " + queue.size());
        System.out.println();
        queue.remove(2);
        System.out.println("queue.size() after remove = " + queue.size());
        System.out.println();

        System.out.println("queue.peek() = " + queue.peek());
        System.out.println(queue);
        System.out.println();

        System.out.println("queue.poll() = " + queue.poll());
        System.out.println(queue);
        System.out.println();

        queue.clear();
        System.out.println("queue after clear = " + queue);

    }
}
