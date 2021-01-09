package year_2020.month_11.test_2020_11_13;

import java.util.HashMap;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {

        int[][] a = {
                {1,4},{3,4},{3,10}
        };

        int[] reuslt = new Test().solution(a);
        for(int b : reuslt){
            System.out.println(b);
        }
    }

    public int[] solution(int[][] v) {
        int[] answer = new int[2];

        HashMap<Integer,Integer> x = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> y = new HashMap<Integer,Integer>();

        for(int i=0; i< v.length; i++) {
            x.put(v[i][0],x.getOrDefault(v[i][0],0)+1);
            y.put(v[i][1],y.getOrDefault(v[i][1],0)+1);
        }

        String tempX = "";
        String tempY = "";
        Iterator itX =x.entrySet().iterator();
        Iterator itY =y.entrySet().iterator();
        while (itX.hasNext()){
            tempX = itX.next().toString();
            String[] a = tempX.split("=");
            if(Integer.parseInt(a[1]) == 1) { answer[0] = Integer.parseInt(a[0]);}
        }
        while (itY.hasNext()){
            tempY = (String)itY.next().toString();
            String[] a = tempY.split("=");
            if(Integer.parseInt(a[1]) == 1) { answer[1] = Integer.parseInt(a[0]);}
        }

        return answer;
    }
}
