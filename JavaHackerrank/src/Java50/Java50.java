//JAVA ITERATOR
package Java50;

import java.util.*;
public class Java50{

    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> myList = new ArrayList<>();
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for(int i =0; i<n;i++){
            myList.add(scanner.nextInt());

        }
        myList.add("###");

        for(int i=0; i<m;i++){
            myList.add(scanner.next());
        }
        Iterator it = func(myList);
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

    static Iterator func(ArrayList e){
        Iterator it = e.iterator();
        while (it.hasNext()){
        Object element = it.next();
            if(element instanceof String){
            break;
            }
        }
        return it;
    }
}