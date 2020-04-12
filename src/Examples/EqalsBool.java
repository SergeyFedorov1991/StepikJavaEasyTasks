/**
 * эквиваленты некоторых булевских операторов*/

package Examples;

public class EqalsBool {
    public static void main(String[] args) {
        int a, b;
        boolean a1, b1;
        for (a = 0; a < 2; a++) {
            for (b = 0; b < 2; b++) {
                System.out.printf("%d %d  => ", a, b);
                if (a == 0) a1 = false;
                else a1 = true;
                if (b == 0) b1 = false;
                else b1 = true;

                System.out.print((a1 ^ b1) + " " + (a1 != b1) + " // ");
                System.out.print((a1 & b1) + " " + (a1 = b1) + " // ");
                System.out.print((a1 | b1) + " " + (a1 != b1) + " // ");
                System.out.println((a1 | b1) + " " + (a1 || b1));
            }
        }
    }
}



