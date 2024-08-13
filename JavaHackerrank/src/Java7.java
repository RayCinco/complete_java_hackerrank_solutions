//JAVA LOOPS 2
import java.util.*;
public class Java7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        for(int i = 0; i < q; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int sum = a;
            int expo = 0;

            for(int j = 0 ; j<n ; j++){
                sum += (int)(Math.pow(2,expo) * b);
                expo++;
                System.out.print(sum + " ");
            }
            System.out.println();


        }
    }
}
