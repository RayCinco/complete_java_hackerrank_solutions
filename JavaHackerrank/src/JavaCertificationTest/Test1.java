package JavaCertificationTest;

import java.util.Arrays;
import java.util.Collections;

public class Test1 {
    public static String decrypt(String encryptedMessage) {
        // Step 1: Reverse the order of words
        String[] words = encryptedMessage.split(" ");
        Collections.reverse(Arrays.asList(words));

        // Step 2: Expand each word
        StringBuilder decryptedMessage = new StringBuilder();
        for (String word : words) {
            decryptedMessage.append(expandWord(word)).append(" ");
        }

        // Remove the trailing space and return the result
        return decryptedMessage.toString().trim();
    }

    private static String expandWord(String word) {
        StringBuilder expandedWord = new StringBuilder();
        int length = word.length();
        int i = 0;

        while (i < length) {
            char currentChar = word.charAt(i);
            expandedWord.append(currentChar);

            // Check if the next character is a digit (frequency)
            if (i + 1 < length && Character.isDigit(word.charAt(i + 1))) {
                int freq = word.charAt(i + 1) - '0'; // Convert char to int
                for (int j = 1; j < freq; j++) {
                    expandedWord.append(currentChar);
                }
                i++; // Skip the digit
            }

            i++;
        }

        return expandedWord.toString();
    }
}

