package Vetores;
// Questão 04

// O vetor B recebe o resultado da raiz quadrada do elementos de A 

public class Questao04 {
  public static void main(String[] args) {
    int A[] = new int[15];
    int B[] = new int[15];

    System.out.print("VETOR A: ");
    for (int i = 0; i < A.length; i++) {
      // A cada posição é adicionado + 1
      A[i] = i + 1;
      System.out.print(A[i] + " ");
    }

    System.out.print("\nVETOR B: ");
    for (int i = 0; i < B.length; i++) {
      int raiz = 0;
      raiz = (int) Math.sqrt(A[i]);
      B[i] = raiz;
      System.out.print(B[i] + " ");
    }
  }

}
