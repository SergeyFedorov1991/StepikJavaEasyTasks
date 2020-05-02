package Examples;

import java.util.function.DoubleUnaryOperator;

public class CalcIntegral {

//метод левых прямоугольников

    public static void main(String[] args) {

        System.out.println(integrate(x -> 1, 0, 10));//10.0
        System.out.println(integrate(x -> x + 2, 0, 10));//70.0
        System.out.println(integrate( x -> Math.sin(x) / x , 1, 5));//0.603848

    }
    public static double integrate(DoubleUnaryOperator f, double a, double b) {

        double n = 10000000; // кол-во прямоугольников
        double step = (b - a) / n;  //ширина одного прямоугольника
        double result = 0;

        for (double i = 0; i <= n-1; i++) {
            result += f.applyAsDouble(a + i * step) * step;
        }

        return result;
    }
}