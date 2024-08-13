//VALID USERNAME REGULAR EXPRESSION
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine();
        for(int i =0; i<testCases;i++) {
            String s = scanner.nextLine();
            String regex = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$"; //Shorter Regex  String regex = "^[a-zA-Z][\\w]{7,29}$"

            Pattern pattern = Pattern.compile(regex);
            Matcher match = pattern.matcher(s);

            if (match.matches())
                System.out.println("Valid");
            else
                System.out.println("Invalid");
        }
    }
}
