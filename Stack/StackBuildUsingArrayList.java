package Stack;

import java.util.ArrayList;

public class StackBuildUsingArrayList {
    //Create Stack using ArrayList
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        //Check Stack is empty or not
        public boolean isEmpty(){
            return list.size() == 0;
        }

        //push Element into a stack
        public void push(int data){
            list.add(data);
        }

        //pop Element into a stack
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //get top element of the stack
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1); 
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
