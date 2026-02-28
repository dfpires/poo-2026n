public class TestaCarro {
    public static void main(String args[]){
        // cria um objeto (instância da classe Carro)
        Carro obj1 = new Carro();
        obj1.marca = "Fiat";
        obj1.modelo = "Palio";
        obj1.placa = "ABC";
        obj1.motor = false;
        obj1.velAtual = 0;
        System.out.println(obj1.toString());
        obj1.ligar();
        obj1.acelerar(120);
        obj1.frear(80);
        obj1.frear(80);
        System.out.println(obj1.toString());

        Carro obj2 = new Carro("GM", "Onix", "F3D");
        System.out.println(obj2.toString());
        obj2.desligar();
        System.out.println(obj2.toString());

        Carro obj3 = new Carro("BYD", "Song Plus", "AA");
    }
}
