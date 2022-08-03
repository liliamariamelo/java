package Biblioteca;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        Usuario user = new Usuario("Lais", 22, "0000000", "11111011");
        Livro book = new Livro("omg","Irineu", new Date(), 0, "Saraiva", "001");
        Exemplar exe = new Exemplar(01, true, false, book);
        Emprestimo loan = new Emprestimo(new Date(), new Date(), new Date(), 5, user, exe);
        

    }

}