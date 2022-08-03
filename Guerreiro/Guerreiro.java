package Guerreiro;

import java.util.Random;

public class Guerreiro {
    //Atributos
    private String codigo, nome;
    private int energia;
   
    //Construtor 
    public Guerreiro(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.energia = 5;
    }

    //Métodos
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia){
        this.energia = energia;
    }

    //Ganhar energia
    public void Incremento(){
        if(energia < 5) {
            setEnergia(++energia);
            System.out.println("O Guerreiro " + nome + " ganhou mais 1 ponto");  
        }
    }
    //Perde Energia
    public void Decremento(){
        if(energia > 0) {
            setEnergia(--energia);
            System.out.println("O Guerreiro " + nome + " perdeu menos 1 ponto");
        }else {
            System.out.println("O Guerreiro " + nome + " está sem Energia !");
        }
    }

    //Almentar-se ganha 1 ponto usando incremento
    public void Alimentar_se(){
        Incremento();
        System.out.println("UHHH QUE DELÍCIA, MAIS UM PONTO! O jogador "+ nome);
    }


    //Atacar so pode ser chamado no metodo lutar e tem que retornar um numero aleatorio 1 ou 0
    public int Atacar() {
        Random dano = new Random();
        
        return dano.nextInt(2);
    }

    //Lutar recebe guerreiro oponente e ataca ele e deve chamar atacar e exibir vencedor.
    public void Lutar(Guerreiro jogador){

        while ((energia > 0) && (jogador.energia > 0)){
            int dano1 = this.Atacar();
            int dano2 = jogador.Atacar();
            if (dano1>dano2) {
                jogador.Decremento();
            }
            else{
                this.Decremento();
            }
            
            if (energia == 0) {
                System.out.println("O ganhador(a) é: "+ jogador.getNome());
                break;      
            } else {
                System.out.println("Ainda está no jogo !");
            }
       }
    }

    //Lutar Recursividade
    public Object LutarRecursivo(Guerreiro jogador) {
        if (energia == 0) {
            System.out.println("O ganhador é "+ jogador.getNome());
            return null; 
        }
        if (jogador.energia == 0) {
            System.out.println("O ganhador é " + nome);
            return null;
        }
        int dano1 = Atacar();
        if (dano1 == 1) {
            jogador.Decremento();
        }
        jogador.Atacar();
        if (jogador.Atacar() == 1) {
            Decremento();
            
        }
        
        return LutarRecursivo(jogador);

    }

    public String toString() {
        return "Nome: " + nome + "\nCodigo: " + codigo + "\nEnergia: " + getEnergia();
    }

    public static void main(String[] args) {
        Guerreiro lilia = new Guerreiro("123", "lilia");
        Guerreiro lais = new Guerreiro("123", "lais");
        lais.LutarRecursivo(lilia);
        lais.Alimentar_se();
        lais.Lutar(lilia);
        lais.toString();
        System.out.println(lilia);
        System.out.println(lais);
    } 
}