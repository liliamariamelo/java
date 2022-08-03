package Geometria;

public class Circulo {
  private double raio;
  private final double pi = 3.14159;

  public Circulo(double raio) {
    this.raio = raio;
  }

  public double getRaio() {
    return raio;
  }

  public void setRaio(double raio) {
    this.raio = raio;
  }

  public double calcularArea() {
    return (pi * raio * raio);
  }

  public double calcularPerimetro() {
    return (2 * pi * raio);
  }

  /*
   * public String toString() {
   * return "A área é " + calcularArea() + "\n e o perímetro é " +
   * calcularPerimetro();
   */

  public static void main(String[] args) {
    Circulo circulo = new Circulo(3.0);
    System.out.printf("A área é %.2f\n", circulo.calcularArea());
    System.out.printf("A perímetro é %.2f\n", circulo.calcularPerimetro());
    // *System.out.printf("%s", circulo.toString());

  }

}
