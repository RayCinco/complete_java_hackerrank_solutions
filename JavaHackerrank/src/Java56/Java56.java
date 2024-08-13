package Java56;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

class Prime{
    public boolean checkPrime(int n){
        BigInteger bigInteger = BigInteger.valueOf(n);
        return bigInteger.isProbablePrime(10);


    }
}
public class Java56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        for(int i =0; i<5;i++) {

            Prime prime = new Prime();
            int n = scanner.nextInt();
            if(prime.checkPrime(n))
                array.add(n);


            String s = "";
            for (int e : array){
                s = s + e + " ";
            }
                list.add(s);

        }
        System.out.println(list);


    }
}

