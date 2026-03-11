import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public static void main(String[] args) {
        String word = "racecar"; 
        
        // 1. Initialize Stack (LIFO) and Queue (FIFO)
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        
        // 2. Enqueue characters to Queue and Push to Stack
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            stack.push(c); // Push operation
            queue.add(c);  // Enqueue operation
        }
        
        boolean isPalindrome = true;
        
        // 3. Compare dequeue (queue) vs pop (stack)
        // Since Queue gives normal order and Stack gives reverse order,
        // they must match perfectly for a palindrome.
        while (!queue.isEmpty() && !stack.isEmpty()) {
            char queueChar = queue.remove(); // Dequeue operation
            char stackChar = stack.pop();    // Pop operation
            
            if (queueChar != stackChar) {
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