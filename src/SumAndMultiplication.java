/**Найти сумму и произведение цифр, введенного натурального числа
 * */
public class SumAndMultiplication {
    public static void main(String[] args) {
        sumAndMultiplication(12345);

    }

    public static void sumAndMultiplication(int inputNumber){
        int sum = 0;
        int mult = 1;
        int num = inputNumber;
        while (num > 0){
            sum += num % 10;
            mult *= num % 10;
            num = num / 10;

        }
        System.out.println("Число " + inputNumber + "\nСумма цифр: " + sum + "\nПроизведение цифр: " + mult);

    }

}
