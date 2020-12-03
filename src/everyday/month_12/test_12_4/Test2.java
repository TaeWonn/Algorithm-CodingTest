package everyday.month_12.test_12_4;

public class Test2 {
    public static void main(String[] args) {
        String a= "ABC";

        a = a.toLowerCase();

        char[] b = a.toCharArray();

        b[0] = (char) ((int)b[0] - 32);


        System.out.println(a);
        System.out.println(new String(b));
    }
}
