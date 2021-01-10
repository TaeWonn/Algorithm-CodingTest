package year_2021.month_1.test_1_10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        int[] a = {2,1,3,4,1};


        System.out.println(Arrays.toString(new Test().solution(a)));
    }

    public int[] solution(int[] numbers) {

        Set<Integer> set = new HashSet();

        for(int i = 0 ; i < numbers.length; i++)
            for(int j = i + 1; j < numbers.length; j ++)
                set.add(numbers[i] + numbers[j]);

        return  set.stream()
                    .mapToInt(Integer::intValue)
                    .sorted()
                    .toArray();
    }
}
