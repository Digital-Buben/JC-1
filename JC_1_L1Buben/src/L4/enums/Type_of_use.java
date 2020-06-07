package L4.enums;

public enum Type_of_use {
    MILITARY("For army", "1 "),
    POLICE("For police", "2 "),
    FIRE_DEPT("For fire department", "3 "),
    MEDIC("For medical service", "4 "),
    OTHER_SERVICES("For other emergency services", "5 "),
    CIVIC("Civilian transport", "6 ");

    private String typeDescription0;
    private String idModifier0;

    Type_of_use(String typeDescription0, String idModifier0) {
        this.typeDescription0 = typeDescription0;
        this.idModifier0 = idModifier0;
    }


    public String getTypeDescription0() {
        return typeDescription0;
    }

    public String getIdModifier0() {
        return idModifier0;
    }

    public void setIdModifier0(String idModifier0) {this.idModifier0 = idModifier0;
    }
}
