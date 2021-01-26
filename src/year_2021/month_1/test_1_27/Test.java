package year_2021.month_1.test_1_27;

public class Test {

    public static void main(String[] args) {


    }

    public String solution(String s, int n) {

        char[] a =s.toCharArray();
        for(int i =0 ; i< a.length; i ++) {
            if(a[i] >= 65 && a[i] <= 90){
                int tmp = (char) (a[i] + n) ;
                a[i] = (char) (tmp > 90 ? tmp - 26 : tmp);
            }

            if(a[i] >= 97 && a[i] <= 122) {
                int tmp = (char) (a[i] + n) ;
                a[i] = (char) (tmp > 122 ? tmp - 26 : tmp);
            }
        }

        return String.valueOf(a);
    }
}
