package year_2021.month_1.test_1_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        //int[] a = {1,2,3,4,5,1,2,3,4,5,6,7,8,9,1,2,3,4,5};
        int[] b = {1,3,2,4,2};

        System.out.println(Arrays.toString(new Test().solution(a)));
        System.out.println(Arrays.toString(new Test().solution(b)));
    }

    public int[] solution(int[] answers) {
        int[] answer = {0,0,0};

        int[] a = {1,2,3,4,5};
        int[] b = { 2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for(int i = 0; i< answers.length; i ++) {
            if(answers[i] == a[i % a.length ]) { answer[0] = answer[0]+1; }
            if(answers[i] == b[i % b.length ]) { answer[1] = answer[1]+1; }
            if(answers[i] == c[i % c.length ]) { answer[2] = answer[2]+1; }
        }

        int max = Integer.MIN_VALUE;
        for(int tmp : answer)
            if(max < tmp) max = tmp;

        List<Integer> arr = new ArrayList<>();
        for(int i=0; i< answer.length; i++)
            if(max == answer[i]) arr.add(i + 1);

        return arr.stream()
                .mapToInt(i -> i.intValue())
                .toArray();
    }
}
