package Carro;

import java.util.Scanner;

//classe principal
public class main {
  public static void main(String[] args) {
    System.out.print("Digite a velocidade: ");
    try (Scanner rapido = new Scanner(System.in)) {
      int velo = rapido.nextInt();
      carro car = new carro("Palio", 1000);
      car.acelerar(velo);
      car.frear();
    }
  }
}