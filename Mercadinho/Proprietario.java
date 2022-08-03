package Mercadinho;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Proprietario{
    private String nome, sexo;
    private Date dataNasc;

    //Transformar data em string
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Proprietario(String nome, String sexo, String dataNasc) throws ParseException{
        this.nome = nome;
        this.sexo = sexo;
        //Transformar string em data
        this.dataNasc = sdf.parse(dataNasc);
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String setSexo(){
        return sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public String getDataNasc(){
        return sdf.format(dataNasc);
    }
    public void setDataNasc(String dataNasc) throws ParseException{
        this.dataNasc = sdf.parse(dataNasc);
    }
    public String toString(){
        return "O nome do proprietário:  " + nome + "\nsexo: " + sexo + "\nData de nascimento: " + sdf.format(dataNasc);
    }
}
