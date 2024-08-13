//JAVA 1D ARRAY(Part2) --> MyCreation DoesWork But Have Errors
import java.util.*;
public class Java32 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int q = scanner.nextInt();

       for(int i =0; i<q;i++){
            int gameSize = scanner.nextInt();
            int leap = scanner.nextInt();
            System.out.println(canWin(leap,gameSize));
       }

    }
    public static boolean canWin(int leap,int gameSize) {
        int[] game = new int[gameSize];
        for(int i =0; i<gameSize;i++){
            game[i] = scanner.nextInt();
        }


        try {
            int posIndex = 0;
            for(int i =0; i<10000;i++){
                if (posIndex > gameSize) {
                    return true;
                } else if (game[posIndex + leap] == 0) {
                    posIndex += leap;
                } else if (game[posIndex + 1] == 0) {
                    posIndex += 1;
                } else if (game[posIndex - 1] == 0 && !(posIndex == 0)) {
                    posIndex -= 1;
                }
            }

        }
        catch(ArrayIndexOutOfBoundsException e){
            return true;
        }
        return false;
    }
}
