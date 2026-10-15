package ListEx2;

import java.util.List;

public class Personagem {

    String nome = "";
    int vida = 0;
    List<Tipo> tipo;
    List<Poder> poder;

    public Personagem(String nome, int vida, String tipo, String poder){
        this.nome = nome;
        this.vida = vida;
        Tipo tipo1 = new Tipo(tipo);
        this.tipo.add(tipo1);
        Poder poder1 = new Poder(poder);
        this.poder.add(poder1);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public int getVida(){
        return this.vida;
    }

    public static void main(String[] args) {
        Personagem person_1 = new Personagem("Omen", 100, "Controlador", "Paranóia");
        Personagem person_2 = new Personagem("Chamber", 100, "Sentinela", "Teleport");

        System.out.println("O nome do primeiro personagem é " + person_1.getNome() + ", ele tem " + person_1.getVida() + " de vida.");
    }
}