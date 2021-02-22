package year_2021.month_2.test_2_21;

public class Test {

    public String solution(String p) {
        String answer = "";
        if(answer.equals(p)) return answer;
        int sum = 0;
        boolean bool = true;
        boolean switchBool = false;
        int index = -1;

        for(int i = 0; i < p.length(); i++ )  {
            if(p.charAt(i) == '(') {
                sum ++;
                bool = validate(sum, true);
            }
            if(p.charAt(i) == ')') {
                sum --;
                bool = validate(sum, false);
            }
            if(!switchBool && !bool) {
                switchBool = true;
                index = i;
            }
        }

        // 올바른 문자열열
       if(bool) return p;

        String u = p.substring(0, index);
        String v = p.substring(index);
        if(index == -1) v = "";




        return answer;
    }

    public boolean validate(int sum, boolean isLeft) {
        boolean result = true;

        if(isLeft) {
            if(sum > 0) result = false;
        } else {
            if(sum < 0) result = false;
        }

        return result;
    }

}
