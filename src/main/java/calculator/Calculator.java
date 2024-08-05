package calculator;
import java.lang.Math;


public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sqrt(int a, int b) {
        int result = a/b;
        return (int) Math.sqrt(result);
    }
}
