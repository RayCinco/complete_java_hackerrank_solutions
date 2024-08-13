// JAVA OUTPUT FORMATTING
import java.util.*;
public class Java5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String var1 = scanner.next();
        int num1 = scanner.nextInt();
        String var2 = scanner.next();
        int num2 = scanner.nextInt();
        String var3 = scanner.next();
        int num3 = scanner.nextInt();

        System.out.println("================================");
        System.out.printf("%-15s%03d%n", var1, num1);
        System.out.printf("%-15s%03d%n", var2, num2);
        System.out.printf("%-15s%03d%n", var3, num3);
        System.out.println("================================");

    }
}
