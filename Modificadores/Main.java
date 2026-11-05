package Modificadores;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        p.nome = "maria";
        p.setIdade(30);

        System.out.println(p.nome);
        System.out.println(p.getIdade());
    }
}
