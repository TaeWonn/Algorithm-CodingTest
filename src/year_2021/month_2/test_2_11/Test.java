package year_2021.month_2.test_2_11;

public class Test {

    public static void main(String[] args) {
        System.out.println(new Test().solution(6));
        System.out.println(new Test().solution(16));
        System.out.println(new Test().solution(626331));
    }

    public int solution(int num) {
        int answer = 0;

        long a = num;

        if(a == 1) return answer;

        for(int i=1 ; i<= 500; i++) {
            answer ++;
            if((a & 1) == 1) a = (a * 3) + 1;
            else a /= 2;

            if(a == 1) break;
        }

        return a != 1 ? -1 : answer;
    }
}
