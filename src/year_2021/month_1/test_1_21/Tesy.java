package year_2021.month_1.test_1_21;


import java.time.LocalDate;

public class Tesy {

    public static void main(String[] args) {

        System.out.println(new Tesy().solution(5,24));
    }

    public String solution(int a, int b) {
        String[] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

        LocalDate date = LocalDate.of(2016 , a, b +1);
        return week[date.getDayOfWeek().getValue() -1 ];
    }
}
