package Hashing;

import java.util.HashMap;
import java.util.Set;

public class iterationHM {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        //add data into a hashmap using put operation
        hm.put("india", 100);
        hm.put("china", 150);
        hm.put("usa", 50);
        
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Key="+k+",Value="+hm.get(k));
        }
    }
}
