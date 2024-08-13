//PATTERN SYNTAX CHECKER
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Java20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String regex;
        for (int i = 0; i < n; i++) {
                regex = scanner.nextLine();
            try {
                Pattern.compile(regex);
                System.out.println("Valid");
                 }
            catch (PatternSyntaxException e) {
                System.out.println("Invalid");
                }

        }
    }
}
