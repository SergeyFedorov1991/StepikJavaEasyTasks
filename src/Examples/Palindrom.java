package Examples;

public class Palindrom {
    public static void main(String[] args) {
        checkPalindrom("Madam i’m Adam");

    }

    public static void checkPalindrom(String s) {
        s = s.replaceAll("\\W", "");//удаляем все ненужное
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String result = sb.toString();

        if (s.equalsIgnoreCase(result)) {
            System.out.println("yes");
        } else System.out.println("no");

    }




}

