package year_2021.month_2.test_2_14;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] a = {1,3,2,5,4};

        System.out.println(new Test().solution(a, 9));
    }

    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i ++) {
            if(budget - d[i] < 0) break;
            answer ++;
            budget -= d[i];
        }

        return answer;
    }
}
