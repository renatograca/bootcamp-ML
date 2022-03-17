package concessionaria;

import java.math.BigDecimal;

public class Programa {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Mobi", "Fiat", BigDecimal.valueOf(70.000));
        System.out.println(veiculo);
        System.out.println(AddListCars.addCars());
    }
}
