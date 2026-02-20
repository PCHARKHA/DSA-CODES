/*Implementing Stack using a LinkedList
*Note : Stack ka top is LinkedList ka head
*/
package Stacks;
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
            Node newNode = new Node(data); //naya node banao
            if (isEmpty()){
                head = newNode;  //newNode becomes head of the linked list
                return;
            }
            newNode.next = head; // previous head ko newNode ke next bana do
            head = newNode; //newNode ko head bana do
         }

         //pop
        public static int pop(){
            if (isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next; //head ke next ko head bana do 
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

    


