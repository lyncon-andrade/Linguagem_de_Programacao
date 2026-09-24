package Jogo_Wyvern01;

public class Monstro extends Personagem{
    private String tipo;

    public Monstro (String nome, String sobrenome, int pontosVida, int pontosAtaque, String tipo) {
        super(nome, sobrenome, pontosVida, pontosAtaque);
        this.tipo = tipo;
    }
   
    //--

    public String getTipo(){
        return tipo;
    }

}
