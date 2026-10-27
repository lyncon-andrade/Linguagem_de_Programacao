public class Acessorio {
    String nome;
    String utilidade;

    public Acessorio(String nome, String utilidade){
        setNome(nome);
        setUtilidade(utilidade);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setUtilidade(String utilidade) {
        this.utilidade = utilidade;
    }
    public String getUtilidade() {
        return utilidade;
    }
}