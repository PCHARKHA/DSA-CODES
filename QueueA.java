//Implementing Queue using array
public class QueueA {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;    // default or initial value of rear

        }
        // Operation : Is empty?
        public static boolean isEmpty(){
            return rear==-1 ;
        }
        //Operation: Add
        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            rear ++; // else part
            arr[rear] = data;
        }
        // Operation : Remove
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int front = arr[0];  // we delete from front
            for (int i =0; i<rear;i++){
                arr[i]= arr[i+1];   // the element at second place becomes the element at first place & so on
            }
            rear --;
            return front;
        }
        //Operation peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
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
    
}
