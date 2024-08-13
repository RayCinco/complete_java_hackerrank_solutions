//JAVA IF ELSE

import java.util.*;
public class Java3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number%2 == 1)
            System.out.print("Weird");
        if(number%2 == 0) {
            if (number >= 2 && number <= 5)
                System.out.print("Not Weird");
            else if(number >= 6 && number <= 20)
                System.out.print("Weird");
            else if(number > 20)
                System.out.print("Not Weird");
        }


    }
}
