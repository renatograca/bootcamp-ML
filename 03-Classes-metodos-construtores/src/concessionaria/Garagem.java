package concessionaria;

import java.util.List;

public class Garagem {
    private String id;
    private List cars;

    public Garagem(String id, List cars) {
        this.id = id;
        this.cars = cars;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCars(List cars) {
        this.cars = cars;
    }

    public String getId() {
        return id;
    }

    public List getCars() {
        return cars;
    }
}
