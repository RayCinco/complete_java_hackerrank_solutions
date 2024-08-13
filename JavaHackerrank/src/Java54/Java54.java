//JAVA REFLECTION--ATTRIBUTES
package Java54;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

class Student {
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }

}
public class Java54 {
    public static void main(String[] args) {
        Class student = Student.class;
        Method [] methods = student.getDeclaredMethods();
        ArrayList<String> array = new ArrayList<>();
        for(Method e: methods){
            array.add(e.getName());
        }
        Collections.sort(array);
        for(String e: array){
            System.out.println(e);
        }

    }
}
