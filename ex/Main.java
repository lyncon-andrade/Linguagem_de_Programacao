package ex;

public class Main {
    public static void main(String[] args){

        boolean luzAcesa = true;

        if(luzAcesa) {
            System.out.println("A luz esta acesa.");
        } else {
            System.out.println("A luz esta apagada.");
        }
        String luz = (luzAcesa) ? "Esta acesa." : "Esta apagada.";
        System.out.println(luz);
        }
        }