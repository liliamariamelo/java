package Vetores;
// Questão 04

// O vetor B recebe o resultado da raiz quadrada do elementos de A 
// o vetor B será double

public class Questao04_02 {
  public static void main(String[] args) {
    int A[] = new int[15];
    double B[] = new double[15];

    System.out.print("VETOR A: ");
    for (int i = 0; i < A.length; i++) {
      // A cada posição é adicionado + 1
      A[i] = i + 1;
      System.out.print(A[i] + " ");
    }

    System.out.print("\nVETOR B: ");
    for (int i = 0; i < B.length; i++) {
      // int raiz = 0;
      double raiz = Math.sqrt(A[i]);
      B[i] = raiz;

      System.out.printf("%.2f ", B[i]);
    }
  }
}
