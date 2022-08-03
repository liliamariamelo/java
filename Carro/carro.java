package Carro;

public class carro {
    // Atributos
    private String marca;
    private int valor;
    private int velocidade;
    private int marcha;

    // Construtor
    public carro(String marca, int valor) {
        this.marca = marca;
        this.valor = valor;
        this.velocidade = 0;
        this.marcha = 0;

    }

    // Métodos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public void acelerar(int acelerar) {
        System.out.println("\n Velocidade aumentando: ");
        while (velocidade < acelerar) {
            velocidade++;
            System.out.println("VRUUUUM " + this.getVelocidade() + "Km!");
        }
        trocarMarcha();
    }

    public void frear() {
        System.out.println("\n Velocidade diminuindo: ");
        while (velocidade > 0) {
            velocidade--;
            System.out.println("PLIMPLIM " + this.getVelocidade() + "Km!");
        }
    }

    public void trocarMarcha() {
        if (velocidade == 0) {
            System.out.println("\n A marcha é neutra ");
        } else if (velocidade >= 10 && velocidade < 20) {
            setMarcha(2);
            System.out.println(" \n A marcha será " + 2);
        } else if (velocidade >= 20 && velocidade < 40) {
            setMarcha(3);
            System.out.println(" \n A marcha será " + 3);
        } else if (velocidade >= 40 && velocidade < 70) {
            setMarcha(4);
            System.out.println(" \n A marcha será " + 4);
        } else {
            setMarcha(5);
            System.out.println(" \n A marcha será " + 5);
        }
    }

}
