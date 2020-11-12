package everyday.month_11.test_2020_11_11;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class SampleMethodReference2 {

    private static String doSomething(Function<Integer, String> f) {
        return f.apply(10);
    }

    private static String method(int n) {
        return String.valueOf(n);
    }

    private static Function<Integer, String> getMethod() {
        return SampleMethodReference2::method;
    }

    public static void main(String[] args) {
        // void doSomething(Method)
        doSomething(SampleMethodReference2::method);

        // Method doSomething()
        final Function<Integer, String> method = getMethod();
        final String result = method.apply(10);

        // List<Method> list
        final List<Function<Integer, String>> methods = Arrays.asList(method, getMethod());
        for (final Function<Integer, String> m : methods) {
            method.apply(10);
        }
    }
}