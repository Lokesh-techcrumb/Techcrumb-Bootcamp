// Q3) Write a java program to show following menu to the user:
// *******Menu*******
// 1. Calculate Area of Circle
// 2. Calculate Circumference of a Circle
// 3. Exit.
// Choose an option (1-3): 
// Take radius as user input.
// Hint: Use Switch statement to act on the menu. Also area and circumference methods should be static


package javaAssignment1;

import java.util.*;

public class menu {
    public static double area(double radius){
        return Math.PI*radius*radius;
    }

    public static double Circum(double radius){
        return 2*Math.PI*radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("********************MENU********************");
        System.out.println("1. Calculate Area of Circle");
        System.out.println("2. Calculate Circumference of a Circle");
        System.out.println("3. Exit.");
        System.out.println("********************************************");

        System.out.println("Please enter the option you want to perform:");

        int input = sc.nextInt();

        while(input > 3){
            System.out.println();
            System.out.println("Choice Invaild Input");
            System.out.println("Please enter a Valid option");
            input = sc.nextInt();
        }
        double radius = 0;

        if(input != 3){
            System.out.println("Please Enter the radius of Circle:");
            radius = sc.nextDouble();
        }

        switch (input) {
            case 1: System.out.println("Area of Circle is "+ area(radius));
                System.out.println("Ok bye, Thank you for visiting");
                break;
            case 2: System.out.println("Circumference of a Circle is "+Circum(radius));
                    System.out.println("Ok bye, Thank you for visiting");
                break;
            case 3: System.out.println("Ok bye, Thank you for visiting");
                break;
            default:System.out.println("Choice Invaild Input");
                break;
        }
        sc.close();
    }
}
