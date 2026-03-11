import java.util.Stack;

public class PalindromeCheckerApp {
public static void main(String[] args) {
        String word = "radar"; 
        
        // 1. Stack Data Structure (LIFO)
        Stack<Character> stack = new Stack<>();
        
        // 2. Push Operation - Insert characters into the stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }
        
        boolean isPalindrome = true;
        
        // 3. Pop Operation & Reversal Logic - Pop and compare
        for (int i = 0; i < word.length(); i++) {
            // Pop removes and returns the top element from the stack
            if (word.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break; // Exit early if a mismatch is found
            }
        }
        
        // Print result
        if (isPalindrome) {
            System.out.println("Result: '" + word + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + word + "' is NOT a palindrome.");
        }
    }
}