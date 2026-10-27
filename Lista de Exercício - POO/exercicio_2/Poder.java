public class Poder {
    String nome;
    String descrevendo;

    public Poder(String nome, String descrevendo){
        setNome(nome);
        setDescrevendo(descrevendo);
    }

    public void setDescrevendo(String descrevendo) {
        this.descrevendo = descrevendo;
    }
    public String getDescrevendo() {
        return descrevendo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}