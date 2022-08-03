package VinhoBebida;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException{
        VinhoBranco white = new VinhoBranco("Perini", "preta", "20/01/2000", 50.0, "branco");
        VinhoBranco red = new VinhoBranco("Perini2", "preta", "20/01/1977", 50.0, "branco");
        VinhoTinto tinto = new VinhoTinto("Pergola","branco", "20/02/2010", 25.0, "1980");
        Adega adega = new Adega();

        adega.Incluir(white);
        adega.Incluir(red);
       // adega.TipoVinho("Vinho Branco");
        //adega.Quantidade();
        //adega.ValorTotal();
        //adega.Antigo();
        adega.Localizacao(0,1);
        //adega.LocalizeNome("Perini2");
    }
    
}
