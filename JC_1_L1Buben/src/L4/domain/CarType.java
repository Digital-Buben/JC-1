package L4.domain;

public enum CarType {
    PASSENGER_CAR("Passenger car"),
    OFFROADER("Offroader"),
    TRUCK("Truck");
    private String typeDescription;

    CarType(String typeDescription) {
        this.typeDescription = typeDescription;
    }

    public String getTypeDescription() {
        return typeDescription;
    }
}
