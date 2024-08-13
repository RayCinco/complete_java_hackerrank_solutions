package Java61;
//JAVA COVARIANT

import java.util.Scanner;

public class Java61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Region region = null;
        switch(s) {

            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
            case "WestBengal":
                region = new WestBengal();
                break;

        }
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());


    }
}
class Flower{
    String whatsYourName(){
        return "I have many names and types.";
    }
}
class Jasmine extends Flower{
    @Override
    String whatsYourName() {
        return "Jasmine";
    }
}
class Lily extends Flower{
    @Override
    String whatsYourName() {
        return "Lily";
    }
}
class Region{
    Flower yourNationalFlower(){
        return new Flower();
    }

}
class WestBengal extends Region{
    Jasmine yourNationalFlower(){
        return new Jasmine();
    }
}
class AndhraPradesh extends Region{
    Lily yourNationalFlower(){
        return new Lily();
    }
}