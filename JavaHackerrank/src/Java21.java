//JAVA REGEX
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<6;i++) {
            String ipAddress = scanner.nextLine();
            String regex = "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[0-9][0-9]|000)\\.(\\w+)\\.(\\w+)\\.(\\w+)";
            // String regex = "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]?[0-9])[.](25[0-5]|2[0-4][0-9]|[0-1]?[0-9]?[0-9])[.](25[0-5]|2[0-4][0-9]|[0-1]?[0-9]?[0-9])[.](25[0-5]|2[0-4][0-9]|[0-1]?[0-9]?[0-9])";
            Pattern pattern = Pattern.compile(regex);

            Matcher match = pattern.matcher(ipAddress);
            if (match.matches())
                System.out.println("true");
            else
                System.out.println("false");
        }


    }
}
