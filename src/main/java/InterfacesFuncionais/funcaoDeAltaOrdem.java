package InterfacesFuncionais;

public class funcaoDeAltaOrdem {
    public static void main(String[] args) {
        Calculo SOMA = (a,b) -> a+b;
        Calculo SUBTRACAO = (a,b) -> a-b;
        Calculo DIVISAO = (a,b) -> a/b;
        Calculo MULTIPLICACAO = (a,b) -> a*b;

        System.out.println(executarOperacao(SOMA,6,3));
        System.out.println(executarOperacao(SUBTRACAO,6,3));
        System.out.println(executarOperacao(MULTIPLICACAO,3,3));
        System.out.println(executarOperacao(DIVISAO,27,3));

    }

    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a,b);
    }
}

interface Calculo{
    public int calcular(int a, int b);
}
