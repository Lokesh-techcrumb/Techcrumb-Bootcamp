package Hashing;
import java.util.*;

public class hashmapOperations {
    public static void main(String[] args) {
        //create hashmap
        HashMap<String, Integer> hm = new HashMap<>();

        //add data into a hashmap using put operation
        hm.put("india", 100);
        hm.put("china", 150);
        hm.put("usa", 50);

        //print hashmap
        System.out.println(hm);

        //get data into a hashmap using get operation
        int population = hm.get("india");
        System.out.println(population);

        System.out.println(hm.get("indonesia"));

        //Check data is exist or not in hashmap using containsKey operation

        System.out.println(hm.containsKey("india"));
        System.out.println(hm.containsKey("indonesia"));

        //remove data into a hashmap using remove opeartion
        System.out.println(hm.remove("china"));

        //size operation

        System.out.println(hm.size());

        //check if hashmap is empty or not

        System.out.println(hm.isEmpty());

        //clear data from hashmap using clear operation

        // hm.clear();
        System.out.println(hm.isEmpty());

        // iteration on hashmap using set
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Key="+k+",Value="+hm.get(k));
        }

        //use hm.entrySet();
        System.out.println(hm.entrySet());
    }
}
