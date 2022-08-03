package Jatinho;

public class Main{
    public static void main(String[] args){
      Helicoptero aeronave = new Helicoptero(100, 10, 9, true);
      System.out.println(aeronave.toString());
      aeronave.Entra();
      aeronave.LigarAeronave();
      aeronave.Decolar(10);
      System.out.println(aeronave.toString());
      aeronave.Aterrissar();
      aeronave.DesligarAeronave();
      aeronave.Sair();
      System.out.println(aeronave.toString());
    }

}

