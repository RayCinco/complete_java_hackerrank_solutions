//JAVA 1D ARRAY
import java.util.*;
public class Java28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int [] A = new int[N];
        for(int i =0; i<N;i++){
            A[i] = scanner.nextInt();
        }
        for(int e: A){
            System.out.println(e);
        }
    }
}
