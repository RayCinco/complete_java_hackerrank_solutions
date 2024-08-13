//JAVA LOOPS 1
import java.util.*;
public class Java6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i = 1;
        while(i <=10){

            int result = N * i;
            System.out.println(N +" x " + i + " = "+ result);
            i++;
        }
    }
}
