//JAVA REGEX2-DUPLICATE WORDS
import java.util.*;
public class Java22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            String regex = "\s";
            String[] words = s.split(regex);
            String combine = "";
            ArrayList<String> array = new ArrayList<>();
            ArrayList<String> array2 = new ArrayList<>();
            for (String e : words) {
                if (!array.contains(e.toLowerCase())) {
                    array.add(e.toLowerCase());
                    array2.add(e);
                }
            }
            for (String e : array2) {
                combine = combine + e + " ";
            }
            System.out.println(combine);

        }
    }
}
