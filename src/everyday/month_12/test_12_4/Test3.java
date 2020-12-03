package everyday.month_12.test_12_4;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String input2 = br.readLine();

        int[] arrA = toArray(input);
        int[] arrB = toArray(input2);

        int[] result = new int[arrA.length + arrB.length];

        System.arraycopy(arrA,0, result,0, arrA.length);
        System.arraycopy(arrB,0, result,arrA.length , arrB.length);

        result = Arrays.stream(result).sorted().toArray();

        for(int i=0; i< result.length; i ++){
            System.out.print(result[i]);
            if(i != result.length -1 ) System.out.print(" ");
        }
    }

    public static int[] toArray(String target) {

        String[] strArr = target.split(" ");

        int[] intArr = Arrays.stream(strArr)
                .mapToInt(i -> Integer.parseInt(i))
                .toArray();

        return intArr;
    }
}
