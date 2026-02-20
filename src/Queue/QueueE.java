//Implementing Stack using 2 queues
package Queue;
import java.util.LinkedList;
import java.util.Queue;
public class QueueE {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    // push -> O(1)
    public static void push(int data) {
        if (!q1.isEmpty()) {
            q1.add(data);
        } else {
            q2.add(data);
        }
    }

    // pop -> O(n)
    public static int pop() {
        if (isEmpty()) {
            System.out.println("empty stack");
            return -1;
        }

        int top = -1;

        // case 1: q1 has elements
        if (!q1.isEmpty()) {
            while (q1.size() > 1) {
                q2.add(q1.remove());
            }
            top = q1.remove(); // last element
        }
        // case 2: q2 has elements
        else {
            while (q2.size() > 1) {
                q1.add(q2.remove());
            }
            top = q2.remove(); // last element
        }

        return top;
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("empty stack");
            return -1;
        }

        int top = -1;

        if (!q1.isEmpty()) {
            while (!q1.isEmpty()) {
                top = q1.remove();
                q2.add(top);
            }
        } else {
            while (!q2.isEmpty()) {
                top = q2.remove();
                q1.add(top);
            }
        }

        return top;
    }

    public static boolean isEmpty() {
        return q1.isEmpty() && q2.isEmpty();
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);

        System.out.println(pop());  // 30
        System.out.println(peek()); // 20
        System.out.println(pop());  // 20
    }
}


