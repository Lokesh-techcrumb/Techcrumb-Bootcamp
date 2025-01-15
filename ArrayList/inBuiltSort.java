package ArrayList;

import java.util.*;

public class inBuiltSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(11);
        list.add(3);
        list.add(21);
        list.add(51);
        list.add(16);

        //Inbuilt Sort Function In Collections

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
}