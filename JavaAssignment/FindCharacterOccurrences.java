package JavaAssignment;

import java.util.Scanner;

public class FindCharacterOccurrences {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the String");
        String input = sc.nextLine();

        System.out.println("Please enter the character they can find it's occurrences");
        char targetChar = sc.next().charAt(0);

        String target = "" + targetChar;

        int originalLength = input.length();

        int newLength = input.replace(target, "").length();

        int occurrences = originalLength - newLength;

        System.out.println("The character '" + targetChar + "' occurs " + occurrences + " times in the string.");
        sc.close();
    }
}