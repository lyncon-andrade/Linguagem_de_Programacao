public class Main {
    public static void main(String[] args) {
        int[] conjunto = {10, 21, 32, 43, 54};

        for (int numeros : conjunto){
            if (numeros < 0){
                System.out.println("O valor de " + numeros + " é Negativo");
            }
            if (numeros == 0){
                System.out.println("O valor de " + numeros + " é Zero");
            }
            if (numeros > 0){
                System.out.println("O valor de " + numeros + " é Positivo");
            }
        }
    }
}
