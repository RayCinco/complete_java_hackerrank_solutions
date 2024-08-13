//JAVA EXCEPTION(Try-catch)
import java.util.InputMismatchException;
import java.util.Scanner;

public class Java51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int result = x/y;
            System.out.println(result);

        }
        catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");

        }
        catch(ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }


}
