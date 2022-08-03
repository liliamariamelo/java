package Vetores;
//Questão 10

// Lista de vetores A e B
// A lista de B será o resto da divisão dos elementos A dividido por 2

public class Questao10 {
  public static void main(String[] args) {
    int A[] = new int[10];
    int B[] = new int[10];

    System.out.print("VETOR A: ");
    for (int i = 0; i < A.length; i++) {
      A[i] = i + 1;
      System.out.print(A[i] + " ");
    }

    System.out.print("\nVETOR B: ");
    for (int i = 0; i < B.length; i++) {
      // Resto da divisão
      B[i] = A[i] % 2;
      System.out.print(B[i] + " ");
    }
  }

}
