package Hashing;

import java.util.LinkedHashMap;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
        // using put() method
        lhm.put(3, "C");
        lhm.put(2, "B");
        lhm.put(1, "A");

        // Printing mappings to the console
        System.out.println(""+ lhm);

        lhm.put(2, "D");

        // Printing the updated Map
        System.out.println("Updated Map: " + lhm);

        lhm.remove(4);

        // Printing the updated map
        System.out.println("" + lhm);
    }
}
