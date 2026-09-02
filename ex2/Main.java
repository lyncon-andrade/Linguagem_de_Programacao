package ex2;

public class Main {
    public static void main (String[] args){

        int idade = 30;

        if(idade < 12) {
            System.out.println("Criança");
        }
        if(idade > 12 && idade < 18) {
            System.out.println("Adolescente");
        
        }

        if(idade > 19 && idade < 50) {
            System.out.println("Adulto");
        
        }

        if(idade > 51 ) {
            System.out.println("Idoso");
        
        }

    }
}
