package year_2021.month_1.test_1_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        int[] a = {5,9,7,10};

        System.out.println(Arrays.toString(new Test().solution(a, 5)));
    }

    public int[] solution(int[] arr, int divisor) {

        List<Integer> result = new ArrayList<>();

        for(int a : arr)
            if(a % divisor == 0) result.add(a);

        if(result.size() == 0) result.add(-1);
        return result.stream().sorted().mapToInt(i -> i.intValue()).toArray();
    }
}
