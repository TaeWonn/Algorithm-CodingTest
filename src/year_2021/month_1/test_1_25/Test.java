package year_2021.month_1.test_1_25;

public class Test {

    public static void main(String[] args) {
        System.out.println(new Test().solution(3));
    }

    public String solution(int n) {
        StringBuilder sb = new StringBuilder();

        for(int i =1 ; i <= n ; i++)
            sb.append( i % 2 == 1 ?"수" : "박");
        return sb.toString();
    }
}
