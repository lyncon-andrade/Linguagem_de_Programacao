public class Personagem {
    String nome;
    int vida;
    Tipo[] tipo;
    Poder poder;

    public Personagem(String nome, int vida, Tipo[] tipo, Poder poder){
        setNome(nome);
        setVida(vida);
        setTipo(tipo);
        setPoder(poder);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public Poder getPoder() {
        return poder;
    }
    public void setTipo(Tipo[] tipo) {
        this.tipo = tipo;
    }
    public Tipo[] getTipo() {
        return tipo;
    }
    public void setPoder(Poder poder) {
        this.poder = poder;
    }
    public int getVida() {
        return vida;
    }
    public static void main(String[] args) {
        Tipo tipo1 = new Tipo("Bárbaro");
        Tipo tipo2 = new Tipo("Clérigo");
        Tipo tipo3 = new Tipo("Arqueiro");
        Tipo tipo4 = new Tipo("Berserker");
        Tipo tipo5 = new Tipo("Druida");
        Tipo tipo6 = new Tipo("Ladino");
        Poder poder1 = new Poder("Pirocinese", "Manipulação Elemental das Chamas. Queime-os!");
        Poder poder2 = new Poder("Eletrocinese", "Manipulação Elemental da Eletricidade. Eletrocute-os!");
        Poder poder3 = new Poder("Umbracinese", "Manipulação Elemental das Trevas. Cegue-os!");
        
        
        Personagem prota = new Personagem("Yami", 1020, new Tipo[] {tipo1, tipo3}, poder1);
        Personagem auxiliar = new Personagem("Haru", 740, new Tipo[]{tipo2,tipo4}, poder2);
        Personagem segundario = new Personagem("Araishi", 880, new Tipo[]{tipo5, tipo6}, poder3);

        Personagem[] grupoPrincipal = {prota, auxiliar, segundario};

        for (Personagem personagem : grupoPrincipal) {
            System.out.println(personagem.nome);
            System.out.println(personagem.vida);
            for (Tipo tipos : personagem.tipo) {
                System.out.println(tipos.tipo);
            }
            System.out.println(personagem.poder.nome);
            System.out.println(personagem.poder.descrevendo + "\n");
        }

    }
}