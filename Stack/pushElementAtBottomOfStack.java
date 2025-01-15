package Stack;
import java.util.*;

public class pushElementAtBottomOfStack {

    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Insert Element At bottom of the Stack");
        int data = sc.nextInt();

        pushAtBottom(s, data);

        System.out.println("Stack Output");
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        sc.close();
    }
}
