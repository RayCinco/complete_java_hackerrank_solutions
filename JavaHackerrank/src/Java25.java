//JAVA BIG NUMBER
import java.math.BigDecimal;
import java.util.*;
public class Java25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> s = new ArrayList<String>();


        for(int i =0; i<number; i++){
            s.add(scanner.nextLine());
        }

        Collections.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                BigDecimal bd1 = new BigDecimal(o1);
                BigDecimal bd2 = new BigDecimal(o2);
                return bd2.compareTo(bd1);
            }
        });

       for(String e: s){
           System.out.println(e);
       }


    }
}
