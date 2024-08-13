//JAVA INSTANCE OF
package Java49;
import java.util.*;
class Student{

}
class Hacker{

}
class Rockstar{

}
class Instance{
    int studentCount = 0;
    int hackerCount =0;
    int rockstarCount =0;
    Instance(ArrayList<Object> arr){
        for(Object e: arr){
            if(e instanceof Student) {
                studentCount++;
            }
            else if(e instanceof Hacker) {
                hackerCount++;
            }
            else if(e instanceof Rockstar) {
                rockstarCount++;
            }

        }
    }


}
public class Java49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> arr = new ArrayList<>();
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i =0; i<n;i++) {
            String choice = scanner.nextLine();
            switch (choice) {
                case "Student":
                    arr.add(new Student());
                    break;
                case "Rockstar":
                    arr.add(new Rockstar());
                    break;
                case "Hacker":
                    arr.add(new Hacker());
                    break;
            }
        }
        Instance instance = new Instance(arr);
        System.out.print(instance.studentCount+" "+ instance.rockstarCount+ " "+ instance.hackerCount);

    }

}
