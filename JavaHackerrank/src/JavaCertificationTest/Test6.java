package JavaCertificationTest;

import java.util.Scanner;

public class Test6 {

    public static void typeCounter(String sentence) {
        int stringCount = 0;
        int integerCount = 0;
        int doubleCount = 0;

        // Split the sentence into words
        String[] words = sentence.split("\\s+ ");
        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            } else if (isDouble(word)) {
                doubleCount++;
            } else if (isInteger(word)) {
                integerCount++;
            } else if (isString(word)) {
                stringCount++;
            }
            else{
                continue;
            }
            System.out.println(word);
        }

        // Print the results
        System.out.println("string " + stringCount);
        System.out.println("integer " + integerCount);
        System.out.println("double " + doubleCount);
    }

    // Check if the word is a valid integer (including negative)
    public static boolean isInteger(String str) {
        return str.matches("-?\\d+"); // Matches optional minus sign followed by digits
    }

    // Check if the word is a valid string (lowercase English letters only)
    public static boolean isString(String str) {
        return str.matches("[a-z]+"); // Matches lowercase English letters only
    }

    // Check if the word is a valid double (including negative)
    public static boolean isDouble(String str) {
        return str.matches("-?\\d*\\.\\d+"); // Matches optional minus sign, optional digits before decimal, digits after decimal
    }

    public static void main(String[] args) {
        // Test with different inputs
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        typeCounter(sentence);
    }
    //Each string type substring consist of lowercase English letters only
    //Each numeric type substring consist of 0 to 9 and '.' decimal point only
    //The length of sentence < 30000character
    //Sentence has fewer than 1000 words


}
