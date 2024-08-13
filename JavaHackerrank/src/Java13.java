//JAVA CURRENCY FORMATTER
import java.text.NumberFormat;
import java.util.*;
public class Java13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        Locale india = new Locale("en","IN");

        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(india);
        NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("US: "+ numberFormat1.format(payment));
        System.out.println("India: " + numberFormat2.format(payment));
        System.out.println("China: " + numberFormat3.format(payment));
        System.out.println("France: "+numberFormat4.format(payment));



    }
}
