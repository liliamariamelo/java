package Vetores;

import java.util.Scanner;

//Questão 12 
//Vetor A com 10 elementos e imprimir a soma de todos2

public class Questao12 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int A[] = new int[10];

    for (int i = 0; i < A.length; i++) {
      System.out.printf("Digite um número: ");
      A[i] = input.nextInt();
    }

    // Saída de Dados
    System.out.printf("Vetor A: ");
    for (int i = 0; i < A.length; i++) {
      // A[i] = i + 1;
      System.out.print(A[i] + " ");
    }

    System.out.printf("\nSoma:" + " ");
    int soma = 0;
    for (int i = 0; i < A.length; i++) {
      soma = soma + A[i];
    }
    System.out.print(soma);
  }

}
