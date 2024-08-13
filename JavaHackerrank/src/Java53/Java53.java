package Java53;

import java.util.Scanner;

//JAVA VARAGS
class Add{
    public void add (int ... numbers) {
        int sum =0;
        StringBuilder build = new StringBuilder();
        for(int i =0; i< numbers.length;i++){
            sum += numbers[i];
            build.append(numbers[i]);
            if(i< numbers.length-1){
                build.append("+");
            }

        }
        build.append("=").append(sum);
        System.out.println(build.toString());
    }
}
public class Java53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int four = scanner.nextInt();
        int five = scanner.nextInt();
        int six = scanner.nextInt();

        Add adder = new Add();
        adder.add(one,two);
        adder.add(one,two,three);
        adder.add(one,two,three,four,five);
        adder.add(one,two,three,four,five,six);
    }
}
