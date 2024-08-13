//JAVA ABSTRACT
package Java45;

import java.util.Scanner;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book {
    String title;
    @Override
    void setTitle(String s) {
        title = s;

    }
    String getTitle(){
        return title;
    }

}
public class Java45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyBook book = new MyBook();
        book.setTitle(scanner.nextLine());

        System.out.println("The title is: " +book.getTitle());
    }
}
