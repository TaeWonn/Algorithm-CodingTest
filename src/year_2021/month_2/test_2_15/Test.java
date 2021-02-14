package year_2021.month_2.test_2_15;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] a = {9,20,28,18,11};
        int[] b = {30,1,21,17,28};

        System.out.println(Arrays.toString(new Test().solution(5, a , b)));
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < arr1.length; i ++) {
            int temp = arr1[i] | arr2[i];

            String byteData = Integer.toBinaryString(temp);
            String byteCode = String.format("%0" + n + "d", Long.parseLong(byteData));

            StringBuilder data = new StringBuilder();

            for(int j = 0; j < byteCode.length(); j ++)
                data.append(byteCode.charAt(j) == '0' ? " ": "#");

            answer[i] = data.toString();
        }



        return answer;
    }
}
