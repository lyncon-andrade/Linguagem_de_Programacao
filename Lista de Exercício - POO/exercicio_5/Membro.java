public class Membro {
    String nome;
    String funcao;

    public Membro(String nome, String funcao){
        setFuncao(funcao);
        setNome(nome);
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}