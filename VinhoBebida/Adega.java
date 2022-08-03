package VinhoBebida;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

//20 linhas;  10 colunas

public class Adega {
    private Vinho[][] colmeia;
    private int qtlinha, qtcoluna, contador;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Adega(){
        this.colmeia = new Vinho[20][10];
        this.qtlinha = 0;
        this.qtcoluna = 0;
        this.contador = 0;
    }

    public void Incluir(Vinho vinho){
        //for(int linha=0; linha<colmeia.length; linha++){
          //  for(int coluna=0; coluna<colmeia[linha].length; coluna++){
                if(qtcoluna == 9){
                    qtlinha++;
                    qtcoluna = 0;   
                }
                if(qtlinha==19 && qtcoluna==9){
                    System.out.println("cheioo!");
                }
                this.colmeia[qtlinha][qtcoluna++] = vinho;
                //System.out.println("Cadastrado!"); 
                contador++;                
          //  }
        //}    
    }
    
        
    

    public void TipoVinho(String nome){
        int qtVinhoBranco = 0;
        int qtVinhoTinto = 0;
        for(int linha=0; linha<colmeia.length; linha++){
            for(int coluna=0; coluna<colmeia[linha].length; coluna++){
                if(colmeia[linha][coluna] != null){
                    if(nome.equalsIgnoreCase("Vinho Branco")){
                        if(colmeia[linha][coluna] instanceof VinhoBranco){
                            System.out.println(colmeia[linha][coluna]);
                            qtVinhoBranco++;
                        }                   
                    }else if(nome.equalsIgnoreCase("Vinho Tinto")){
                        if(colmeia[coluna][linha] instanceof VinhoTinto){
                            System.out.println(colmeia[linha][coluna]);
                            qtVinhoTinto++;
                        }
                    }              
                }
            }
        }
        System.out.println("Vinho Branco: " +  qtVinhoBranco);
        System.out.println("Vinho Tinto: " + qtVinhoTinto);



    }

    public void Quantidade(){
        System.out.printf("A quantidade é %d \n", contador);  
    }

    public void ValorTotal(){
       double cont = 0;
       for(int linha=0; linha<colmeia.length; linha++){
            for(int coluna=0; coluna<colmeia[linha].length; coluna++){
                if(colmeia[linha][coluna] != null){
                    cont = colmeia[linha][coluna].getValor() + cont ;
                    System.out.printf("O valor total é ");
                    System.out.println(cont);
                
                }
            }
        }
    }

    public void Antigo() throws ParseException{
        Vinho menor = colmeia[0][0];
        for(int linha=0; linha<colmeia.length; linha++){
            for(int coluna=0; coluna<colmeia[linha].length; coluna++){
                if(colmeia[linha][coluna] != null){
                    Vinho dataMomento = colmeia[linha][coluna];
                    if(sdf.parse(dataMomento.getDataFab()).before(sdf.parse(menor.getDataFab()))){
                       menor = dataMomento;
                    }
                }
            }
        }
        System.out.println(menor);   

    }

    //LOcalização por linha e coluna
    public void Localizacao(int linha, int coluna){
       System.out.println (colmeia[linha][coluna]);
       

    }

    public void LocalizeNome(String nome){
        for(int linha=0; linha<colmeia.length; linha++){
            for(int coluna=0; coluna<colmeia[linha].length; coluna++){
                if(colmeia[linha][coluna] != null){
                    if(nome.equalsIgnoreCase(colmeia[linha][coluna].getNome())){
                            System.out.println(colmeia[linha][coluna]); 
                            System.out.println("Está na linha: " + linha + "\n Coluna: "+ coluna);               
                    }
                
                }              
            }
        }

    }
}
