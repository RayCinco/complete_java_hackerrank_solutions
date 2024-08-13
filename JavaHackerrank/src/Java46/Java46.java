// JAVA INTERFACE
package Java46;
import java.util.*;
interface AdvanceArithmetic{
    int divisor_sum(int n);
}
class MyCalculator implements AdvanceArithmetic{

    @Override
    public int divisor_sum(int n) {
        int divSum = 0;
        for (int i =1;i<=n;i++){
            if(n%i == 0)
                divSum += i;
        }
        return divSum;
    }
}

public class Java46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyCalculator calculator = new MyCalculator();
        int n = scanner.nextInt();
        ImplementedInterfaceNames(calculator);
        System.out.println(calculator.divisor_sum(n));
    }

    static void ImplementedInterfaceNames(Object o) {
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++) {
            String interfaceName = theInterfaces[i].getName();
            System.out.println("I implemented: " + interfaceName);
        }
    }
}

