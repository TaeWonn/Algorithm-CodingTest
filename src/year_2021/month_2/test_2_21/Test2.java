package year_2021.month_2.test_2_21;

public class Test2 {

    public static void main(String[] args) {
        System.out.println(new Test2().solution("()()"));
        System.out.println(new Test2().solution("(())()"));
        System.out.println(new Test2().solution(")()("));
    }

    boolean solution(String s) {
        int left = 0;
        int right = 0;
        for(int i =0; i< s.length(); i ++) {
            if(s.charAt(i) == '(') left ++;
            if(s.charAt(i) == ')') right ++;

            if(left < right) return false;
        }
        if(left != right) return false;

        return true;

    }
}
