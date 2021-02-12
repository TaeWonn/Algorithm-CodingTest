package year_2021.month_2.test_2_13;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        run(a,b);
    }

    public static void run(int a,int b) {

        for(int i = 0 ; i < b; i++) {
            for(int j = 0; j < a; j++)
                System.out.print("*");

            System.out.println();
        }


    }
}
