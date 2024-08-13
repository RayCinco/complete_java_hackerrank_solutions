//JAVA MAP
import java.util.*;
public class Java34 {
    public static void main(String[] args) {
        Map<String,Integer> entries = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i =0; i<n;i++){
            scanner.nextLine();
            String name = scanner.nextLine().toLowerCase();
            int phoneNumber = scanner.nextInt();
            entries.put(name,phoneNumber);
        }
        scanner.nextLine();
        for(int i =0; i<n;i++){
            String name = scanner.nextLine();

            if(entries.containsKey(name))
                System.out.println(name+"="+entries.get(name));
            else
                System.out.println("Not found");
        }


    }
}
