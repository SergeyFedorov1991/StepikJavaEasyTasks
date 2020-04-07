/**
 * Задача FizzBuzz.
 *
 * Необходимо реализовать функцию:
 *
 *     на вход функция получает целое число;
 *
 *     нужно вывести в консоль слово Fizz, если число кратно трем;
 *
 *     нужно вывести в консоль слово Buzz, если число кратно пяти;
 *
 *     нужно вывести в консоль слово FizzBuzz, если число кратно трем и пяти одновременно;
 *
 *     если число не кратно ни трем, ни пяти, вывести это число.*/
public class FizzBuzz {
    public static void main(String[] args) {
        for(int i = 1; i <= 30; i++){
            fizzBuzz(i);
        }
    }

    public static void fizzBuzz(int input){

        if ((input % 3 == 0) & (input % 5 == 0)){
            System.out.println(input + " = FizzBuzz");

        }else if (input % 3 == 0) {
            System.out.println(input + " = Fizz Результат: " + input / 3);

        }else if (input % 5 == 0) {
            System.out.println(input + " = Buzz Результат: " + input / 5);

        } else System.out.println(input);


    }


}
