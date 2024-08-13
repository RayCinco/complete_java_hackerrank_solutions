//TAG CONTENT EXTRACTOR
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java24 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < N; i++) {
        boolean found = false;
        String s = scanner.nextLine();
        //String regex = "<\\b([a-zA-Z0-9]+)\\b>(.+?)</\\b\\1\\b>"; My Trash Regex
        String regex = "<([^<>]+)>([^<>]*?)</\\1>";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            String content = matcher.group(2);
            if(!content.isEmpty()) {            //This code is crucial to determine whether the tag has a content or not
                                                //There are sometimes accident where there are tags like these <tag><tag>
                                                // There are no contents as you can see
                System.out.println(content);
                found = true;
            }
        }

        if(!found)
        {
            System.out.println("None");
        }


    }
}

}
