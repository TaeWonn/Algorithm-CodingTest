package year_2021.month_2.test_2_12;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(new Test().solution(2, 5)));
        System.out.println(Arrays.toString(new Test().solution(-4, 2)));
    }

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long tmp = x;
        long tem2 = x;


        for(int i = 0; i < n; i ++) {
            answer[i] = tmp;
            tmp = tem2 + tmp;
        }

        return answer;
    }
}
