//JAVA LIST
import java.util.*;
public class Java33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();
        int N = scanner.nextInt();
        for(int i = 0; i<N; i++){
            list.add(scanner.nextInt());
        }
        int Q = scanner.nextInt();

        for(int i =0; i<Q; i++){
            scanner.nextLine();
            String Option =scanner.nextLine();
            switch(Option)
            {
                case "Insert":
                    list.add(scanner.nextInt(),scanner.nextInt());
                    break;
                case "Delete":
                    list.remove(scanner.nextInt());
                    break;

            }
        }
        for(int e:list){
            System.out.print(e +" ");
        }
    }
}
