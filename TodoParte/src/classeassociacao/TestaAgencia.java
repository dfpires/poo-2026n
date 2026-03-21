package classeassociacao;

import java.time.LocalDateTime;

public class TestaAgencia {
    public static void main(String[] args){
        Passageiro pa1 = new Passageiro("123", "Fulano");
        LocalDateTime data = LocalDateTime.of(2026, 7, 15, 13, 10);
        Voo vo1 = new Voo(777, "Ribeirão Preto", "Salvador", data);

        Reserva re1 = new Reserva(111, LocalDateTime.now(), 10, pa1, vo1);

        System.out.println(re1.toString());
    }
}
