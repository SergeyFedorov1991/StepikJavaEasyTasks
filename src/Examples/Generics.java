package Examples;

/**
 * Реализуйте generic-класс Pair, похожий на Optional, но содержащий пару элементов разных типов
 * и не запрещающий элементам принимать значение null.
 *
 * Реализуйте методы getFirst(), getSecond(), equals() и hashCode(), а также статический фабричный метод of().
 * Конструктор должен быть закрытым (private).*/


public class Generics {
    public static void main(String[] args) {

        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!

    }
}

class Pair<M, N> {

    private final M valueM;
    private final N valueN;

    private Pair() {
        this.valueM = null;
        this.valueN = null;
    }

    private Pair(M valueM, N valueN) {
        this.valueM = valueM;
        this.valueN = valueN;
    }

    public static<M,N> Pair<M, N> of(M valueM1, N valueN1) {
        return new Pair<>(valueM1, valueN1);
    }

    public M getFirst() {
        return this.valueM;
    }

    public N getSecond() {
        return this.valueN;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        Pair<M, N> otherPair = (Pair<M, N>) obj;
        if (valueM != null ? !valueM.equals(otherPair.getFirst()) : otherPair.getFirst() != null) return false;
        return !(valueN != null ? !valueN.equals(otherPair.getSecond()) : otherPair.getSecond() != null);
    }
    @Override
    public int hashCode(){
        return valueM.hashCode() + valueN.hashCode();
    }

}



