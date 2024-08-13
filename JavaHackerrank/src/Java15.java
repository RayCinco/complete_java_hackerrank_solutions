//JAVA SUBSTRINGS
import java.util.*;
public class Java15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        substring(start,end,s);
    }

    static void substring(int start,int end,String s){
        System.out.println(s.substring(start,end));

    }

}
