package year_2021.month_2.test_2_5;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b= {5,5,};
        System.out.println(new Test().solution(a));
    }
    public double solution(int[] arr) {
        double answer = 0;
        answer += Arrays.stream(arr).sum();

        return answer/ arr.length;
    }
}
