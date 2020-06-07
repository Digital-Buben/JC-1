package L3.domain;

import L4.domain.GroundTransport;
import L4.interfaces.Sportification;

import java.util.Arrays;
import java.util.Objects;

public class Car extends GroundTransport implements Sportification {

    private long carID;

    private int weight;

    private String type;

    private boolean sportify;

    //даже после вашей помощи в transportID стоит null

    public Car() {
    }

    public Car(int weight) {
        this.weight = weight;
    }

    //I've decided should be the only parameter set manually.

    public long getCarID() {
        return carID;
    }

    public void setCarID(long carID) {
        this.carID = carID;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getSportify() {
        return sportify;
    }

    public void setSportify(boolean sportify) {
        this.sportify = sportify;
    }

    @Override
    public String toString() {
        return "Transport [" + Arrays.toString(getTransportID()) +
                "] Car {"+
                "carID = " + carID+
                ", car weight = " + weight+
                ", car type= " + type +
                ", car sportify= "+ sportify + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(carID, type, weight)*31;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass()!= obj.getClass()) return false;
        Car car = (Car) obj;
        return (Objects.equals(transportID, car.transportID) && weight== car.weight && Objects.equals(type, car.type));
    }
}
