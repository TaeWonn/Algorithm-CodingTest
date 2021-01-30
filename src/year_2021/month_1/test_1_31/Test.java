package year_2021.month_1.test_1_31;

import java.util.Arrays;
import java.util.Collections;


public class Test {

    public static void main(String[] args) {
        System.out.println(new Test().solution(118372L));
    }

    public long solution(long n) {

        String[] b = String.valueOf(n).split("");

        Arrays.sort(b, Collections.reverseOrder());

        String c = String.join("", b);

        return Long.parseLong(c);
    }
}
