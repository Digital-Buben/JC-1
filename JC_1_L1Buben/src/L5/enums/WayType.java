package L5.enums;

public enum WayType {
    RAIL("Rail transport", 1),
    ROAD("Road transport", 2);
    private String typeDescription3;
    private int idModifier3;

    WayType(String typeDescription3, int idModifier3) {
        this.typeDescription3 = typeDescription3;
        this.idModifier3 = idModifier3;
    }

    public String getTypeDescription3() {
        return typeDescription3;
    }

    public int getIdModifier3() {
        return idModifier3;
    }
}
