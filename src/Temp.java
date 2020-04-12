public class Temp {
    public static void main(String[] args) {
        A b = new B();
        System.out.println(b.sayWhoIAm());
        System.out.println(b.sayWhoWeAre());
    }

    static class A {
        public String sayWhoIAm() {
            return "I'm A";
        }

        public static String sayWhoWeAre() {
            return "We are A";
        }
    }

    static class B extends A {
        public String sayWhoIAm() {
            return "I'm B";
        }

        public static String sayWhoWeAre() {
            return "We are B";
        }
    }



}
