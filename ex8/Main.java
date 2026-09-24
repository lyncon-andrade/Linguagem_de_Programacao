package ex8;

public class Main {
    public static void main(String[] args) {
        Personagem persona = new Personagem();
        persona.nome = "Pateta";
        persona.idade = 42;
        persona.poder = 5;
        System.out.println(persona.nome);
        System.out.println(persona.idade);
        System.out.println(persona.poder);
        persona.pular();
        persona.correr();
    }
}
