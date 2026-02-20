package Queue;
import java.util.Deque;
import java.util.LinkedList;

public class QueueH {

    // Implement queue using Deque
    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        // enqueue
        public void add(int data) {
            deque.addLast(data);
        }

        // dequeue
        public int remove() {
            return deque.removeFirst();
        }

        // peek
        public int peek() {
            return deque.getFirst();
        }

        public boolean isEmpty() {
            return deque.isEmpty();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q.remove()); // 10
        System.out.println(q.peek());   // 20
    }
}
 
    

