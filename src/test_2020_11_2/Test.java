package test_2020_11_2;

import java.util.Arrays;
import java.util.Queue;

public class Test {

    public static void main(String[] args) {

        int[] t1_1 = {93,30,55};
        int[] t1_2 = {1,30,5};
        int[] t2_1 = {95,90,99,99,80,99};
        int[] t2_2 = {1,1,1,1,1,1};

        System.out.println(Arrays.asList(new Test().solution(t1_1, t1_2)));
        System.out.println(Arrays.asList(new Test().solution(t2_1, t2_2)));

    }

    public int[] solution(int[] progresses, int[] speeds){
        int[] dayOfend = new int[100];
        int day = -1;
        for(int i=0; i<progresses.length; i++) {
            while(progresses[i] + (day*speeds[i]) < 100) {
                day++;
            }
            dayOfend[day]++;
        }

        return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
    }
}
