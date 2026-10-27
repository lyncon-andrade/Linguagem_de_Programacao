public class Time {
    String nome;
    Jogador[] jogadores;
    EquipeTecnica equipeTecnica;

    public Time(String nome, Jogador[] jogadores, EquipeTecnica equipeTecnica) {
        setNome(nome);
        setJogadores(jogadores);
        setEquipeTecnica(equipeTecnica);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setEquipeTecnica(EquipeTecnica equipeTecnica) {
        this.equipeTecnica = equipeTecnica;
    }

    public EquipeTecnica getEquipeTecnica() {
        return equipeTecnica;
    }

    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Rafael", 23);
        Jogador jogador2 = new Jogador("Robert Arboleda", 5);
        Jogador jogador3 = new Jogador("Lucas Moura", 7);
        Jogador jogador4 = new Jogador("Marcos Antônio", 8);
        Jogador jogador5 = new Jogador("Jonathan Calleri", 9);
        Jogador jogador6 = new Jogador("Luciano", 10);
        Jogador jogador7 = new Jogador("Ferreira", 11);

        Membro membro1 = new Membro("Carlos Mendes", "Preparador Físico");
        Membro membro2 = new Membro("Ricardo Souza", "Fisioterapeuta");

        Tecnico tecnico = new Tecnico("Hernán Crespo");

        EquipeTecnica equipeTecnica = new EquipeTecnica(
            new Membro[] {membro1, membro2},
            tecnico
        );

        Time saoPaulo = new Time(
            "São Paulo FC",
            new Jogador[] {
                jogador1, jogador2, jogador3, jogador4,
                jogador5, jogador6, jogador7
            },
            equipeTecnica
        );

        System.out.println("Time: " + saoPaulo.getNome());
        System.out.println("Jogadores:");

        for (Jogador jogador : saoPaulo.getJogadores()) {
            System.out.println(jogador.nome + " - Camisa " + jogador.getNumero());
        }

        System.out.println("\nComissão técnica:");

        for (Membro membro : saoPaulo.getEquipeTecnica().getMembros()) {
            System.out.println(membro.nome + " - " + membro.getFuncao());
        }

        System.out.println("Técnico: " + saoPaulo.getEquipeTecnica().getTecnico().getNome());
    }
}