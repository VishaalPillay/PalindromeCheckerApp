import java.util.*;

class PalindromeAlgorithms {

    public static boolean stackMethod(String text) {
        Stack<Character> stack = new Stack<>();
        for (char c : text.toCharArray()) {
            stack.push(c);
        }
        for (char c : text.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static boolean dequeMethod(String text) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : text.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
public class PalindromeCheckerApp {

static class Node {
        char data;
        Node next;
        
        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        String word = "racecar"; 
        
        // Step 1: Convert string to linked list
        Node head = new Node(word.charAt(0));
        Node current = head;
        for (int i = 1; i < word.length(); i++) {
            current.next = new Node(word.charAt(i));
            current = current.next;
        }
        
        // Step 2: Fast and Slow Pointer Technique to find the middle
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;         // Moves 1 step
            fast = fast.next.next;    // Moves 2 steps
        }
        // When fast reaches the end, slow is at the middle.
        
        // Step 3: In-Place Reversal of the second half
        Node prev = null;
        Node currNode = slow;
        while (currNode != null) {
            Node nextTemp = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = nextTemp;
        }
        // 'prev' is now the head of the reversed second half
        
        // Step 4: Compare halves
        Node firstHalf = head;
        Node secondHalf = prev;
        boolean isPalindrome = true;
        
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                isPalindrome = false;
                break; // Exit early if mismatch found
            }
            // Node Traversal
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    public static boolean twoPointerMethod(String text) {
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        String text = "racecar";

        long start = System.nanoTime();
        boolean r1 = PalindromeAlgorithms.stackMethod(text);
        long end = System.nanoTime();
        System.out.println("Stack Method: " + r1 + " Time: " + (end - start) + " ns");

        start = System.nanoTime();
        boolean r2 = PalindromeAlgorithms.dequeMethod(text);
        end = System.nanoTime();
        System.out.println("Deque Method: " + r2 + " Time: " + (end - start) + " ns");

        start = System.nanoTime();
        boolean r3 = PalindromeAlgorithms.twoPointerMethod(text);
        end = System.nanoTime();
        System.out.println("Two Pointer Method: " + r3 + " Time: " + (end - start) + " ns");
    }
}
