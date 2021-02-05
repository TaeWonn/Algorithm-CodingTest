package year_2021.month_2.test_2_6;

public class Test {

    public static void main(String[] args) {
        System.out.println(new Test().solution("01033334444"));
    }

    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();

        for(int i =0; i< phone_number.length() -4; i++)
            answer.append("*");

        answer.append(phone_number.substring(phone_number.length()-4, phone_number.length()) );

        return answer.toString();
    }
}
