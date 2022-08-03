package Vetores;
//Questão 06

// Lista de vetores A e B
// A lista de C será a soma dos elementos A e B

public class Questao06 {
  public static void main(String[] args) {
    int A[] = new int[10];
    int B[] = new int[10];
    int C[] = new int[10];

    System.out.print("VETOR A: ");
    for (int i = 0; i < A.length; i++) {
      // A cada posição é adicionado + 1
      A[i] = i + 1;
      System.out.print(A[i] + " ");
    }

    System.out.print("\nVETOR B: ");
    for (int i = 0; i < B.length; i++) {
      // A cada posição é adicionado + 1
      B[i] = i + 1;
      System.out.print(B[i] + " ");
    }

    System.out.print("\nVETOR C: ");
    for (int i = 0; i < C.length; i++) {
      C[i] = A[i] + B[i];
      System.out.print(C[i] + " ");
    }
  }
}
