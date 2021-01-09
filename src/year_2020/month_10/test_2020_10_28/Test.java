package year_2020.month_10.test_2020_10_28;

import java.io.Serializable;
import java.util.*;

/*
* 초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.

제한사항
prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
prices의 길이는 2 이상 100,000 이하입니다.
입출력 예
prices	return
[1, 2, 3, 2, 3]	[4, 3, 1, 1, 0]
입출력 예 설명
1초 시점의 ₩1은 끝까지 가격이 떨어지지 않았습니다.
2초 시점의 ₩2은 끝까지 가격이 떨어지지 않았습니다.
3초 시점의 ₩3은 1초뒤에 가격이 떨어집니다. 따라서 1초간 가격이 떨어지지 않은 것으로 봅니다.
4초 시점의 ₩2은 1초간 가격이 떨어지지 않았습니다.
5초 시점의 ₩3은 0초간 가격이 떨어지지 않았습니다.
※ 공지 - 2019년 2월 28일 지문이 리뉴얼되었습니다.
*
* */
public class Test implements Serializable {

    public static void main(String[] args) {
        int[] test = {1,2,3,2,3};
        new Test().solution(test);
    }

    public int[] solution(int[] prices) {
        List<Integer> result = new ArrayList<>();

        int breakpoint = 0;
        int max = 0;
        HashMap<Integer,Integer> resultMap = new HashMap<>();
        for(int i=0;i<prices.length; i++){
            resultMap.put(i, i == prices.length-1 ? 0 : 1);
            if(i != 0 && i == prices.length-1){

                if(max <= prices[i]){
                    max = prices[i];
                    for(int j=breakpoint; j<i; j++){
                        resultMap.put(j,resultMap.get(j)+1);
                    }
                } else {
                    breakpoint = i +1;
                }
            }
            if( i==0) max = prices[i];
        }
        for(int i= 0; i< prices.length;i++){
            result.add(resultMap.get(i));
        }
        System.out.println(result);
        return result.stream().mapToInt(i->i).toArray();
    }

    public int[] answer(int[] prices){
        int[] answer = new int[prices.length];

        for(int i = 0; i < prices.length; i++)
        {
            for(int j=i+1; j < prices.length; j++)
            {
                // 현재 값이 다음값보다 큰경우
                if(prices[i] > prices[j])
                {
                    answer[i] = j-i;
                    break;
                }
                // 현재 값보다 다음값이 같거나 작은 경우
                else
                    answer[i] = j-i;
            }
        }

        //System.out.println(Arrays.toString(answer));

        return answer;
    }

    public int[] answer2(int[] prices) {
        Stack<Integer> beginIdxs = new Stack<>();
        int i=0;
        int[] terms = new int[prices.length];

        beginIdxs.push(i);
        for (i=1; i<prices.length; i++) {
            while (!beginIdxs.empty() && prices[i] < prices[beginIdxs.peek()]) {
                int beginIdx = beginIdxs.pop();
                terms[beginIdx] = i - beginIdx;
            }
            beginIdxs.push(i);
        }
        while (!beginIdxs.empty()) {
            int beginIdx = beginIdxs.pop();
            terms[beginIdx] = i - beginIdx - 1;
        }

        return terms;
    }
 }
