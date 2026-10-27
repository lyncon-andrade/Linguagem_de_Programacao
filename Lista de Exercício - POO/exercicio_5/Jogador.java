public class Jogador {
    String nome;
    int numero;

    public Jogador(String nome, int numero){
        setNome(nome);
        setNumero(numero);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
}