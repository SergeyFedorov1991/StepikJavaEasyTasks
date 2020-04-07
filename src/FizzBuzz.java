public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(9);
        fizzBuzz(15);
        fizzBuzz(20);
    }

    public static void fizzBuzz(int input){

        if ((input % 3 == 0) & (input % 5 == 0)){
            System.out.println("FizzBuzz");
        } else if (input % 3 == 0) {
            System.out.println("Fizz");
        } else if (input % 5 == 0) {
            System.out.println("Buzz");
        }

    }


}
