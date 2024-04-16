package exercicios;

public class ContaBancaria {

    String titular;
    double saldo;

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Proibido valores negativos ou nulos");
        } else {
            saldo = saldo + valor;
        }
    }

    public void sacar(double valor) {
        if (saldo <= 0) {
            System.out.println("Saldo Indisponivel");
        } else {
            saldo = saldo - valor;
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo Atual: " + saldo);
    }

    public void exibirInfo() {
        System.out.println("Titular da conta: " + titular);
        System.out.println("Saldo: " + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        c1.titular = "Vinicius";
        c1.saldo = 500;
        c1.depositar(200);
        c1.consultarSaldo();
        c1.sacar(50);
        c1.consultarSaldo();
        c1.depositar(300);
        c1.exibirInfo();
    }

}
