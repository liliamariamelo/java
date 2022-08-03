package Geometria;

import java.util.Scanner;

public class Quadrado {
  private int lado;

  public Quadrado(int lado) {
    this.lado = lado;
  }

  public int getLado() {
    return lado;
  }

  public void setLado(int lado) {
    this.lado = lado;
  }

  public int calcularArea(int lado) {
    int calculo = lado * lado;
    return calculo;
  }

  public int calcularPerimetro(int lado) {
    int resultado = lado + lado;
    return resultado;
  }

  public String toString() {
    return "O quadrado tem " + calcularArea(lado) + " de area e " + calcularPerimetro(lado) + " de perimetro!";
  }

  public static void main(String[] args) {
    System.out.printf("Digite o lado: ");
    Scanner teclado = new Scanner(System.in);
    int numero = teclado.nextInt();
    Quadrado quadrado = new Quadrado(numero);
    System.out.println(quadrado.toString());
    ;
  }
}
