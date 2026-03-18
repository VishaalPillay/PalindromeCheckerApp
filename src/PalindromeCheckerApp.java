import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to check: ");
        String originalString = scanner.nextLine();
        
        // Flow Step 1: Normalize string using regex to remove spaces and toLowerCase for case insensitivity
        String normalizedString = originalString.replaceAll("\\s+", "").toLowerCase();
        
        // Flow Step 2: Apply logic to check if it's a palindrome
        if (isPalindrome(normalizedString)) {
            System.out.println("\"" + originalString + "\" IS a palindrome.");
        } else {
            System.out.println("\"" + originalString + "\" IS NOT a palindrome.");
        }
        
        scanner.close();
    }

    /**
     * Helper method to check if a normalized string is a palindrome.
     * Uses the two-pointer approach (Array/String concept).
     */
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            // If characters at the pointers don't match, it's not a palindrome
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
