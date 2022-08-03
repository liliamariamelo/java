package Mercadinho;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Mercadinho {
    private int quantidade;
    private String nome;
    private Proprietario dono;
    private Produto[] estoque;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Mercadinho(String nome, Proprietario dono) {
        this.quantidade = 0;
        this.nome = nome;
        this.dono = dono;
        this.estoque = new Produto[1000];

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Proprietario getDono() {
        return dono;
    }

    public void setDono(Proprietario dono) {
        this.dono = dono;
    }

    // cadastro(incluir, consultar, alterar, remover)
    public void Cadastrar(Produto nome) {
        if (quantidade < 1000) {
            estoque[quantidade++] = nome;
        } else {
            System.out.println("Não pode cadastrar!!!!");
        }
    }

    public void Consultar(String nome) {
        for (int i = 0; i < estoque.length; i++) {
            if (estoque[i] != null) {
                if (estoque[i].getDescricao() == nome) {
                    System.out.println("tudo ok!");
                } else {
                    System.out.println("Deu errado!");
                }
            }
        }
    }

    public void Alterar(String nome) throws ParseException {
        for (int i = 0; i < estoque.length; i++) {
            if (estoque[i] != null) {
                if (estoque[i].getDescricao().equals(nome)) {
                    Scanner input = new Scanner(System.in);
                    System.out.println("O que o usuário quer alterar? ");
                    System.out.print(
                            "Digite 1 para alterar código  \n Digite 2 para alterar data de fabricação \n Digite 3 para alterar data de validade  \n Digite 4 para alterar valor ");
                    int escolha = input.nextInt();
                    if (escolha == 1) {
                        System.out.print("Qual é o novo código?");
                        int codNovo = input.nextInt();
                        estoque[i].setCodigo(codNovo);
                    }
                    if (escolha == 2) {
                        System.out.print("Qual é o nova data de fabricação?");
                        String dataNova = input.next();
                        estoque[i].setDatadeFabric(dataNova);
                    }
                    if (escolha == 3) {
                        System.out.print("Qual é o nova data de validade?");
                        String dataNova2 = input.next();
                        estoque[i].setDatadeValid(dataNova2);
                    }
                    if (escolha == 4) {
                        System.out.print("Qual é o novo valor?");
                        int valorNovo = input.nextInt();
                        estoque[i].setValor(valorNovo);
                    }
                }
            }
        }
    }

    public void Remover(String nome) {
        for (int i = 0; i < quantidade; i++) {
            if (estoque[i].getDescricao().equals(nome)) {
                estoque[i] = null;
                quantidade--;
                System.out.println("Removido!");
            }
        }
    }

    public void ValorTotal() {
        double cont = 0;
        for (int i = 0; i < estoque.length; i++) {
            if (estoque[i] != null) {
                cont = estoque[i].getValor() + cont;
                System.out.println(cont);
            }
        }
    }

    public void Antigo() throws ParseException {
        Produto dataAntiga = estoque[0];
        for (int i = 0; i < estoque.length; i++) {
            if (estoque[i] != null) {
                Produto dataMomento = estoque[i];
                if (sdf.parse(dataMomento.getDatadeFabric()).before(sdf.parse(dataAntiga.getDatadeFabric()))) {
                    dataAntiga = dataMomento;
                }
            }
        }
        System.out.print(dataAntiga);
    }

    public void ProdutoVencido() throws ParseException {
        Produto dataMaior = estoque[0];
        for (int i = 0; i < estoque.length; i++) {
            if (estoque[i] != null) {
                Produto dataMomento = estoque[i];
                if (sdf.parse(dataMaior.getDatadeValid()).before(sdf.parse(dataMomento.getDatadeValid()))) {
                    dataMomento = dataMaior;
                }
            }

        }
        System.out.println(dataMaior);

    }
}