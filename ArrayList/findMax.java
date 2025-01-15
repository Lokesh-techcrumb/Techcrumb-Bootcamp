package ArrayList;

import java.util.ArrayList;

public class findMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(11);
        list.add(3);
        list.add(21);
        list.add(51);
        list.add(16);

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < list.size(); i++){
            if(max < list.get(i)){
                max = list.get(i);
            }
        }

        System.out.println("Max Number in ArrayList: " + max);
    }
}
