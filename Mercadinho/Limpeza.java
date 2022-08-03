package Mercadinho;
import java.text.ParseException;


public class Limpeza extends Produto {
    private String classificacao;

    public Limpeza(int codigo, String descricao, String DatadeFabric, String DatadeValid, double valor, String classificacao) throws ParseException{
        super(codigo, descricao, DatadeFabric, DatadeValid, valor);
        this.classificacao = classificacao;
    }
    //  Nocivo ou não
    public String getClassificacao(){
        return classificacao;
    }
    public void setClassificacao(String classificacao){
        this.classificacao = classificacao;
    }

    public String toString(){
        return "Código: " + getCodigo() + "\nDescrição: " + getDescricao() + "\nData de Fabricação: "+ getDatadeFabric() + "\nData de Validade: " + getDatadeValid() + 
        "\nValor: " + getValor() + "\nClassificação: " + getClassificacao();
       }

    
}
