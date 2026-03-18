import java.util.*;

interface PalindromeStrategy {
    boolean check(String text);
}

class StackStrategy implements PalindromeStrategy {
    public boolean check(String text) {
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
}

class DequeStrategy implements PalindromeStrategy {
    public boolean check(String text) {
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
}

class PalindromeChecker {
    private PalindromeStrategy strategy;

    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String text) {
        return strategy.check(text);
    }
}

public class Main {
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker(new StackStrategy());
        System.out.println(checker.checkPalindrome("madam"));

        checker = new PalindromeChecker(new DequeStrategy());
        System.out.println(checker.checkPalindrome("level"));
    }
}
