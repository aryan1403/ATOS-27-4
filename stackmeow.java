import java.util.Stack;

public class stackmeow {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(12);
        stack.push(-1);
        stack.push(45);

        // stack.forEach(e -> System.out.println(e));
        // stack.forEach(System.out::println);
    }
}
