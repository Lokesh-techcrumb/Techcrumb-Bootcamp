package JavaAssignment;

import java.util.*;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();

        System.out.print("Enter the substring to be replaced: ");
        String oldSubstring = scanner.nextLine();

        System.out.print("Enter the new substring: ");
        String newSubstring = scanner.nextLine();

        String updatedString = originalString.replace(oldSubstring, newSubstring);

        System.out.println("Updated string: " + updatedString);

        scanner.close();
    }
}
