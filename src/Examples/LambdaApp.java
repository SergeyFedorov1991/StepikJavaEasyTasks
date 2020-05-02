/**
 * Пример лямбды*/
package Examples;

public class LambdaApp {

    public static void main(String[] args) {

        Calculate operation;
        operation = (x,y)->x * y;

        int result = operation.calculate(10, 20);
        System.out.println(result); //30

    }
}
interface Calculate {
    int calculate(int x, int y);
}