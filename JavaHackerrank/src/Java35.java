//JAVA SET
import java.util.*;
public class Java35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       while(scanner.hasNext()){
         String input =scanner.next();
           System.out.println(isBalance(input) ? "true":"false");
        }
    }
    public static boolean isBalance(String input){

        Stack<Character> stack = new Stack<>();

        for(char e: input.toCharArray()){
            switch(e){
                case '(':case'{': case'[':
                    stack.push(e);
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if(stack.isEmpty()|| stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if(stack.isEmpty()|| stack.pop() != '[') {
                        return false;
                    }
                    break;

            }
        }
        return stack.isEmpty();
    }
}
