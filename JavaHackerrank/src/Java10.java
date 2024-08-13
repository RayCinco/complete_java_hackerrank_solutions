// STATIC BLOCK
import java.util.*;
public class Java10 {
    static int B;
    static int H;
     static void Area(){
         Scanner scanner = new Scanner(System.in);
          B = scanner.nextInt();
          H = scanner.nextInt();
          if(B<=0 || H<=0)
              System.out.println("java.lang.Exception: Breadth and height must be positive");
          else {
              System.out.println(B * H);
          }
     }
    public static void main(String[] args) {
    Area();

    }
}
