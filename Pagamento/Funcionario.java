package Pagamento;

public class Funcionario {
  private int codigo;
  private String nome, cpf, endereco, telefone;
  private int idade;
  private double salario;

  public Funcionario(int codigo, String nome, String cpf, String endereco,
      String telefone, int idade, double salario) {
    this.codigo = codigo;
    this.nome = nome;
    this.cpf = cpf;
    this.endereco = endereco;
    this.telefone = telefone;
    this.idade = idade;
    this.salario = salario;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public double getCalculaSalarioLiquido() {
    return (salario - (salario * 0.11));
  }

  public String toString() {
    return "O nome do funcionário: " + nome +
        "\nEndereço: " + endereco +
        "\nCPF: " + cpf +
        "\nTelefone: " + telefone +
        "\nIdade: " + idade +
        "\nSalário Bruto: " + salario +
        "\nSalário Líquido com o desconto do INSS(11%): " + getCalculaSalarioLiquido();

  }
}
