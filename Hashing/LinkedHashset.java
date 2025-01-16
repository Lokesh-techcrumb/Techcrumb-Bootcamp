package Hashing;
import java.util.*;

public class LinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<String> lh = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet using add() method
        lh.add("a");
        lh.add("b");
        lh.add("c");
        lh.add("d");
        lh.add("e");

        System.out.println("LinkedHashSet : " + lh);

        //remove Element into a LinkedHashSet
        lh.remove("c");

        System.out.println("After removing element " + lh);

        // Returning false if the element is not present
        System.out.println(lh.remove("f"));

        Iterator<String> itr = lh.iterator();

        while (itr.hasNext())
            System.out.print(itr.next() + ", ");

        System.out.println();

        // Using enhanced for loop for iteration
        for (String s : lh){
            System.out.print(s + ", ");
        }
        System.out.println();
        
    }
}
