package exercicio05;

import java.util.ArrayList;

public class AgendaDeContatos {

    String nomeAgenda;
    ArrayList<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.nome.equals(nome)) {
                contatos.remove(contato);
                break; 
            }
        }
    }

    public String buscarContatos(String nome) {
        if (contatos.contains(nome)) {
            return nome;
        } else {
            return null;
        }
    }

    public void exibirContatos() {
        for (Contato contato : contatos) {
            System.out.println(contato.nome + " - " + contato.telefone + " - " + contato.email);
        }
    }
    public static void main(String[] args) {
        AgendaDeContatos a1 = new AgendaDeContatos();
        Contato c1 = new Contato();
        Contato c2 = new Contato();
        Contato c3 = new Contato();
        a1.nomeAgenda = "Agenda do Vinicius";
        //
        c1.nome = "Vincius";
        c1.telefone = "40028922";
        c1.email = "vini@bol.com";
        //
        c2.nome = "Joao";
        c2.telefone = "45558222";
        c2.email = "joao@uol.com";
        //
        c3.nome = "Joana";
        c3.telefone = "10012002";
        c3.email = "joana@skype.com";
        //
        a1.adicionarContato(c1);
        a1.adicionarContato(c2);
        a1.adicionarContato(c3);
        a1.removerContato("Joana");
        a1.buscarContatos("Vinicius");
        a1.exibirContatos();
    }
}
