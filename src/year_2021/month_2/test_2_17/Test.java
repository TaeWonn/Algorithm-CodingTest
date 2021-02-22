package year_2021.month_2.test_2_17;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] a = {70,50,80,50};

        System.out.println(new Test().solution(a, 100));

    }

    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        boolean bool = false;
        int temp = 0;
        for (int i = 0; i <people.length; i ++) {
            if(bool) {
                if(temp + people[i] > limit) {
                    answer++;
                    temp = people[i];
                } else {
                    temp += people[i];
                }
                if(i == people.length -1) answer++;

            } else {
                temp += people[i];
            }
        }
        return answer;
    }
}
