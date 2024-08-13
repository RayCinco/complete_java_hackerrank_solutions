//JAVA REGEX2 DUPLICATE WORDS version2
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java22ver2 {

    public static void main(String[] args) {


        String regex = "\\b(\\w+)\\b(\\s+\\b\\1\\b)+";

        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);


            input = m.replaceAll("$1");

            if(!input.isEmpty()) {
                System.out.println(input);
            }
        }

        in.close();
    }
}
