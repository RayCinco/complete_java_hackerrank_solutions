//JAVA PRIMALITY TEST
import java.math.BigInteger;
import java.util.*;
public class Java26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        BigInteger bigInteger = new BigInteger(number);
        int certainty = 10;
            if(bigInteger.isProbablePrime(certainty))
                System.out.println("prime");

            else
                System.out.println("not prime");



    }
}
