//JAVA CAN YOU ACCESS
package Java55;
import java.util.*;
public class Java55 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Inner inner = new Inner();
        Inner.Private aPrivate = inner.new Private();
        aPrivate.power(n);
        System.out.println("An instance of class: " + aPrivate.getClass().getName().replace("$",".")+" has been created" );
    }

    static class Inner{
        private class Private{
            public void power(int n) {
                if (n % 2 == 0)
                    System.out.println(n +" is power of 2");

            }
        }
    }



}
