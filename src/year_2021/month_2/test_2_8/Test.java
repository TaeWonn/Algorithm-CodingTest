package year_2021.month_2.test_2_8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        System.out.println(new Test().solution("3people unFollowed me"));
    }

    public String solution(String s) {

        String[] a = s.split(" ");

        for(int i = 0; i < a.length; i ++) {
            char[] b = a[i].toCharArray();

            for(int j = 0 ; j < b.length; j ++) {
                if(j == 0) b[j] = Character.toUpperCase(b[j]);
                else b[j] = Character.toLowerCase(b[j]);
            }
            a[i] = String.valueOf(b);
        }

        return Arrays.stream(a)
                .collect(Collectors.joining(" "))
                + (s.endsWith(" ") ? " ": "");
    }
}
