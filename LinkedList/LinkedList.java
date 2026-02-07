public class LinkedList{
    public class Node{
        int data;
        Node next;

        public Node(int data){          //initialization of linkedlist
            this.data = data;
            this.next = null;
        }  
    }
    public static Node head;
    public static Node tail;
    static int size;

    public void addFirst(int data){
        Node newNode = new Node(data); //Step 1= create a new node
        size++;
        if(head == null){           // Case: LL is empty
            head = tail=newNode;
            return;
        }
        newNode.next = head; //Step 2: the next of newNode is become's head ---link
        // new node's next basically stores head's address
        // even if I now change the value of my head ,newNode's next will always keep point to the previous head
        head = newNode;     //Step 3:head now points towards new Node
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if( head == null){ //Case :LL is empty
            head =tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        if(head == null){           // base case
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null"); //when temp reaches to null
    }
    public void add(int idx,int data){
        if(idx == 0){           //special case
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size ++;
        Node temp = head;
        int i =0;
        while ( i < idx-1){
            temp = temp.next;
            i++;
        }
        // i = idx-1 && temp becomes prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removeFirst(){
        int val =head.data;
        head = head.next;
        size --;
        return val;
    }
    public int removeLast(){
        Node prev = head;
        for(int i =0;i<size-2;i++){
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size --;
        return val;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.add(2,9);
        ll.print();

    }
}