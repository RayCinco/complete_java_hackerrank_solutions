//JAVA DEQUEUE
import java.util.*;
public class Java40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> array = new ArrayList<>();

        for(int i = 0; i<n;i++){
            array.add(scanner.nextInt());
        }
        System.out.println(SubArrUnique(array,m));
    }

    public static int SubArrUnique(List<Integer> array,int m){
        int uniqueMax =0;

        Set<Integer> uniqueNumbers= new HashSet<>();
        Deque<Integer> deque = new LinkedList<>();
        for(int i=0; i< array.size();i++){
            deque.addLast((array.get(i)));
            uniqueNumbers.add(array.get(i));


            if(deque.size() > m){
                int removed = deque.pollFirst();
                if(!deque.contains(removed)){
                    uniqueNumbers.remove(removed);
                }
            }
            if(deque.size() == m){
                uniqueMax = Math.max(uniqueMax,uniqueNumbers.size());
            }

        }
        return uniqueMax;
    }
}
