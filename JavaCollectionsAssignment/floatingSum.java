package JavaCollectionsAssignments;

import java.util.*;

public class floatingSum {
    public static void main(String[] args) {
        List<Double> floatingNumbers = new ArrayList<>();

        floatingNumbers.add(2.03);
        floatingNumbers.add(5.08);
        floatingNumbers.add(20.83);
        floatingNumbers.add(25.01);
        floatingNumbers.add(27.21);

        double sum = 0.0;

        Iterator<Double> it = floatingNumbers.iterator();
        while(it.hasNext()){
            sum += it.next();
        }

        System.out.println("The sum of the floating numbers is: " + sum);
    }
}
