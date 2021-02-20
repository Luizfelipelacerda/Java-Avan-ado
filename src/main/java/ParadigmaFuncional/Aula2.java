package ParadigmaFuncional;

import java.util.Arrays;

public class Aula2 {
    public static void main(String[] args) {

        int[] valor = {1,2,3,4,5,6};

        //Paradigma funcional
        Arrays.stream(valor)
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero * 2)
                .forEach(numero -> System.out.println(numero));

        System.out.println("------------------------");

        //Paradigma iperativo
        for (int i=0; i<valor.length; i++){
            if(valor[i] % 2 == 0){
                System.out.println(valor[i]*2);
            }
        }
    }
}
