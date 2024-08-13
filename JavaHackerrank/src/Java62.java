import java.util.Scanner;

//JAVA LAMBDA
public class Java62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T--> 0){
            int option = scanner.nextInt();
            int number = scanner.nextInt();
            if(option == 1)
                System.out.println(isOdd(number) ? "ODD" : "EVEN");

            else if(option == 2)
                System.out.println(isPrime(number) ? "PRIME" : "COMPOSITE");
            else if(option == 3)
                System.out.println(isPalindrome(number) ? "PALINDROME" : "NOT PALINDROME");
        }
    }
    public static boolean isOdd(int n){
        return n%2 ==1;
    }
    public static boolean isPrime(int n){
        if(n == 2)
            return true;
        for(int i = 2; i<n-1;i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
    public static boolean isPalindrome(int n){
            String str = Integer.toString(n);
            String reverse = new StringBuilder(str).reverse().toString();
            return str.equals(reverse);

    }
}
