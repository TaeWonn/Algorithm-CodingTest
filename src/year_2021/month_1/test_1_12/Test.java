package year_2021.month_1.test_1_12;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        String[] a = {"leo","kiki","eden"};
        String[] b = {"eden","kiki"};
        System.out.println(new Test().solution(a,b));
    }

    public String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < participant.length; i ++)
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);

        for(int i = 0; i < completion.length; i ++)
            map.put(completion[i], map.get(completion[i]) -1);

        for(Map.Entry<String, Integer> e:map.entrySet())
            if(e.getValue() != 0)
                return e.getKey();

        return null;
    }
}
