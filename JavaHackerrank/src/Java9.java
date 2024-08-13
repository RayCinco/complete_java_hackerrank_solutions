// END OF FILE
import java.util.*;
public class Java9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            System.out.println(count + " " + line);
            count++;
        }

        scanner.close();
    }
}
