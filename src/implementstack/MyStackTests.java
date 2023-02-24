package implementstack;

public class MyStackTests {
    public static void main(String[] args) {

        MyStack<String> stack = new MyStack<String>();

        stack.push("John");
        stack.push("Doe");
        stack.push("Mark");
        stack.push("Stefan");

        System.out.println("stack before remove = " + stack);
        System.out.println();

        stack.remove(1);

        System.out.println("stack after remove = " + stack);
        System.out.println("stack.size() = " + stack.size());
        System.out.println();

        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack = " + stack);
        System.out.println();

        System.out.println("stack.pop() = " + stack.pop());

        System.out.println("stack = " + stack);

        stack.clear();
        System.out.println("stack after clear = " + stack);
    }
}
