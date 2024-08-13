// JAVA INT TO STRING
import java.util.*;
public class Java11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        if(String.valueOf(n) instanceof String ){
            System.out.println("Good job");
        }
        else{
            System.out.println("Wrong Answer");
        }

    }
}
