package Fita;

public class Fitas {
  private String titulo;
  private int valor;

  public Fitas(String titulo, int valor) {
    this.titulo = titulo;
    this.valor = valor;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getValor() {
    return valor;
  }

  public void setValor(int valor) {
    this.valor = valor;
  }

  public int ValorAluguel(int dias) {
    return valor * dias;
  }

  public String toString() {
    return "O título da fita é " + titulo +
        ",\no preço do dia é " + valor +
        ",\n e o valor do aluguel é " + ValorAluguel(3);

  }
}
