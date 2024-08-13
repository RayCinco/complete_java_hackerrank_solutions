//JAVA HASHSET
import java.util.*;
public class Java36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        int T = scanner.nextInt();
        scanner.nextLine();
        for(int i =0; i<T; i++){
            String s1 = scanner.next();
            String s2 = scanner.next();
            String result = s1 +" "+s2;
            set.add(result);
            System.out.println(set.size());
        }
    }
}
