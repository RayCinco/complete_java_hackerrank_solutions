//JAVA ANNOTATION
package Java60;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface FamilyBudget {
    String userRole() default "GUEST";
    int budgetLimit() default 0;
}

class FamilyMember {
    // Annotating method with FamilyBudget, specifying role and budget limit
    @FamilyBudget(userRole="SENIOR", budgetLimit=100)
    public void seniorMember(int budget, int moneySpend) {
        System.out.println("Senior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }

    @FamilyBudget(userRole="JUNIOR", budgetLimit=50)
    public void juniorMember(int budget, int moneySpend) {
        System.out.println("Junior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }

}

public class Java60{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases > 0) {

            String role = scanner.next();
            int spend = scanner.nextInt();
            try {
                // Retrieving annotated class
                Class<?> annotatedClass = FamilyMember.class;
                Method[] methods = annotatedClass.getMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(FamilyBudget.class)) {
                        FamilyBudget family = method.getAnnotation(FamilyBudget.class);
                        String userRole = family.userRole();
                        int budgetLimit = family.budgetLimit();

                        if (userRole.equals(role)) {
                            if (spend <= budgetLimit) {
                                method.invoke(annotatedClass.getDeclaredConstructor().newInstance(),budgetLimit, spend);
                            } else {
                                System.out.println("Budget Limit Over");
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            testCases--;
        }
    }
}
