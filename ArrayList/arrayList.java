package ArrayList;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //Add Operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        //get Operation
        int element = list.get(0);
        System.out.println(element);

        //remove Operation
        list.remove(2);
        System.out.println(list);

        //set opeartion
        list.set(2, 10);
        System.out.println(list);

        //contain operation
        System.out.println(list.contains(2));
        System.out.println(list.contains(11));

        // size Function
        System.out.println(list.size());

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
