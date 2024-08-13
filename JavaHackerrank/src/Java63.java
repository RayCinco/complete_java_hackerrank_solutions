//JAVA MD5
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Java63 {
    public static void main(String[] args) throws NoSuchAlgorithmException
    {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        MessageDigest md = MessageDigest.getInstance("MD5"); //Change the algorithm depending on what needed
        md.update(s.getBytes());

        byte[] digest = md.digest();
        StringBuilder sb = new StringBuilder();

        for(byte b: digest){
            sb.append(String.format("%02x",b & 0xff));

        }
        System.out.println(sb);
    }
}
