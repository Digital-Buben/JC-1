package L3.domain;

import L4.domain.GroundTransport;

public class Car extends GroundTransport {
    private long carID;

    private int weight;

    private String type;

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

    @Override
    public String toString() {
        return "Transport [" +getTransportID() +
                "Car {"+
                "carID = " + carID+
                ", car weight = " + weight+
                ", car type= " + type + "}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
