package year_2021.month_2.test_2_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
//        int[] a = {93,30,55};
//        int[] b = {1,30,5};

        int[] a = {95,90,99,99,80,99};
        int[] b = {1,1,1,1,1,1};
        System.out.println(Arrays.toString(new Test().solution(a, b)));
    }

    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        boolean[] end = new boolean[progresses.length];
        int min = 0;
        a: while(true) {
            int today = 0;
            boolean temp = false;

            b: for (int i = min; i< end.length; i++ ) {
                int sum = progresses[i] + speeds[i];
                progresses[i] = sum;

                if(sum >= 100) {
                    temp = true;
                    end[i] = true;
                    today ++;
                }

                if(temp && sum < 100) break b;
            }

            if(today > 0 && vail(end, min, result.size()) && vail2(end, min)) {
                result.add(today);
                min = result.stream().reduce(0, Integer::sum);
            }

            for(boolean bool : end) {
                if(!bool) continue a;
            }
            if(min == progresses.length -1) break a;
            break a;
        }

        return result.stream().mapToInt(i -> i.intValue()).toArray();
    }

    private boolean vail(boolean[] end, int min, int start) {
        boolean temp = false;
        for (int i = start; i >= min ; i-- ) {
            if(start == min) return true;
            if(temp  && !end[i]) return false;

            if(end[i]) temp= true;
        }

        return true;
    }

     public boolean vail2(boolean[] end, int min ) {
        boolean temp = false;
        for(boolean bool : end) {
            if(temp && !bool) return false;
            if(bool) temp = true;
        }

        return true;
     }

}
