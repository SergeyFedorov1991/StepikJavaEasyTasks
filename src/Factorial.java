/**https://habr.com/ru/post/255761/
 * */
import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        long start, stop, result;
        BigInteger bigResult;
        final int NUMBER = 10;

        start = System.nanoTime();
        result = factNaive(NUMBER);
        stop = System.nanoTime();
        System.out.println(String.format("Алгоритм простого перемножения всех чисел. \nФакториал числа %d: ", NUMBER) + result);
        System.out.println(String.format("Время выполнения factNaive:  %,d ns\n", stop - start));

        start = System.nanoTime();
        bigResult = factBigInteger(NUMBER);
        stop = System.nanoTime();
        System.out.println(String.format("Алгоритм простого перемножения всех чисел с использованием BigInteger. \nФакториал числа %d: ", NUMBER) + bigResult);
        System.out.println(String.format("Время выполнения factBigInteger:  %,d ns\n", stop - start));

        start = System.nanoTime();
        result = FactTree(NUMBER);
        stop = System.nanoTime();
        System.out.println(String.format("Алгоритм вычисления деревом. \nФакториал числа %d: ", NUMBER) + result);
        System.out.println(String.format("Время выполнения FactTree:  %,d ns\n", stop - start));



    }

    static int factNaive(int inputNumber)
    {
        int result = 1;
        for (int i = 2; i <= inputNumber; i++)
            result *= i;
        return result;
    }

    static BigInteger factBigInteger(int inputNumber)
    {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 2; i <= inputNumber; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }




    static int FactTree(int n)
    {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        if (n == 1 || n == 2)
            return n;
        return ProdTree(2, n);
    }

    static int ProdTree(int l, int r)
    {
        if (l > r)
            return 1;
        if (l == r)
            return l;
        if (r - l == 1)
            return l * r;
        int m = (l + r) / 2;
        return ProdTree(l, m) * ProdTree(m + 1, r);
    }


}
