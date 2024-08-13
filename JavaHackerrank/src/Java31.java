//JAVA ARRAYLIST
import java.util.*;
public class Java31 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for(int i =0; i<n ;i++){
            ArrayList<Integer> arr = new ArrayList<>();
            int x = scanner.nextInt();
            for(int j =0; j <x; j++){
                 arr.add(scanner.nextInt());
            }
            arrList.add(arr);
        }
        int q = scanner.nextInt();
        for(int i =0; i<q;i++){
            try {
                int x = scanner.nextInt();
                int y = scanner.nextInt();

                System.out.println(arrList.get(x - 1).get(y - 1));
            }
            catch(IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }

        }


    }
}
