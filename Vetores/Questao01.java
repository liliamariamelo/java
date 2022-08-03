package Vetores;

import java.util.Scanner;
// Questão 01
// O vetor B recebe os mesmos elementos de A

public class Questao01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int A[] = new int[5];
    int B[] = new int[5];

    // Entrada de dados
    for (int i = 0; i < A.length; i++) {
      System.out.printf("Digite um número: ");
      A[i] = input.nextInt();
    }
    // Saída
    System.out.println("Vetor A:");
    for (int i = 0; i < A.length; i++) {
      B[i] = A[i];
      System.out.printf(A[i] + " ");
    }
    System.out.println("\nVetor B:");
    for (int i = 0; i < B.length; i++) {
      System.out.print(B[i] + " ");
    }
  }
}
