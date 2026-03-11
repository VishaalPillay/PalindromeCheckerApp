public class PalindromeCheckerApp {
public static void main(String[] args) {
        String word = "racecar"; 
        
        // 1. Character Array (char[]) - Convert string to primitive array
        char[] charArray = word.toCharArray();
        
        boolean isPalindrome = true;
        
        // 2. Array Indexing & Two-Pointer Technique
        int left = 0;                         // Pointer at the start
        int right = charArray.length - 1;     // Pointer at the end
        
        // 3. Time Complexity Awareness - Loop only runs for half the array length
        while (left < right) {
            // Compare start & end characters
            if (charArray[left] != charArray[right]) {
                isPalindrome = false; 
                break; // Exit early if a mismatch is found!
            }
            left++;  // Move start pointer forward
            right--; // Move end pointer backward
        }
        
        // Display result
        if (isPalindrome) {
            System.out.println("Result: '" + word + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + word + "' is NOT a palindrome.");
        }
    }
}