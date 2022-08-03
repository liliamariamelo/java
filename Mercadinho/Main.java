package Mercadinho;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {

        Proprietario dono = new Proprietario("Maria", "Feminino", "20/10/1977");
        // System.out.println(dono.toString());

        Limpeza cleaning = new Limpeza(1, "detergente", "01/01/2021", "12/02/2020", 10, "Não é nocivo!");
        // System.out.println(cleaning);

        Alimentos alimentos = new Alimentos(2, "arroz", "01/01/2022", "01/02/2020", 5, "artificial");
        // System.out.println(alimentos);

        Bebidas drink = new Bebidas(3, "Suco", "20/01/2022", "20/02/2022", 10, "Não alcoólico!");
        // System.out.println(drink);

        Mercadinho mercado = new Mercadinho("São Manoel", dono);
        // mercado.Cadastrar(alimentos);
        mercado.Cadastrar(cleaning);
        mercado.Cadastrar(drink);

        // mercado.Cadastrar(alimentos);
        // mercado.Consultar("Suco");
        // mercado.Consultar("vodka");
        // mercado.Alterar("Suco");
        // mercado.Remover("Suco");
        // mercado.ValorTotal();
        // mercado.Antigo();
        mercado.ProdutoVencido();

    }

}
