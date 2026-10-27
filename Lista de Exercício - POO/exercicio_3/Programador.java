public class Programador {
    Linguagem[] linguagem;
    int nivel_cafeina;
    SO[] sistema_operacional;

    public Programador(Linguagem[] linguagem, int nivel_cafeina, SO[] sistema_operacional){
        setLinguagem(linguagem);
        setNivel_cafeina(nivel_cafeina);
        setSistema_operacional(sistema_operacional);
    }
    public void setLinguagem(Linguagem[] linguagem) {
        this.linguagem = linguagem;
    }
    public Linguagem[] getLinguagem() {
        return linguagem;
    }
    public void setNivel_cafeina(int nivel_cafeina) {
        this.nivel_cafeina = nivel_cafeina;
    }
    public int getNivel_cafeina() {
        return nivel_cafeina;
    }
    public void setSistema_operacional(SO[] sistema_operacional) {
        this.sistema_operacional = sistema_operacional;
    }
    public SO[] getSistema_operacional() {
        return sistema_operacional;
    }
    public static void main(String[] args){
        Linguagem python = new Linguagem("python", "backend");
        Linguagem html = new Linguagem("html", "frontend");
        Linguagem php = new Linguagem("php", "backend");
        Linguagem java = new Linguagem("java", "backend");
        SO macOS= new SO("macOS");
        SO linux = new SO("ubuntu");
        SO windows = new SO("windows");

        Programador Dirlei = new Programador(new Linguagem[] {python,html,php}, 12, new SO[]{macOS, linux});
        Programador Thiago = new Programador(new Linguagem[] {java,html,php}, 12, new SO[]{windows, linux});
        Programador[] bla = {Dirlei, Thiago};

        for (Programador programador : bla) {
            for (Linguagem lingua : programador.linguagem) {
                System.out.println(lingua.nome);
                System.out.println(lingua.tipo);
            }
            System.out.println(programador.nivel_cafeina);
            for (SO so : programador.sistema_operacional) {
                System.out.println(so.SO);
            }
            System.out.println();
        }

        
    }
}