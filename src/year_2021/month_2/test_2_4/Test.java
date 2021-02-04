package year_2021.month_2.test_2_4;

public class Test {

    public static void main(String[] args) {

        System.out.println(new Test().solution(4));
    }

    public String solution(int num) {
        String[] result = {"Even", "Odd"};
        int i =  (num & 1);
        return result[i];
    }
}
