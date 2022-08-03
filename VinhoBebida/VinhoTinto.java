package VinhoBebida;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//Ano
public class VinhoTinto extends Vinho {
  private Date ano;

  SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
  public VinhoTinto(String nome, String tipoUva, String DataFab, double valor, String ano) throws ParseException {
    super(nome, tipoUva, DataFab, valor);
    this.ano = sdf.parse(ano);
  }

  public String getAno() {
    return sdf.format(ano);
  }

  public void setAno(String ano) throws ParseException {
    this.ano = sdf.parse(ano);
  }

  public String toString(){
    return "Nome: " + getNome() +"\nTipo Uva: " + getTipoUva() + "\nData de Fabricação: " + getDataFab() + "\nValor: " + getValor() +
    "\nAno: " + getAno();
  }

}
