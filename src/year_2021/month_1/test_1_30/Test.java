package year_2021.month_1.test_1_30;

public class Test {

    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0 ; i<a.length ; i++)
            answer += a[i] * b[i];
        return answer;
    }
}
