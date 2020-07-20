package L3.domain;

import L4.domain.RoadTransport;
import L4.interfaces.Sportification;
import L5.enums.*;

import java.util.Random;

public class Car extends RoadTransport implements Sportification {

    PropulsionSystem propulsionSystem = PropulsionSystem.MOTOR_TRANSPORT;

    ChassisType chassisType = ChassisType.WHEEL;

    TypeOfUse typeOfUse = TypeOfUse.CIVIC;

    private long carID;

    private int weight;

    private CarType carType;

    public Car() {
        setGroundTransportID();
        setRoadTransportID();
    }

    /*public Car(int groundTransportID, long carID, int weight, CarType carType) {
        super(groundTransportID);
        this.carID = carID;
        this.weight = weight;
        this.carType = carType;
    }*/

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

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void sportification() {
        int r =new Random().nextInt(2);
        if(r == 0) {
            System.out.println("Sportification is impossible");
        } else {
            System.out.println("Car was sportified");
            setWeight(getWeight()- weightLoss);
        }
    }

    @Override
    public void setGroundTransportID() {
        groundTransportID = propulsionSystem.getIdModifier1()*100 + chassisType.getIdModifier2() * 10 + WayType.ROAD.getIdModifier3();
    }

    @Override
    public ChassisType getChassisType() {
        return chassisType;
    }

    @Override
    public void setChassisType(ChassisType chassisType) {
        this.chassisType = chassisType;
    }

    @Override
    public TypeOfUse getTypeOfUse() {
        return typeOfUse;
    }

    @Override
    public void setTypeOfUse(TypeOfUse typeOfUse) {
        this.typeOfUse = typeOfUse;
    }

    @Override
    public int getGroundTransportID() {
        return super.getGroundTransportID();
    }

    @Override
    public String toString() {
        return "Transport [" +getRoadTransportID()+ "]" +
                "Car {"+
                "usage = " + typeOfUse.getGroundTypeDescription() +
                ", carID = " + carID+
                ", car weight = " + weight+
                ", car type= " + carType.getTypeDescription() + "}";
    }
}
