package everyday.month_11.test_2020_11_4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다. 학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다. 예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다. 체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
 *
 * 전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한사항
 * 전체 학생의 수는 2명 이상 30명 이하입니다.
 * 체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
 * 여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
 * 여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
 * 여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
 * 입출력 예
 * n	lost	reserve	return
 * 5	[2, 4]	[1, 3, 5]	5
 * 5	[2, 4]	[3]	4
 * 3	[3]	[1]	2
 * 입출력 예 설명
 * 예제 #1
 * 1번 학생이 2번 학생에게 체육복을 빌려주고, 3번 학생이나 5번 학생이 4번 학생에게 체육복을 빌려주면 학생 5명이 체육수업을 들을 수 있습니다.
 *
 * 예제 #2
 * 3번 학생이 2번 학생이나 4번 학생에게 체육복을 빌려주면 학생 4명이 체육수업을 들을 수 있습니다.
 *
 * 출처
 *
 * ※ 공지 - 2019년 2월 18일 지문이 리뉴얼되었습니다.
 * ※ 공지 - 2019년 2월 27일, 28일 테스트케이스가 추가되었습니다.
 */
public class Test {

    public static void main(String[] args) {

        int a_1 = 5;
        int[] a_2 = {2,4};
        int[] a_3 = {1,3,5};
        int b_1 = 5;
        int[] b_2 = {2,4};
        int[] b_3 = {3};
        int c_1 = 3;
        int[] c_2 = {3};
        int[] c_3 = {1};
        int d_1 = 9;
        int[] d_2 = {1,3,5};
        int[] d_3 = {2,4};

        System.out.println(new Test().solution(a_1,a_2,a_3));
        System.out.println(new Test().solution(b_1,b_2,b_3));
        System.out.println(new Test().solution(c_1,c_2,c_3));
        System.out.println(new Test().solution(d_1,d_2,d_3));

    }

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        List<Integer> lostList = Arrays.stream(lost).boxed().collect(Collectors.toList());
        List<Integer> reserveList = Arrays.stream(reserve).boxed().collect(Collectors.toList());
        HashMap<Integer,Integer> map = new HashMap();
//        List<Integer> result = new ArrayList<>();


        for(int i=1; i<= n ; i++){
            map.put(i,lostList.contains(i)? 0 : (reserveList.contains(i)?2:1));
        }

        for (int i= 1; i<= n;i++){
            if(map.get(i) == 0){
                if(map.get(i -1) != null && map.get(i -1) > 1){
                    map.put(i-1, 1);
                    map.put(i , 1);
                    continue;
                }
                if(map.get(i +1) != null && map.get(i +1) > 1){
                    map.put(i+1, 1);
                    map.put(i , 1);
                    continue;
                }
            }
        }

        for (int i=1; i<=n; i++){
            if(map.get(i) != 0) answer ++;
            System.out.println("map i ->" + i +" , "+ map.get(i));
        }

        //answer = result.size();

        return answer;
    }

    public int answer(int n, int[] lost, int[] reserve) {
        int[] people = new int[n];
        int answer = n;

        for (int l : lost)
            people[l-1]--;
        for (int r : reserve)
            people[r-1]++;

        for (int i = 0; i < people.length; i++) {
            if(people[i] == -1) {
                if(i-1>=0 && people[i-1] == 1) {
                    people[i]++;
                    people[i-1]--;
                }else if(i+1< people.length && people[i+1] == 1) {
                    people[i]++;
                    people[i+1]--;
                }else
                    answer--;
            }
        }
        return answer;
    }
}
