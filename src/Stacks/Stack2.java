/*Implementing Stack using a LinkedList
*Note : Stack ka top is LinkedList ka head
*/
public class Stack2{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node head = null;
        public static  boolean isEmpty(){
            if(head == null){
                return true;
            }
            return false;
         }

         //push
        public static void push(int data){
            Node newNode = new Node(data);
            if (isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head; // step 1
            head = newNode; //step 2
         }

         //pop
        public static int pop(){
            if (isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
         }

         //peek
        public static int peek(){
            if (isEmpty()){
                return -1;
            }
            int top = head.data;
            return top;
         }

        public static void main(String[] args){
            Stack s = new Stack();
            s.push(1);
            s.push(2);
            s.push(3);

            while(!s.isEmpty()){
                System.out.println(s.peek());
                s.pop();
            }
        }
            
    }
}

    


