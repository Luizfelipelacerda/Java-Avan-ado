package FatorialRecursivo;

import java.util.function.BiPredicate;

public class FunçõesPuras {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> verificaSeEMaior
                = (parametro, valorComparacao) -> parametro >valorComparacao;

        System.out.println(verificaSeEMaior.test(13,12));
        System.out.println(verificaSeEMaior.test(13,12));
    }
}
