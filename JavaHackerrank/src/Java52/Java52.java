//JAVA EXCEPTION HANDLING
package Java52;

import java.util.Scanner;

class MyCalculator {
    public long power(int n, int p){
        int result = 1;

        for (int i = 0; i < p; i++) {
            result = result * n;
        }
        return result;
    }
}

    public class Java52 {
        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            MyCalculator calculator = new MyCalculator();
            while(scanner.hasNextInt()) {
                int n = scanner.nextInt();
                int p = scanner.nextInt();
                if (n < 0 || p < 0){
                    System.out.println("java.lang.Exception: n or p should not be negative.");
                }

                else if (n == 0 && p == 0){
                    System.out.println("java.lang.Exception: n and p should not be zero.");
                }
                else {
                    System.out.println(calculator.power(n, p));
                }
            }
        }
    }

