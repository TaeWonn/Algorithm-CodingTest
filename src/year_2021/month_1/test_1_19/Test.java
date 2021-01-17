package year_2021.month_1.test_1_19;

public class Test {
    public static void main(String[] args) {
        String[] a = {"ss","Kim"};

        System.out.println(new Test().solution(a));
    }

    public String solution(String[] seoul) {
        for( int i= 0; i< seoul.length ; i ++)
            if("Kim".equals(seoul[i]))
                return "김서방은 " + i + "에 있다";
        return null;
    }
}
