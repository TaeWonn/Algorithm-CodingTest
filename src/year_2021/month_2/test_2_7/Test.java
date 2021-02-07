package year_2021.month_2.test_2_7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        System.out.println(new Test().solution("try hello world   "));
        System.out.println(new Test().solution(" tttry  hello world"));
    }

    public String solution(String s) {

        String[] a = s.split(" ");
        System.out.println(a.length);

        for (int i = 0; i < a.length ; i ++) {
            char[] b = a[i].toCharArray();
            for (int j = 0; j < b.length; j ++) {
                if ((j+1) % 2 == 1) b[j] = Character.toUpperCase(b[j]);
                else b[j] = Character.toLowerCase(b[j]);
            }

            a[i] = String.valueOf(b);
        }

        int cnt = 0;
        String c = "";

        for(int i = s.length() -1 ; i >= 0 ; i --) {
            if(s.charAt(i) == ' ') c += " ";
            else break;
        }
        return Arrays.stream(a)
                .collect(Collectors.joining(" "))
                + c
                ;
    }
}
