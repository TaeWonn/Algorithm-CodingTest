package everyday.month_12.test_12_10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.

예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.

0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
*/
public class Test2 {
    public static void main(String[] args) {
        int[] t1 = {6,10,2};
        int[] t2 = {3,30,34,9,5};

        System.out.println(solution(t1));
        System.out.println(solution(t2));
    }

    public static String solution(int[] numbers) {
        String answer = "";


        String[] a= new String[numbers.length];

        for(int i =0; i< a.length; i ++)
            a[i] = String.valueOf(numbers[i]);

        Arrays.sort(a, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        for (String b:a)
            answer += b;

        if(answer.charAt(0) =='0' ) return "0";
        return answer;
    }
}
