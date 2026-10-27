public class Endereco {
    String rua;
    int num;
    String complemento;

    public Endereco(String rua, int num, String complemento){
        setComplemento(complemento);
        setNum(num);
        setRua(rua);
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public int getNum() {
        return num;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getRua() {
        return rua;
    }
}