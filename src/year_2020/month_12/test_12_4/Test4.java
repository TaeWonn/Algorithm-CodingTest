package year_2020.month_12.test_12_4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test4 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String id = scanner.next();
        String pw1 = scanner.next();
        String pw2 = scanner.next();

        Pattern idPattern = Pattern.compile("");
        Pattern pwPattern = Pattern.compile("");

        if(!pw1.equals(pw2)) {
            System.out.println("fail");
            return;
        }
        if(!idPattern.matcher(id).find()) {
            System.out.println("fail");
            return;
        }
        if(!pwPattern.matcher(pw1).find()) {
            System.out.println("fail");
            return;
        }

        System.out.println("pass");
        //System.out.println("fail");
    }
}
