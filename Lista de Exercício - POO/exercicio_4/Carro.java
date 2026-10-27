public class Carro {
    String modelo;    
    Motor motor;
    Acessorio[] acessorios;

    public Carro(String modelo, Motor motor, Acessorio[] acessorios){
        setAcessorios(acessorios);
        setModelo(modelo);
        setMotor(motor);
    }
    public void setAcessorios(Acessorio[] acessorios) {
        this.acessorios = acessorios;
    }
    public Acessorio[] getAcessorios() {
        return acessorios;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public Motor getMotor() {
        return motor;
    }
    public static void main(String[] args){
        Motor motor1 = new Motor("v12");
        Motor motor2 = new Motor("v8");
        Motor motor3 = new Motor("Boxer");
        Acessorio acessorio1 = new Acessorio("Aerofolio", "Melhora a estabilidade aerodinâmica");
        Acessorio acessorio2 = new Acessorio("Multimidia", "Permite ouvir música, usar GPS");
        Acessorio acessorio3 = new Acessorio("Rodas de Liga Leve", "Deixam o carro com uma aparência diferenciada");

        Carro carro1 = new Carro("Mustang", motor2, new Acessorio[] {acessorio1, acessorio2, acessorio3});
        Carro carro2 = new Carro("Aventador", motor1, new Acessorio[] {acessorio1, acessorio3});
        Carro carro3 = new Carro("WRX", motor3, new Acessorio[] {acessorio2});
        Carro[] carros = {carro1, carro2, carro3};

        for (Carro carro : carros) {
            System.err.println(carro.modelo);
            System.err.println(carro.motor.nome);
            for (Acessorio acessorio : carro.acessorios) {
                System.err.println(acessorio.nome);
                System.err.println(acessorio.utilidade);
            }
            System.out.println();
        }
    }
}