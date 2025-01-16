package Hashing;

import java.util.*;

public class hashSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        // Add elements to the HashSet
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        hs.add("F");

        // Using iterator() method to iterate
        System.out.print("Using iterator : ");
        Iterator<String> it = hs.iterator();
      
        // Traversing HashSet
        while (it.hasNext())
            System.out.print(it.next() + ", ");

        System.out.println();

        // Using enhanced for loop to iterate
        System.out.print("Using enhanced for loop : ");
        for (String element : hs){
            System.out.print(element + " , ");
        }
    }
}
