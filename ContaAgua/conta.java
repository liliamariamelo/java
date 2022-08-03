package ContaAgua;

public class conta {
    private double consumo, valor;
    private String cliente;

    public conta(double consumo, double valor, String cliente) {
        this.consumo = consumo;
        this.valor = valor;
        this.cliente = cliente;

    }

    // Métodos
    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    // calculo
    public double Calculo() {
        double calculo = getValor() * getConsumo();
        return calculo;
    }

}