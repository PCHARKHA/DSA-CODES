
//Implementing Queue using two stacks
import java.util.Stack;
class QueueD{
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void add(int data){
            //Step 1:jab tak s1 not empty,transfer everything to s2
            while(!s1.isEmpty()){
                s2.push(s1.pop()); //push elements to s2 which are popped from s1
            }
            s1.push(data); //Step 2
            //Step 3:
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return s1.pop();
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return s1.peek();

        }
        public static void main(String[] args) {
            Queue q = new Queue();
            q.add(1);  //static ka funda
            q.add(2);
            q.add(3);
            q.add(4);

            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
        }


    }
}