//JAVA SUBSTRING COMPARISON
import java.util.*;
public class Java16 {
    public static void main(String[] args) {
        SmallLarge();
    }
    public static void SmallLarge(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = scanner.nextInt();
        String large ="";
        String small ="";

        for(int i = 0; i<= s.length()-k; i++){
            String sub = s.substring(i,i+k);

                int compare = sub.compareTo(large);
                if(compare > 0)
                    large = sub;

                if(i == 0)
                    small =sub;

                int compare2 = sub.compareTo(small);
                if(compare2 <0)
                    small =sub;
        }

        System.out.println(small);
        System.out.println(large);
        }


    }



