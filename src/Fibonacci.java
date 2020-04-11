/**
 * Необходимо реализовать функцию:
 *
 *     на вход функция получает целое число n;
 *
 *     необходимо вывести в консоль значение числа Фибоначчи под номером n;
 *     */
public class Fibonacci {
    public static void main(String[] args) {
        printFibonacci(6); //8
        printFibonacci(2147483648L); //89
    }

    public static void printFibonacci(long n){
        int n0 = 0;
        int n1 = 1;
        for (long i = 2; i <= n; ++i) {
            int next = n0 + n1;
            n0 = n1;
            n1 = next;
        }
        System.out.println(n1);

    }

}
