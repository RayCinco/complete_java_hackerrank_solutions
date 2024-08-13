package Java39;
import java.util.*;
class Student{
    int ID;
    String Name;
    double CGPA;
    Student(int ID,String Name,double CGPA){
        this.ID =ID;
        this.Name = Name;
        this.CGPA = CGPA;

    }

}


public class Java39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Student> studs = new ArrayList<>();
        for(int i =0 ; i<N; i++){
            int ID = scanner.nextInt();
            String Name = scanner.next();
            double CGPA = scanner.nextDouble();
            studs.add(new Student(ID,Name,CGPA));
        }
        Comparator<Student> studcom = new Comparator<Student>() {
            @Override
            public int compare(Student o1,Student o2) {
                if(o1.CGPA <o2.CGPA)
                    return 1;
                else if(o1.CGPA == o2.CGPA){
                   int result =o1.Name.compareTo(o2.Name);
                   if(result > 0)
                       return 1;
                   else if(result == 0)
                   {
                       if(o1.ID > o2.ID)
                           return 1;
                   }
                   else
                    return -1;

                }
                else
                    return -1;
                return 0;
            }
        };

        Collections.sort(studs,studcom);
        for(Student e: studs){
            System.out.println(e.Name);
        }


    }

}
