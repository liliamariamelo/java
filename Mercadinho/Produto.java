package Mercadinho;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public abstract class Produto {
    private int codigo;
    private String descricao;
    private Date DatadeFabric, DatadeValid;
    private double valor;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Produto(int codigo, String descricao, String DatadeFabric, String DatadeValid, double valor)
            throws ParseException {
        this.codigo = codigo;
        this.descricao = descricao;
        this.DatadeFabric = sdf.parse(DatadeFabric);
        this.DatadeValid = sdf.parse(DatadeValid);
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDatadeFabric() {
        return sdf.format(DatadeFabric);
    }

    public void setDatadeFabric(String DatadeFabric) throws ParseException {
        this.DatadeFabric = sdf.parse(DatadeFabric);
    }

    public String getDatadeValid() {
        return sdf.format(DatadeValid);
    }

    public void setDatadeValid(String DatadeValid) throws ParseException {
        this.DatadeValid = sdf.parse(DatadeValid);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
