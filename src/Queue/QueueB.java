//Implementation of circular queues using Arrays
// major change in remove & add operations : updation part
//edge cases :1)removing last element   2)adding first element
package Queue;
public class QueueB {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;    // default or initial value of rear
            front = -1;

        }
        // Operation : Is empty?
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        //Operation : Is Full?
        public static boolean isFull(){
            return (rear +1)%size == front;
        }
        //Operation: Add
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            // Case : Add first element
            if(front == -1){ 
                front = 0;
            }
            rear = (rear+1)%size; // updating part
            arr[rear] = data;
        }
        // Operation : Remove
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int result = arr[front];  
            if(rear == front){      //case: deleting last element 
                rear = front= -1;
            }else{
                front = (front + 1)% size;
            }
            return result;
        }
        //Operation peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }
    
    }
    public static void main(String[] args) {
        Queue q = new Queue(4);
            Queue.add(1);  //static ka funda
            Queue.add(2);
            Queue.add(3);
            Queue.add(4);

            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
    }
}
