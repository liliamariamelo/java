package Pessoa;

public class pessoa {
    private String nome;
    private int idade;

    public pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {
        pessoa p = new pessoa("josé", 20);
        String nome = p.getNome();
        int idade = p.getIdade();
        // System.out.println(nome+ " " + idade);
        System.out.printf(nome, idade);
    }
}
