package Jogo_Wyvern01;

import java.util.Random;

public class Personagem {
    private String nome = "";
    private String sobrenome = "";
    private int pontosVida = 0;
    private int pontosAtaque = 0;
    //--

    public Personagem(String nome, String sobrenome, int pontosVida, int pontosAtaque) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.pontosVida = pontosVida;
        this.pontosAtaque = pontosAtaque;
    }
    //--

    public int atacar() {
        Random random = new Random();
        return random.nextInt(5) + this.pontosAtaque;
    }
    //--

    public void receberDano(int dano) {
        this.pontosVida -= dano;
        if (this.pontosVida < 0) {
            this.pontosVida = 0;
        }
        System.out.println(this.nome + " recebeu " + dano + " de dano! Vida restante: " + this.pontosVida);
    }
    //--

    public boolean estaVivo(){
        return this.pontosVida > 0;
    }
    //--

    public String getNome (){
        return nome;
    }
    //--

    public int getPontosVida (){
        return pontosVida;
    }
    //--

    public String getSobrenome(){
        return sobrenome;
    }

}
