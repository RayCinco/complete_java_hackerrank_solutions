package Java42;
import java.util.*;

//JAVA PRIORITY
public class Java42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int T = scanner.nextInt();
        scanner.nextLine();
        for(int i =0; i<T;i++){
           String events = scanner.nextLine();
           list.add(events);
           }

        Priorities priority = new Priorities();

        for(Student e:  priority.getStudents(list)){
            System.out.println(e.getName());
       }
        if(priority.getStudents(list).isEmpty()){
            System.out.println("EMPTY");
        }
    }
}
class Student implements Comparable<Student>{
    int id;
    String name;
    double Cgpa;

    Student(int id, String name, double Cgpa){
        this.id = id;
        this.name = name;
        this.Cgpa = Cgpa;
    }

    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public double getCgpa(){
        return Cgpa;
    }

    @Override
    public int compareTo(Student other) {
        if(other.Cgpa > this.Cgpa)
            return 1;
        else if(other.Cgpa == this.Cgpa){
            int compare = this.name.compareTo(other.name);
            if(compare > 0)
                return 1;
            else if(compare == 0){
                if(other.id > this.id)
                    return 1;
                else
                    return -1;
            }
            else
                return -1;
        }
        else
            return -1;
    }
}

class Priorities{
    public List<Student> getStudents(List<String> events){
        PriorityQueue<Student> queue = new PriorityQueue<>();
        List<Student> RemainingStudent = new ArrayList<>();

        for(String e: events){
            String [] parts = e.split(" ");
            if(parts[0].equals("ENTER")){
                String name = parts[1];
                double Cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);
                queue.add(new Student(id,name,Cgpa));
            }
            else if(parts[0].equals("SERVED")){
                if(!queue.isEmpty()){
                    queue.poll();
                }
            }
        }
        while(!queue.isEmpty()){
            RemainingStudent.add(queue.poll());
        }

        return RemainingStudent;

    }
}

