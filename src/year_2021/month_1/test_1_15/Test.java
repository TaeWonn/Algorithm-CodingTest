package year_2021.month_1.test_1_15;

public class Test {

    public static void main(String[] args) {
        String a = "abcde";
        String b = "qwer";
        System.out.println(new Test().solution(a));
        System.out.println(new Test().solution(b));
    }

    public String solution(String s) {
        if(s.length() % 2 == 1) return String.valueOf(s.charAt(s.length() / 2));

        return String.valueOf(s.charAt(s.length() / 2 - 1)  ) + s.charAt(s.length() / 2 );
    }
}
