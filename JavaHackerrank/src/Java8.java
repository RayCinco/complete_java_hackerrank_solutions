//JAVA DATA TYPES
import java.util.*;
public class Java8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        final long BYTE_MIN = -128;
        final long BYTE_MAX = 127;
        final long SHORT_MIN = -32768;
        final long SHORT_MAX = 32767;
        final long INT_MIN = -2147483648L;
        final long INT_MAX = 2147483647L;
        final long LONG_MIN = Long.MIN_VALUE;
        final long LONG_MAX = Long.MAX_VALUE;

        for (int i = 0; i < T; i++) {
                String input = scanner.next();
            try {
                long n = Long.parseLong(input);

                if (n >= LONG_MIN && n <= LONG_MAX) {
                    System.out.println(n + " can be fitted in:");
                    if (n >= BYTE_MIN && n <= BYTE_MAX)
                        System.out.println("* byte");
                    if (n >= SHORT_MIN && n <= SHORT_MAX)
                        System.out.println("* short");
                    if (n >= INT_MIN && n <= INT_MAX)
                        System.out.println("* int");
                    if (n >= LONG_MIN && n <= LONG_MAX)
                        System.out.println("* long");
                }
            }
            catch(NumberFormatException e){
                System.out.println(input + " can't be fitted anywhere.");
            }
        }
    }
}
