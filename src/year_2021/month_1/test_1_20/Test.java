package year_2021.month_1.test_1_20;

import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {
        String a ="a234";
        String b = "1234";

        System.out.println(new Test().solution(a));
        System.out.println(new Test().solution(b));
    }

    public boolean solution(String s) {
        if(!(s.length() ==4 || s.length() == 6)) return false;

        for(int i = 0 ; i< s.length(); i ++)
            if(!(s.charAt(i) >= 48 && s.charAt(i) <= 57)) return false;


        return true;
    }
}
