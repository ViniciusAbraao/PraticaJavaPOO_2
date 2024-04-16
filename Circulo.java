package exercicios;

public class Circulo {

    double raio;

    public void calcularArea() {
        double calculo = (3.14 * (raio * raio));
        System.out.println("Area: " + calculo);
    }

    public void calcularPerimetro() {
        double calculo = (2 * 3.14 * raio);
        System.out.println("Perimetro: " + calculo);
    }

    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        c1.raio = 2;
        c1.calcularArea();
        c1.calcularPerimetro();
    }
}
