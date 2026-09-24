public class Main {
    public static void main(String[] args) {
        //executando um carro novo
        Carro carroUm = new Carro();
        carroUm.marca = "Toyota";
        carroUm.modelo = "Yaris";
        carroUm.combustivel = "Flex";
        carroUm.cor = "Prata";
        carroUm.ano = 2019;
        carroUm.cavalos = 120;

        carroUm.ligarMotor();
        carroUm.desligarMotor();

        //executando uma moto nova
        Moto motoUm = new Moto();
        motoUm.marca = "Yamaha";
        motoUm.modelo = "bis";
        motoUm.combustivel = "Gasolina";
        motoUm.cor = "Vermelha";
        motoUm.ano = 2020;
        motoUm.cavalos = 70;

        motoUm.ligarMotor();        
        motoUm.desligarMotor();
        
        //executando um balao novo
        Balao balaoUm = new Balao();
        balaoUm.marca = "AeroMagic";
        balaoUm.modelo = "Exclusivo";
        balaoUm.combustivel = "Gás Propano";
        balaoUm.cor = "Colorido";
        balaoUm.ano = 2025;
        balaoUm.cavalos = 500;

        balaoUm.ligarMotor();
        balaoUm.desligarMotor();
        
        //executando um helicoptero novo
        Helicoptero heliUm = new Helicoptero();
        heliUm.marca = "Valkyrie";
        heliUm.modelo = "Savage";
        heliUm.combustivel = "Diesel";
        heliUm.cor = "Cinza";
        heliUm.ano = 2005;
        heliUm.cavalos = 990;

        heliUm.ligarMotor();
        heliUm.desligarMotor();
    }


}
