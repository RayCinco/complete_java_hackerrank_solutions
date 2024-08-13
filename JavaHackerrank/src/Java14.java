//JAVA STRING INTRODUCTION
import java.util.*;
public class Java14 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String A = scanner.nextLine();
    String B = scanner.nextLine();

    int sumLength = A.length() + B.length();
        System.out.println(sumLength);
    int comparison = A.compareToIgnoreCase(B);
        if(comparison<0 || comparison ==0)
            System.out.println("No");
        else if(comparison > 0)
            System.out.println("Yes");

        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));

    }
}
