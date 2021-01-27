package year_2021.month_1.test_1_28;

public class Test {

    public static void main(String[] args) {

    }

    public int solution(int n) {
        int answer = 0;

        String a = String.valueOf(n);

        for(int i = 0; i < a.length(); i ++) {
            String tmp = String.valueOf(a.charAt(i));
            answer += Integer.parseInt(tmp);
        }

        return answer;
    }
}
