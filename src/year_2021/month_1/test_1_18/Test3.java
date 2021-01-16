package year_2021.month_1.test_1_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {
        int[] a = {1,3,7,8,10,15};
        int[][] b = {{0, 1, 4, 4}, {3, 1, 5, 3}};
        //System.out.println(new Test3().solution(a, 5));
        System.out.println(new Test3().solution(b));
    }

    public int solution(int[] scores, int k) {
        int answer = 5;

        int result = 0;
        int index = 0;




        return answer;
    }

    public int result (int[] a) {



        return 0;
    }

    public long solution(int[][] rectangles) {
        long answer = 0;

        long maxX = 0;
        long maxY = 0;

        for(int[] a : rectangles) {
            if(maxX < a[2]) maxX =(long) a[2] + a[0];
            if(maxY < a[3]) maxY =(long) a[3] + a[1];
        }

        long[][] a = new long[(int) (maxX + 1)][(int) (maxY +1)];

        for(int i=0; i< rectangles.length; i ++) {
            for(int j = rectangles[i][0]; j <= rectangles[i][2]+rectangles[i][0];j ++) {
                for(int x = rectangles[i][1]; x <= rectangles[i][3] + rectangles[i][1]; x++) {
                    a[j][x] = 1;
                }
            }
        }

        for(int i=0;i < a.length; i ++)
            for(int j= 0 ; j< a[i].length; j++)
                if(a[i][j] == (long)1 )
                    answer++;

        return answer;
    }
}
