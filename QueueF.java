// Reversing a queue
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueF {
    public static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        // Move all elements from queue to stack
        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        // Move all elements back from stack to queue
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        reverseQueue(q);

        System.out.println(q); // [4, 3, 2, 1]
    }
}
 
