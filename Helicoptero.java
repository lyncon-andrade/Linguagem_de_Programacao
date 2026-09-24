public class Helicoptero {
    static String marca = "";
    static String modelo = "";
    static String combustivel = "";
    static String cor = "";
    static int ano = 0;
    static int cavalos = 0;
                                                            
    public static void ligarMotor() {
        System.out.println("O Helicoptero " + marca + " " + modelo + " da cor " + cor + ", ano " + ano + " Ligou!");
    }
    public static void desligarMotor() {
        System.out.println("O Helicoptero " + marca + " " + modelo + " da cor " + cor + ", ano " + ano + " desligou!");
    }

}
