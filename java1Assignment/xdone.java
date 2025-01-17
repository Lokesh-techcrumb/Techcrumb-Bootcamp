// Write a program to read user input until user writes XDONE and then show the entered text by the user on commandline
package java1Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class xdone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        ArrayList<String> inputData= new ArrayList<>();
 
        System.out.println("Enter the input data but you can leave on input data stream you can text: XDONE");
        while(true){
            input = sc.next();
            // if(input.equals("XDONE")){
            //     break;
            // }
            if(input.equalsIgnoreCase("XDONE")){
                break;
            }
            inputData.add(input);
        }

        System.out.println("Your Entered Data: ");
        for(int i = 0; i < inputData.size(); i++){
            System.out.println(inputData.get(i));
        }
        sc.close();
    }
}
