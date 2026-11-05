package Heranca;

public class Main {
    public static void main(String[] args) {
        Dog cao = new Dog();
        Cat gato = new Cat();

        cao.nome = "Totó";
        gato.nome = "Jubileu";

        cao.som();
        gato.som();
    }
}
