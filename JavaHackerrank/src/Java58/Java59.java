//JAVA SINGLETON
package Java58;

import java.util.Scanner;

public class Java59 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleInstance();
        Scanner scanner = new Scanner(System.in);
        s1.str = scanner.nextLine();

        System.out.println("Hello I am a singleton! Let me say "+s1.str+" to you");
    }
}
class Singleton{
    public String str;
    private Singleton(){

    }
    private static Singleton instance;
    public static Singleton getSingleInstance(){
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}
