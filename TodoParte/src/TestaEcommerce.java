import java.util.Date;

public class TestaEcommerce {
    public static void main(String[] args){

        Cliente cli1 = new Cliente("123", "Fulano", "Rua Chile");
        CarrinhoCompra cc1 = new CarrinhoCompra(1, new Date(), cli1);
        System.out.println(cc1.toString());

        Produto prod1 = new Produto(10, "Memória Ram", "16 GBytes", 900);
        cc1.adicionaItemCarrinho(100, 3, prod1);

        Produto prod2 = new Produto(11, "Cooler", "Air", 300);
        cc1.adicionaItemCarrinho(101, 10, prod2);

        System.out.println(cc1.toString());
        cc1.calculaTotalCompra();
    }
}
