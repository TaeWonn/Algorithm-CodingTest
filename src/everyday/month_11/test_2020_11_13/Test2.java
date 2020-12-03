package everyday.month_11.test_2020_11_13;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Test2 {

    public static void main(String[] args) {

        String[] a= {
            "3285-3764-9934-2453",
            "3285376499342453",
            "3285-3764-99342453",
            "328537649934245",
            "3285376499342459",
            "3285-3764-9934-2452"
        };
        //int[] b= new Test2().solution(a);
        //Arrays.stream(b).forEach(System.out::println);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date()));
    }

    public int[] solution(String[] card_numbers) {
        int[] answer = new int[card_numbers.length];

        for(int i=0; i< card_numbers.length; i ++){
            String temp = card_numbers[0];
            temp = temp.replaceAll("-","");
            char[] arrTemp = temp.toCharArray();

            for(int j=0; j< arrTemp.length; j++){
                if(Character.getNumericValue(arrTemp[j]) %2 == 1){
                    arrTemp[j] =(char)(sum(Character.getNumericValue(arrTemp[j]) * 2)+48);
                }
            }
            int aa = 0;
            int bb = 0;
            for(int j = 0; j<arrTemp.length; j++){
                if(j %2 ==0) aa += arrTemp[j] -48;
                if(j %2 ==1) bb += arrTemp[j] -48;
            }
            System.out.println(aa +":"+ bb);

            answer[i] = (aa + bb) % 10 ==0 ? 1 : 0;
        }

        return answer;
    }

    public int sum(int idx) {
        int val = idx;
        if(idx < 10) return idx;
        String temp = String.valueOf(val);

        return sum(Integer.parseInt(String.valueOf(temp.charAt(0))) + Integer.parseInt(String.valueOf(temp.charAt(1))) );
    }
}
