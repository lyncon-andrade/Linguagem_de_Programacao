package Jogo_Wyvern01;

import  java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== BEM VINDO AO DRAGAO vs HYDRA ===");
        System.out.println("\nDigite o nome do seu dragão: ");
        String nomeDragao = scanner.nextLine();
        System.out.println("\nDigite o sobrenome do seu dragão: ");
        String sobrenomeDragao = scanner.nextLine();
        //---

        Personagem dragao = new Personagem(nomeDragao, sobrenomeDragao, 50, 15);
        Monstro hydra = new Monstro("Hydra", "Selvagem", 75, 10, "Tipo C");

        while (dragao.estaVivo() && hydra.estaVivo()) {
            System.out.println("-----------------------");
            System.out.println("\n1. ATACAR");
            System.out.println("\n2. FUGIR");
            System.out.println("\n\nescolha o seu movimento:  ");
            int escolha = scanner.nextInt();

            if (escolha == 1) {
                int danoDragao = dragao.atacar();
                System.out.println("\nVocê atacou a " + hydra.getNome()+ " " + hydra.getSobrenome() + "!");
                hydra.receberDano(danoDragao);

                if (hydra.estaVivo()) {
                    int danoHydra = hydra.atacar();
                    System.out.println("\nA " + hydra.getNome() + " contra atacou!");
                    dragao.receberDano(danoHydra);
                }
            } else if (escolha == 2) {
                System.out.println("\nVocê fugiu da batalha. Covarde! Fim do jogo.");
                break;            
            } else {
                System.out.println("\nOpção inválida. Tente novamente.");
            }
        }

        System.out.println("==============================");
        if (dragao.estaVivo() && !hydra.estaVivo()) {
            System.out.println("VITORIA! Você venceu!");
        } else if (!dragao.estaVivo()) {
            System.out.println("DERROTA! Você perdeu a batalha.");
        }
        System.out.println("==============================");

        scanner.close();
    }
}
