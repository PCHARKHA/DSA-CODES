//Implementing Queue using a LinkedList
public class QueueC {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static Node head = null;  //initialization
        static Node tail= null;

        public static boolean isEmpty(){
            return head ==null && tail == null;
        }

        // no need of isFull
        public static void add(int data){
            Node newNode =new Node(data);
            if(head == null){
                head=tail=newNode;
            }
            else{
                tail.next = newNode;
                tail= newNode;
            }
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data;
            if(tail == head){
                tail=head=null;
            }
            else{
                head = head.next;
            }
            return front;       
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return head.data;


        }
        public static void main(String[] args) {
            Queue q = new Queue();
            q.add(1);  //static ka funda
            q.add(2);
            q.add(3);

            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
        }
    }
}
