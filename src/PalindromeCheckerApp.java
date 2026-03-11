import java.util.ArrayDeque;
import java.util.Deque;
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String word = "deified"; 
        
        // 1. Initialize Deque (Double Ended Queue)
        Deque<Character> deque = new ArrayDeque<>();
        
        // 2. Insert characters into the deque
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }
        
        boolean isPalindrome = true;
        
        // 3. Remove first & last elements and compare until empty (or 1 element left)
        while (deque.size() > 1) {
            char front = deque.removeFirst(); // Get and remove from the front
            char rear = deque.removeLast();   // Get and remove from the back
            
            // Front and Rear Access Comparison
            if (front != rear) {
                isPalindrome = false;
                break; // Exit early if mismatch found
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