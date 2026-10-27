package 10_poo.exercicio_7;

public class Pedido {
    Produto[] produtos;
    int numPedido;

    public Pedido(Produto[] produtos, int numPedido){
        setNumPedido(numPedido);
        setProdutos(produtos);
    }
    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }
    public int getNumPedido() {
        return numPedido;
    }
    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }
    public Produto[] getProdutos() {
        return produtos;
    }
}