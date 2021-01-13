package year_2021.month_1.test_1_14;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] a = {1,5,2,6,3,7,4};
        int[][] b = {{2,5,3},{4,4,1},{1,7,3}};
        System.out.println(Arrays.toString(new Test().solution(a,b)));
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i ++) {

            int[] temp = getArr(array, commands[i][0], commands[i][1]);
            Arrays.sort(temp);

            answer[i] = temp[commands[i][2] -1 ];
        }

        return answer;
    }

    public int[] getArr(int[] array, int start, int end) {
        int[] result = new int[end - start + 1];
        if(start == end) return new int[] { array[start - 1] };

        int cnt = 0;
        for(int i = start - 1; i < end ; i ++) {
            result[cnt] = array[i];
            ++ cnt;
        }

        return  result;
    }

}
