package 10_poo.exercicio_7;

public class Cliente {
    Pedido[] pedidos;
    String nome;

    public Cliente(String nome,Pedido[] pedidos){
        setPedidos(pedidos);
        setNome(nome);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setPedidos(Pedido[] pedidos) {
        this.pedidos = pedidos;
    }
    public Pedido[] getPedidos() {
        return pedidos;
    }

    public static void main(String[] args){
        Categoria higiene = new Categoria("higiene");
        Categoria comida = new Categoria("comida");
        Categoria bebida = new Categoria("bebida");

        Produto papelHigienico = new Produto("papel higienico", higiene);
        Produto pizzaCongelada = new Produto("pizza congelada", comida);
        Produto agua5L = new Produto("Galao de agua 5L", bebida);
        Produto pitanga = new Produto("pitanga", comida);
        Produto morango = new Produto("morango", comida);

        Pedido pedido1 = new Pedido(new Produto[]{papelHigienico, pizzaCongelada, agua5L}, 1);
        Pedido pedido2 = new Pedido(new Produto[]{pitanga, morango, pizzaCongelada, agua5L}, 2);

        Pedido[] pedidos = {pedido1, pedido2};
        
        Cliente cliente1 = new Cliente("Mauricio", pedidos);

        Cliente[] clientes = {cliente1};

        for (Cliente cliente : clientes) {
            System.out.println(cliente.nome);
            for (Pedido pedido: cliente.pedidos) {
                System.out.println("pedido "+pedido.numPedido+":");
                for (Produto produto : pedido.produtos) {
                    System.out.println(produto.nome + " - "+ produto.categoria.categoria);
                }
            }
                // System.out.println(produto.nome + " - " + produto.categoria.categoria);
        }
    }
}
