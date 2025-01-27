package JavaAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicateWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter a String");
        String input = sc.nextLine();

        String normalizedInput = input.toLowerCase().replaceAll("[^a-zA-Z ]", "");

        String[] words = normalizedInput.split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Duplicate words and their occurrences:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
        sc.close();
    }
}
