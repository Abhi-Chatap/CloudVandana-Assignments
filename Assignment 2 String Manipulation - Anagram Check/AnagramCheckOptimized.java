import java.util.Scanner;

public class AnagramCheckOptimized {
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase for case insensitivity
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are not equal, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create an array to store character frequencies
        int[] charCount = new int[26];

        // Count characters from str1 and decrement for str2
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i) - 'a']++; // Increment for str1
            charCount[str2.charAt(i) - 'a']--; // Decrement for str2
        }

        // If all counts are zero, it's an anagram
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // Check for anagram
        if (areAnagrams(str1, str2)) {
            System.out.println("Output: true (They are anagrams)");
        } else {
            System.out.println("Output: false (They are not anagrams)");
        }

        scanner.close();
    }
}
