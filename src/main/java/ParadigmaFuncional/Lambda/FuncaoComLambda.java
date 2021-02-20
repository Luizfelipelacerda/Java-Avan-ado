package ParadigmaFuncional.Lambda;

public class FuncaoComLambda {
    public static void main(String[] args) {

        Funcao colocarPrefixoSrNaString = valor -> "Sr."+valor;
        Funcao colocarPrefixoOverLordNaString = valor -> "Overlord "+valor;
        System.out.println(colocarPrefixoSrNaString.gerar("joão"));
        System.out.println(colocarPrefixoOverLordNaString.gerar("Luiz"));
    }
}