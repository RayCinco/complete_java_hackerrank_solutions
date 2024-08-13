import java.io.*;
import java.util.*;
// CHATGPT
public class Java32ver2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int gameSize = scanner.nextInt();
            int leap = scanner.nextInt();
            System.out.println(canWin(leap, gameSize)? "YES" : "NO");
        }
    }

    public static boolean canWin(int leap, int gameSize) {
        int[] game = new int[gameSize];
        for (int i = 0; i < gameSize; i++) {
            game[i] = scanner.nextInt();
        }

        return isSolvable(game, leap, 0);
    }

    private static boolean isSolvable(int[] game, int leap, int pos) {
        if (pos < 0 || game[pos] == 1) {
            return false;
        }
        if (pos >= game.length - 1 || pos + leap >= game.length) {
            return true;
        }

        game[pos] = 1;  // Mark this position as visited

        // Move forward
        if (isSolvable(game, leap, pos + 1)) {
            return true;
        }
        // Jump forward
        if (isSolvable(game, leap, pos + leap)) {
            return true;
        }
        // Move backward
        if (isSolvable(game, leap, pos - 1)) {
            return true;
        }

        return false;
    }


}
