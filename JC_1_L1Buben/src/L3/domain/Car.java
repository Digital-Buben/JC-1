package L3.domain;

public class Car {
    private int weight;
    private String power;
    private String type;

    //пустой конструктор
    public Car() {
    }

    public Car(int weight, String power, String type) {
        this.weight = weight;
        this.power = power;
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public String getPower() {
        return power;
    }

    public String getType() {
        return type;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setType(String type) {
        this.type = type;
    }
}
