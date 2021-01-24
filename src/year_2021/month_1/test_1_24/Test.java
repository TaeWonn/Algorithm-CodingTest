package year_2021.month_1.test_1_24;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        System.out.println(new Test().solution("Zbcdefg"));
    }

    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new StringBuilder(new String(arr)).reverse().toString();
    }
}
