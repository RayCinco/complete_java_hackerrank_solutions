import java.math.BigInteger;
import java.util.*;
public class Java27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String b1 = scanner.next();
        String b2 = scanner.next();

        BigInteger bigInteger = new BigInteger(b1);
        BigInteger bigInteger1 = new BigInteger(b2);
        System.out.println(bigInteger.add(bigInteger1));
        System.out.println(bigInteger.multiply(bigInteger1));
    }
}
