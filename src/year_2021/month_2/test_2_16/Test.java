package year_2021.month_2.test_2_16;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        String[] arr = {"119","97674223", "1195524421"};
        String[] arr2 = {"123","456","789"};
        String[] arr3 = {"12","123","1235","567","88"};

        System.out.println(new Test().solution(arr));
        System.out.println(new Test().solution(arr2));
        System.out.println(new Test().solution(arr3));

    }

    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for (int i = 0; i< phone_book.length; i ++)
            for (int j = 0; j < i; j ++)
                if(phone_book[i].startsWith(phone_book[j])) return false;

        return true;
    }

}
