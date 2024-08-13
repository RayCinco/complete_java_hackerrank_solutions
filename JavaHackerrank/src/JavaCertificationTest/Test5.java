package JavaCertificationTest;
public class Test5 {
    public static void main(String[] args) {
        try {
            Float f1 = new Float("3.0");
            int x = f1.intValue();          // Converts Float to int
            byte b = f1.byteValue();        // Converts Float to byte
            double d = f1.doubleValue();    // Converts Float to double
            System.out.println(x + b + d);   // Outputs the sum of x, b, and d
        } catch (NumberFormatException e) {
            System.out.println("bad number"); // Handles any number format exceptions
        }
    }
}