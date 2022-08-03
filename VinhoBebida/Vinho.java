package VinhoBebida;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// Atributos
//Nome, tipo de uva, data de fabricacao, valor
public class Vinho {
  private String nome, tipoUva;
  private Date DataFab;
  private double valor;

  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  public Vinho(String nome, String tipoUva, String DataFab, double valor) throws ParseException {
    this.nome = nome;
    this.tipoUva = tipoUva;
    this.DataFab = sdf.parse(DataFab);
    this.valor = valor;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTipoUva() {
    return tipoUva;
  }

  public void setTipoUva(String tipoUva) {
    this.tipoUva = tipoUva;
  }

  public String getDataFab() {
    return sdf.format(DataFab);
  }

  public void setDataFab(String DataFab) throws ParseException {
    this.DataFab = sdf.parse(DataFab);
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

}