package year_2021.month_1.test_1_18;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Test2 {

    public static void main(String[] args) {
        String[] a = {
                "3285-3764-9934-2453",
                "3285376499342453",
                "3285-3764-99342453",
                "328537649934245",
                "3285376499342459",
                "3285-3764-9934-2452"
        };

        System.out.println(Arrays.toString(new Test2().solution(a)));
    }

    public int[] solution(String[] card_numbers) {
        int[] answer = new int[card_numbers.length];

        for(int i = 0; i < card_numbers.length ; i ++) {
            boolean a = Pattern.matches("[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}",card_numbers[i]);
            boolean b = Pattern.matches("[0-9]{16}",card_numbers[i]);
            if(a || b)
                answer[i] = validate(card_numbers[i].replaceAll("-",""));
            else
                answer[i] = 0;
        }

        return answer;
    }

    public int validate(String card_number) {
        int x = 0;
        int y = 0;
        int cnt = 0;
        for(int i = card_number.length() ; i > 0; i --) {
            cnt ++;

            if(cnt % 2 != 0) {
                y += Integer.parseInt(card_number.substring(i-1 ,i));
                continue;
            }

            int sum = Integer.parseInt(card_number.substring(i -1, i));

            int value = sum * 2;
            if(value < 10) {
                x += value;
                continue;
            }

            String temp = String.valueOf(value);
            x += Integer.parseInt(temp.substring(0,1)) + Integer.parseInt(temp.substring(1, 2));
        }

        return (x + y) % 10 == 0 ? 1 : 0;
    }
}
