package Vetores;

// Questão 03
// O vetor B recebe os mesmos elementos de A vezes ele mesmo

public class Questao03 {
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
      B[i] = A[i] * A[i];
      System.out.print(B[i] + " ");
    }
  }
}
