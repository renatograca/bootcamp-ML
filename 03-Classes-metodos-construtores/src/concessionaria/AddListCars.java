package concessionaria;

import java.math.BigDecimal;
import java.util.*;

public class AddListCars {
    public static List addCars() {
        List<Vehicle> vehicles = Arrays.asList(new Vehicle("Ford", "Fiesta", BigDecimal.valueOf(1000)),
                new Vehicle("Ford", "Focus", BigDecimal.valueOf(1200)),
                new Vehicle("Ford", "Explorer", BigDecimal.valueOf(2500)),
                new Vehicle("Fiat", "Uno", BigDecimal.valueOf(500)),
                new Vehicle("Fiat", "Cronos", BigDecimal.valueOf(1000)),
                new Vehicle("Fiat", "Torino", BigDecimal.valueOf(1250)),
                new Vehicle("Chevrolet", "Aveo", BigDecimal.valueOf(1250)),

                new Vehicle("Chevrolet", "Spin", BigDecimal.valueOf(2500)),
                new Vehicle("Toyota", "Corola", BigDecimal.valueOf(1200)),
                new Vehicle("Toyota", "Fortuner", BigDecimal.valueOf(3000)),
                new Vehicle("Renault", "Logan", BigDecimal.valueOf(950)));
        return vehicles;
    }
}
