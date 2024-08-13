//JAVA STRING TOKENS
import java.util.*;

public class Java19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String regex = "[^a-zA-Z]+";
        String[] split = s.split(regex);

        int count = 0;
        for (String e : split) {
            if (!e.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
        for (String e : split) {
            if (!e.isEmpty()) {
                System.out.println(e);
            }
        }
    }
}
