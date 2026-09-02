public class Main {
    public static void main(String[] args) {
        String saudacao = "Hello World!";
        System.out.println(saudacao.length());
        System.out.println(saudacao.toLowerCase());
        System.out.println(saudacao.toUpperCase());
        System.out.println(saudacao.indexOf("o"));
        System.out.println(saudacao.charAt(6));

        //aula 4
        String aluno_1 = "miranata";
        String aluno_2 = "aeronauta";
        System.out.println(aluno_1.equals(aluno_2));

        String mensagem = "        Hello World!        ";
        System.out.println("-" + mensagem.trim() + "-");

        String aluno_3 = "Pombinha da paz silva";
        System.out.println(aluno_3.contains("PAZ"));

        String aluno_4 = "";
        System.out.println(aluno_4.isEmpty());

        String frutas = String.join("-","Laranja","Banana");
        System.out.println(frutas);

        String nome_completo = "Del Lokom Pirom";
        System.out.println(nome_completo.replace("m","n"));

        String texto = "Boa noite!";
        System.out.println(texto.substring(4,9));

        String frase = "Repetição com correção leva a perfeição";
        System.out.println(frase);
    }
} 