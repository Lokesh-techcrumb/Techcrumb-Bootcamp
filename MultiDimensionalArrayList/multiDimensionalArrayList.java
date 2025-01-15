package MultiDimensionalArrayList;

import java.util.*;

public class multiDimensionalArrayList {
    public static void main(String[] args) {

        //MultiDimensional ArrayList Creation
        ArrayList<ArrayList<Integer>> multiDimensionArrayList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i = 1; i <= 5; i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        multiDimensionArrayList.add(list1);
        multiDimensionArrayList.add(list2);
        multiDimensionArrayList.add(list3);

        for(int i = 0; i < multiDimensionArrayList.size(); i++){
            ArrayList<Integer> currList = multiDimensionArrayList.get(i);
            for(int j = 0; j < currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
