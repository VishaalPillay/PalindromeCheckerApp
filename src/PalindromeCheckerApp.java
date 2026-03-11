public class PalindromeCheckerApp {
public static void main(String[] args) {
        // A real-world palindrome with spaces and mixed capitalization
        String originalWord = "A man a plan a canal Panama"; 
        
        // 1. String Preprocessing & Regular Expressions
        // "\\s+" is a regex that matches one or more spaces
        String normalizedWord = originalWord.replaceAll("\\s+", "").toLowerCase();
        
        // 2. Apply previous logic (We will use the efficient Two-Pointer approach from UC4)
        char[] charArray = normalizedWord.toCharArray();
        boolean isPalindrome = true;
        
        int left = 0;
        int right = charArray.length - 1;
        
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break; // Exit early if mismatch found
            }
            left++;
            right--;
        }
        
        // Print result
        if (isPalindrome) {
            System.out.println("Result: '" + originalWord + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + originalWord + "' is NOT a palindrome.");
        }
    }
}