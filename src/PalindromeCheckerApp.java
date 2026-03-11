public class PalindromeCheckerApp {
public static void main(String[] args) {
        String originalWord = "level"; 
        String reversedWord = "";

        // 1. Loop (for loop) - Iterating backwards through the string
        // 2. String Concatenation (+) & Immutability - Because Strings are immutable,
        //    every time this loop runs, a brand new String object is created in memory.
        for (int i = originalWord.length() - 1; i >= 0; i--) {
            reversedWord += originalWord.charAt(i);
        }

        // 3. equals() Method - We use this instead of "==" to compare the actual 
        //    characters inside the string, rather than their memory addresses.
        if (originalWord.equals(reversedWord)) {
            System.out.println("Success: '" + originalWord + "' is a palindrome.");
        } else {
            System.out.println("Failure: '" + originalWord + "' is NOT a palindrome.");
        }
    }
}