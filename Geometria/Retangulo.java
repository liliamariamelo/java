package Geometria;

import java.util.Scanner;

public class Retangulo {
  private int comprimento, largura;

  public Retangulo(int comprimento, int largura) {
    this.comprimento = comprimento;
    this.largura = largura;
  }

  public int getComprimento() {
    return comprimento;
  }

  public void setComprimento(int comprimento) {
    this.comprimento = comprimento;
  }

  public int getLargura() {
    return largura;
  }

  public void setLargura(int largura) {
    this.largura = largura;
  }

  public int calcularArea(int comprimento, int largura) {
    int calculo = largura * comprimento;
    return calculo;
  }

  public int calcularPerimetro(int comprimento, int largura) {
    int perimetro = ((2 * comprimento) + (2 * largura));
    return perimetro;
  }

  public String toString() {
    return "O retângulo tem " + calcularArea(comprimento, largura) + " de área e " +
        calcularPerimetro(comprimento, largura) +
        " de perímetro!";
  }

  // classe main
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.printf("Digite o comprimento: ");
    int a = teclado.nextInt();
    System.out.printf("Digite a largura: ");
    int b = teclado.nextInt();
    Retangulo retangulo = new Retangulo(a, b);
    System.out.println(retangulo.toString());

  }

}
