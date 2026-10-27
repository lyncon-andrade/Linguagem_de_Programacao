public class Cliente {
    String nome;
    Endereco[] enderecos;
    Telefone[] telefones;
    Email[] emails;

    public Cliente(String nome, Endereco[] enderecos, Telefone[] telefones, Email[] emails){
        setNome(nome);
        setEmails(emails);
        setEnderecos(enderecos);
        setTelefones(telefones);
    }
    public void setEmails(Email[] emails) {
        this.emails = emails;
    }
    public Email[] getEmails() {
        return emails;
    }
    public void setEnderecos(Endereco[] enderecos) {
        this.enderecos = enderecos;
    }
    public Endereco[] getEnderecos() {
        return enderecos;
    }
    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }
    public Telefone[] getTelefones() {
        return telefones;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public static void main(String[] args){
        Telefone tel1 = new Telefone("(15) 99456-7890");
        Telefone tel2 = new Telefone("(18) 99234-5678");

        Email emai1 = new Email("hifenredragon@gmail.com");
        Email emai2 = new Email("suikamundotorajo@outlook.com");

        Endereco endereco1 = new Endereco("Rua Vinte Cinco de Marte", 266, null);
        Endereco endereco2 = new Endereco("Rua Roblox", 4, "Portão 2");

        Cliente martin = new Cliente("Martin Luther King", new Endereco[] {endereco1, endereco2}, new Telefone[]{tel1,tel2}, new Email[]{emai1, emai2});
        Cliente[] clientes = {martin};
        for (Cliente cliente : clientes) {
            System.out.println(cliente.nome);
            for (Endereco endereco : cliente.enderecos) {
                if(endereco.complemento == null){
                    System.out.println(endereco.rua +", " +endereco.num);
                }else{
                    System.out.println(endereco.rua +", " +endereco.num+" - "+endereco.complemento);
                }
            }
            for (Email email : cliente.emails) {
                System.out.println(email.email);
            }
            for (Telefone telefone : cliente.telefones) {
                System.out.println(telefone.digitos);
            }
        }
    }
}
