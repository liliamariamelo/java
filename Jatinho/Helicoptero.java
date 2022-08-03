package Jatinho;

public class Helicoptero{
    //Atributos
    private int altitude, capacidade, qtdPessoas;
    private boolean ligado;

    //Construtor 
    public Helicoptero (int altitude, int capacidade, int qtdPessoas, boolean ligado) {
        this.altitude = 0;
        this.capacidade = capacidade;
        this.qtdPessoas = qtdPessoas;
        this.ligado = false;
     //OBS: sempre começam desligado ver isso e altitude 0.
    }
    //Métodos
    public int getAltitude() {
        return altitude;
    }
    public void setAltitude(int altitude) {
        this.altitude = altitude ;
    }

    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }
    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

   
   //Entrar no helicóptero
  public void Entra(){
    if(qtdPessoas < capacidade){
      qtdPessoas ++; 
      System.out.println("Entrou uma pessoa");       
    }else if(qtdPessoas == capacidade) {
      System.out.println("Espere o próximo helicóptero!");
    }
  }
  
  //Sair no helicóptero
  public void Sair(){
    if(qtdPessoas > 0){
      qtdPessoas --;
      System.out.println("Saiu uma pessoa");  
    }
  }
  //Dcolar o helicóptero de milhões
  public void Decolar(int alturaIdeal){
    if(altitude == 0 && alturaIdeal >= 1){
      altitude = alturaIdeal;
      System.out.println("O helicóptero acabou decolar");
    }
  }
  //Aterrissar
  public void Aterrissar(){
    if(altitude > 0 && ligado==true){
      setAltitude(0);
      System.out.println("Aterrissou");
    } 
  }
  //Ligar 
  public void LigarAeronave(){
    if(ligado == false){
        this.setLigado(true);
      }
    }
  //Desligar
  public void DesligarAeronave(){
    if(ligado == true){
      this.setLigado(false);
    }
  }

  public String toString(){
    return " Altitude " + altitude + " Capacidade " + capacidade + " QtdPessoas " + qtdPessoas + " Ligado " + ligado;
}

}




