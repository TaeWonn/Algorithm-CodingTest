package year_2020.month_12.test_12_13;

/*
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
* */
public class Test {

    public static void main(String[] args) {
        int a = solution(10);
        int b = solution(5);

        System.out.println(a);
        System.out.println(b);
    }

    public static int solution(int n) {
        int answer = 0;

        a: for(int i =2; i<= n; i++){
            b: for(int j=2; j< i; j++){
                if(i % j == 0) continue a;
            }
            answer ++;
        }

        return answer;
    }
}
