// JAVA FACTORY PATTERN
package Java57;

import java.util.Scanner;

interface Food{
    public String getType();

}
class FoodFactory{
    public Food getFood(String s){
        if(s.equals("cake"))
        return new Cake();

        if(s.equals("pizza"))
            return new Pizza();

        return null;
    }
}
class Cake implements Food{

    @Override
    public String getType() {

        return "Someone ordered a Dessert!";
    }
}
class Pizza implements Food{

    @Override
    public String getType() {
        return "Someone ordered a Fast Food!";

    }
}
public class Java57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FoodFactory factory = new FoodFactory();

        while(scanner.hasNext()) {
            String name = scanner.nextLine();
            Food food = factory.getFood(name);


            System.out.println("The factory returned class "+food.getClass().getName());
            System.out.println(food.getType());

        }

    }
}
