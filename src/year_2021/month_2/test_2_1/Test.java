package year_2021.month_2.test_2_1;

public class Test {

    public static void main(String[] args) {
        System.out.println(new Test().solution(Integer.MAX_VALUE));
    }

    public int solution(int n) {
        int answer = 0;

        boolean[] bool = new boolean[n + 1];

        for(int i = 0; i <= n ; i ++)
            bool[i] = true ;

        for(int i =2; i * i <= n; i ++){
            if(bool[i]) {
                for( int j= i * i ; j <=n; j += i)
                    bool[j] = false;
            }
        }

        for(int i =2; i <= n; i ++) {
            if(bool[i]) answer ++;
        }

        return answer;
    }
}
