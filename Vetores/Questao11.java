package Vetores;
//Questão 11

//Vetor A com 10 elementos e imprimir os elementos pares

public class Questao11 {
  public static void main(String[] args) {
    int A[] = new int[10];

    System.out.print("Vetor A: ");
    for (int i = 0; i < A.length; i++) {
      A[i] = i + 1;
      System.out.print(A[i] + " ");
    }

    System.out.print("\nElementos pares: ");
    for (int i = 0; i < A.length; i++) {
      if (A[i] % 2 == 0) {
        System.out.printf(A[i] + " ");
      }
    }

    System.out.print("\nElementos impares: ");
    for (int i = 0; i < A.length; i++) {
      if (A[i] % 2 == 1) {
        System.out.printf(A[i] + " ");
      }
    }
  }
}
