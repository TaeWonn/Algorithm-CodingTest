package year_2020.month_11.test_2020_11_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/*
* 어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자를 구하려 합니다.

예를 들어, 숫자 1924에서 수 두 개를 제거하면 [19, 12, 14, 92, 94, 24] 를 만들 수 있습니다. 이 중 가장 큰 숫자는 94 입니다.

문자열 형식으로 숫자 number와 제거할 수의 개수 k가 solution 함수의 매개변수로 주어집니다. number에서 k 개의 수를 제거했을 때 만들 수 있는 수 중 가장 큰 숫자를 문자열 형태로 return 하도록 solution 함수를 완성하세요.

제한 조건
number는 1자리 이상, 1,000,000자리 이하인 숫자입니다.
k는 1 이상 number의 자릿수 미만인 자연수입니다.
* */
public class Test {

    public static void main(String[] args) {

        System.out.println(new Test().solution("1924",2));
        System.out.println(new Test().solution("1231234",3));
        System.out.println(new Test().solution("4177252841",4));

    }

    public String solution(String number, int k) {
        String answer = "";
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<number.length(); i++){
            list.add(new Integer(number.substring(i,i+1)));
        }
        System.out.println(list);
        for(int i=0;i< k; i++){
            int min = Collections.min(list);
            for(int j=0;j<list.size();j++){
                if(min == list.get(j).intValue()) list.remove(new Integer(j));
            }
        }
        for(int i=0;i<list.size();i++) answer += list.get(i);
        return answer;
    }

    public String answer(String number, int k) {
        char[] result = new char[number.length() - k];
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<number.length(); i++) {
            char c = number.charAt(i);
            while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
                stack.pop();
            }
            stack.push(c);
        }
        for (int i=0; i<result.length; i++) {
            result[i] = stack.get(i);
        }
        return new String(result);
    }
}
