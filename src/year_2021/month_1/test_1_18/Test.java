package year_2021.month_1.test_1_18;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        int[] a = {1,1,3,3,0,1,1};
        int[] b = {4,4,4,3,3};

        System.out.println(Arrays.toString(new Test().solution(a)));
        System.out.println(Arrays.toString(new Test().solution(b)));
    }

    public int[] solution(int []arr) {
        String a= "";
        StringBuffer sb = new StringBuffer();
        StringBuilder sbl = new StringBuilder();

        List<Integer> list = new ArrayList<>();

        list.add(arr[0]);

        for(int i = 1 ; i < arr.length; i ++)
            if(list.get(list.size() - 1) != arr[i])
                list.add(arr[i]);


        return list.stream()
                .mapToInt(i -> i.intValue())
                .toArray();
    }
}
