package year_2021.month_2.test_2_3;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        System.out.println(new Test().solution("3people unFlowed me"));
    }

    public String solution(String s) {
        return Arrays.stream(s.split(" "))
                .map(str -> str.toLowerCase().split("") )
                .map(this::makeString)
                .collect(Collectors.joining(" "))
                + (s.endsWith(" ") ? " "  :"")
                ;
    }
    public String makeString(String[] strings) {
        StringBuilder sb = new StringBuilder("");
        sb.append(strings[0].toUpperCase(Locale.ROOT));
        for( int i =1 ; i<strings.length; i++)
            sb.append(strings[i]);
        return sb.toString();
    }
}
