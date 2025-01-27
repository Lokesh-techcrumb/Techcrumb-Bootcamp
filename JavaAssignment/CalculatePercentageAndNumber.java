package JavaAssignment;

import java.util.Scanner;

public class CalculatePercentageAndNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;
 
        System.out.println("Please Enter the string and find the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String");
        String input = sc.nextLine();
        int totalLength = input.length();

        for (char ch : input.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                specialCharCount++;
            }
        }

        double lowercasePercentage = (lowercaseCount * 100.0) / totalLength;
        double uppercasePercentage = (uppercaseCount * 100.0) / totalLength;
        double digitPercentage = (digitCount * 100.0) / totalLength;
        double specialCharPercentage = (specialCharCount * 100.0) / totalLength;

        System.out.println("Total Characters: " + totalLength);
        System.out.println("Lowercase Letters: " + lowercaseCount + " percentage is (" + String.format("%.2f", lowercasePercentage) + "%)");
        System.out.println("Uppercase Letters: " + uppercaseCount + " percentage is (" + String.format("%.2f", uppercasePercentage) + "%)");
        System.out.println("Digits: " + digitCount + " percentage is (" + String.format("%.2f", digitPercentage) + "%)");
        System.out.println("Special Characters: " + specialCharCount + " percentage is (" + String.format("%.2f", specialCharPercentage) + "%)");

        sc.close();
    }
}
