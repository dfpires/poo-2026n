public class Carro {
    // atributos / propriedades (variáveis)
    public String marca, modelo, placa;
    public boolean motor; // true (ligado) ou false (desligado)
    public float velAtual;
    // método construtor - tem o mesmo nome da classe
    public Carro(){

    }
    public Carro(String marca, String modelo, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.motor = false;
        this.velAtual = 0;
    }
    // ligar o carro
    public void ligar(){
        if (!this.motor){
            this.motor = true;
            System.out.println("Carro foi ligado");
        }
    }
    // desligar o carro
    public void desligar(){
        if (this.motor){
            this.motor = false;
            this.velAtual = 0;
            System.out.println("Carro foi desligado");
        }
    }
    // acelerar o carro de X unidades
    public void acelerar(float x){
        if (this.motor){
            this.velAtual += x;
            System.out.println("Nova velocidade " + this.velAtual);
        }
    }
    // frear o carro
    public void frear(float x){
        if (this.motor && this.velAtual - x >= 0){
            this.velAtual -= x;
            System.out.println("Nova velocidade " + this.velAtual);
        }
    }
    // operações (métodos)
    public String toString(){ // converte objeto para String
        // this representa objeto que chama o método
        return "Marca: " + this.marca +
                " Modelo: " + this.modelo +
                " Placa: " + this.placa +
                " Vel Atual: " + this.velAtual +
                " Motor: " + (this.motor ? "ligado": "desligado");
    }
}