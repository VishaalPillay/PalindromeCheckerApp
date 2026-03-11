public class PalindromeCheckerApp {
public static void main(String[] args) {
        // 1. String Literal - The hardcoded word to check
        String originalWord = "madam"; 
        String reversedWord = "";

        // 2. Reverse the string logic
        for (int i = originalWord.length() - 1; i >= 0; i--) {
            reversedWord += originalWord.charAt(i);
        }

        // 3. Conditional Statement (if-else) & Console Output
        if (originalWord.equals(reversedWord)) {
            System.out.println("Result: '" + originalWord + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + originalWord + "' is NOT a palindrome.");
        }
    }
}