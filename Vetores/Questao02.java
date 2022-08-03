package Vetores;

import java.util.Scanner;
//Questao 02
// O vetor B serão os elementos de A[i]*2

public class Questao02 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int A[] = new int[8];
    int B[] = new int[8];

    // Entrada de Dados
    for (int i = 0; i < A.length; i++) {
      System.out.printf("Digite um número: ");
      A[i] = input.nextInt();
    }

    // Saída de dados
    System.out.print("Vetor A: ");
    for (int i = 0; i < A.length; i++) {
      B[i] = A[i];
      System.out.print(A[i] + " ");
    }

    System.out.print("\nVetor B: ");
    for (int i = 0; i < B.length; i++) {
      B[i] = A[i] * 2;
      System.out.print(B[i] + " ");
    }
  }

}
