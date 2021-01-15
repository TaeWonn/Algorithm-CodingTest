package year_2021.month_1.test_1_17;

public class Test {

    public static void main(String[] args) {
        System.out.println(new Test().solution(3,5));
    }

    public long solution(int a, int b) {
        long answer = 0;

        for( int i = Math.min(a,b); i <= Math.max(a,b); i ++) {
            answer += i;
        }

        return answer;
    }
}
