//JAVA ANAGRAMS
import java.util.*;
public class Java18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum1 = 0;
        int sum2 = 0;
        String s1= scanner.nextLine().toLowerCase();
        String s2 = scanner.nextLine().toLowerCase();

        for (int i = 0; i < s1.length(); i++) {
            sum1 += s1.charAt(i);
            sum2 += s2.charAt(i);
        }

        System.out.println(sum1 == sum2 ? "Anagrams" : "Not Anagrams");
    }
}
