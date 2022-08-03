package ContaAgua;

import java.util.Scanner;
public class main {
    public static void main(String[] args){
        //cliente
        System.out.print("Digite seu nome: ");
        Scanner input = new Scanner(System.in);
        String cnome = input.nextLine();

        //valor
        System.out.print("Digite o valor de 1m³: ");
        //Scanner val = new Scanner(System.in);
        double preco = Double.parseDouble(input.nextLine());

        //consumo
        System.out.print("Digite o consumo: ");
        //Scanner cons = new Scanner(System.in);
        double consu = Double.parseDouble(input.nextLine());

        //Receber dados
        conta agua = new conta(consu, preco, cnome);
          
        //Calculo
        System.out.printf("O cliente: "+ cnome +", irá pagar no final do mês: R$ %.2f", agua.Calculo());
        


    }

}