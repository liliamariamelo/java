package VinhoBebida;

import java.text.ParseException;

//Tipo(Frisante ou normal)
public class VinhoBranco extends Vinho {
  private String tipo;

  public VinhoBranco(String nome, String tipoUva, String DataFab, double valor, String tipo) throws ParseException {
    super(nome, tipoUva, DataFab, valor);
    this.tipo = tipo;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  public String toString(){
    return "Nome: " + getNome() +"\nTipo Uva: " + getTipoUva() + "\nData de Fabricação: " + getDataFab() + "\nValor: " + getValor() +
    "\nTipo: " + getTipo();
  }
}