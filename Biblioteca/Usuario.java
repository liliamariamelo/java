package Biblioteca;

public class Usuario {
    private String nome;
    private int cpf;
    private String telefone;
    private String matricula;

    //Construtor
    public Usuario (String nome, int cpf, String telefone, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.matricula = matricula;

    }

    //Métodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
}
