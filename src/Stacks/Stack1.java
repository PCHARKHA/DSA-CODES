//Implementing Stack using ArrayList
import java.util.*;
class Stack{
   static  ArrayList<Integer> list = new ArrayList<>();
        public static   boolean  isEmpty(){ //IsEmpty
            if(list.size() == 0){
                return true;
            }
            else{
                return false;
            }
        }

        public static void push(int data){ //push
            list.add(data);
        }

        public static int pop(){            //pop
            if (isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static int peek(){   //peek
            if (isEmpty()){
                return -1;
            }
            int data = list.get(list.size()-1);
            return data;
        }
}
public class Stack1{
    public static void main(String[] args) {
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