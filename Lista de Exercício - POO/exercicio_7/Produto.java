package 10_poo.exercicio_7;

public class Produto {
    String nome;
    Categoria categoria;

    public Produto(String nome, Categoria categoria){
        setCategoria(categoria);
        setNome(nome);
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}
