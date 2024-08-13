import java.util.ArrayList;
import java.util.*;
public class Java29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] arr = new int[6][6];
        int largestSum =0;

        for(int x =0; x<6; x++){
            for(int y =0; y<6; y++){
                arr[y][x] = scanner.nextInt();
            }
        }
        for(int x = 0;x<4;x++) {
            for(int y =0; y<4; y++){
                int hourglassSum = arr[x][y] + arr[x+1][y] + arr [x+2][y]
                        + arr[x+1][y+1]
                        +arr[x][y+2] +arr[x+1][y+2] + arr[x+2][y+2];
                if(hourglassSum > largestSum)
                    largestSum = hourglassSum;

            }
        }

        System.out.println(largestSum);


    }
}
