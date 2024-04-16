package exercicios;

public class Pessoa {

    String nome;
    int idade;
    String sexo;

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Vinicius";
        p1.idade = 20;
        p1.sexo = "Masculino";
        p1.exibirInfo();
    }
}
