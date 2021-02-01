package year_2021.month_2.test_2_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        int[] arr =  {4, 3, 2, 1};
        int[] arr2 = {10};
        System.out.println(Arrays.toString(new Test().solution(arr)));
        System.out.println(Arrays.toString(new Test().solution(arr2)));
    }

    public int[] solution(int[] arr) {
        int[] answer;
        List<Integer> result = new ArrayList<>();

        if(arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }

        int min = Integer.MAX_VALUE;

        for(int a : arr)
            if(a < min) min = a;

        for(int a: arr)
            if(a != min) result.add(a);


        return result.stream()
                .mapToInt(i -> i.intValue())
                .toArray();
    }
}
