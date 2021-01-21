package year_2021.month_1.test_1_22;

public class Test {

    public static void main(String[] args) {

        System.out.println(new Test().solution("pPoooyY"));
    }

    boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase();

        int p = 0;
        int y = 0;

        for(int i=0; i< s.length(); i++) {
            if(s.charAt(i) == 'p') p ++;
            if(s.charAt(i) == 'y') y ++;
        }

        if(p != y) answer = false;

        return answer;
    }
}
