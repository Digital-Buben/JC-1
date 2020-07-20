package L5.enums;

public enum ChassisType {
    WHEEL("Wheel chassis", 1),
    CRAWLER("Crawler chassis", 2),
    MIXED("Mixed type of chassis", 3),
    NON_TRACTION("Non-traction type of chassis", 4);

    private String typeDescription2;
    private int idModifier2;


    ChassisType(String typeDescription2, int idModifier2) {
        this.typeDescription2 = typeDescription2;
        this.idModifier2 = idModifier2;
    }

    public int getIdModifier2() {
        return idModifier2;
    }

    public String getTypeDescription2() {
        return typeDescription2;
    }
}
