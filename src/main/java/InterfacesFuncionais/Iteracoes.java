package InterfacesFuncionais;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {
        String[] nomes = {"João","Paulo","Oliveira","João","Santos","Instrutor","Java","João"};
        Integer[] numeros = {1,2,3,4,5};
        imprimirNomesFiltrados(nomes);
        imprimirTodosOsNomes(nomes);
        imprimirODobroDeCadaNumeroDaLista(numeros);

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Testador");
        profissoes.add("Gerente de projeto");
        profissoes.add("Gerente de qualidade");

        profissoes
                .stream()
                .filter(profisso -> profisso.startsWith("Gerente"))
                .forEach(System.out::println);
    }

    public static void imprimirNomesFiltrados(String... nomes){
        String nomesParaImprimir = "";
        for (int i=0;i<nomes.length; i++){
            if(nomes[i].equals("João")){
                nomesParaImprimir +=" "+nomes[i];
            }
        }
        System.out.println("Imprime nomes do for: "+nomesParaImprimir);

        String nomesParaImprimirDaStream = Stream.of(nomes)
                .filter( n -> n.equals("João"))
                .collect(Collectors.joining()); //Concatena todos os elementos do Array
        System.out.println("Imprime nomes do Stream: "+nomesParaImprimirDaStream);
    }
    public static void imprimirTodosOsNomes(String... nomes){
//        for (String nome: nomes){
//            System.out.println(nome);
//       }
        Stream.of(nomes).forEach(System.out::println);
    }
    public static void imprimirODobroDeCadaNumeroDaLista(Integer... numeros){
        Stream.of(numeros).map(n -> n*2).forEach(System.out::println);
    }

}
