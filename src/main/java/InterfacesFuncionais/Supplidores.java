package InterfacesFuncionais;

import java.util.function.Supplier;

public class Supplidores {
    public static void main(String[] args) {
//        Supplier<Pessoa> supplier = () -> new Pessoa();
        Supplier<Pessoa> supplier = Pessoa::new;
        System.out.println(supplier.get());
    }

}

class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa(){
        this.nome = "joao";
        this.idade = 30;
    }

    @Override
    public String toString() {
        return "Pessoa nome: " + nome + "e idade: "+ idade;
    }
}
