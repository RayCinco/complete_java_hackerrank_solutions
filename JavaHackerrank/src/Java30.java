import java.util.*;
public class Java30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int[] arr = new int[q];
        for(int i =0; i<q;i++) {
            arr[i] = scanner.nextInt();
        }
        int negativeCount = 0;

        for(int y =0; y < q ;y++) {
                int subSum =0;
                for (int x = y; x < q; x++) {
                    subSum += arr[x];
                    if(subSum < 0)
                        negativeCount++;
                }

        }
        System.out.println(negativeCount);

    }
}
