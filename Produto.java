package exercicios;

public class Produto {

    String nome;
    double preco;

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
    }

    public static void main(String[] args) {
        Produto bolacha = new Produto();
        bolacha.nome = "Danix";
        bolacha.preco = 3.50;
        bolacha.exibirDetalhes();

    }
}
