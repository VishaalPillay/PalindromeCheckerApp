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
            }
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
