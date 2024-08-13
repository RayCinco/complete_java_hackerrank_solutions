//JAVA STRING REVERSE
import java.util.*;
public class Java17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        String palindrome = "";
        for(int i = 0; i<s.length(); i++){
            palindrome = s.charAt(i) + palindrome;
        }

        if(palindrome.equals(s))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
