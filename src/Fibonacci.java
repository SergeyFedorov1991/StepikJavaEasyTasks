/**
 * Необходимо реализовать функцию:
 *
 *     на вход функция получает целое число n;
 *
 *     необходимо вывести в консоль значение числа Фибоначчи под номером n;
 *     */
public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(fib(100));

    }


    private static long fib(long i) {
        long curr = 1;
        long previous = 0;
        for (long j = 0; j < i - 1; ++j) {
            long temp = curr;
            curr += previous;
            previous = temp;
        }
        return curr;
    }

}
