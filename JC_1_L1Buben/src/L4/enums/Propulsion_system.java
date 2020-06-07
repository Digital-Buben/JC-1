package L4.enums;

public enum Propulsion_system {
    MOTOR_TRANSPORT("Motor transport", "10 "),
    ANIMAL_POWERED_TRANSPORT("Animal-powered transport", "20 "),
    OTHER("Human-powered transport and other types", "30 ");

    private String typeDescription2;
    private String idModifier2;


    Propulsion_system(String typeDescription2, String idModifier2) {
        this.typeDescription2 = typeDescription2;
        this.idModifier2 = idModifier2;
    }

    public String getIdModifier2() {
        return idModifier2;
    }

    public void setIdModifier2(String idModifier2) {
       this.idModifier2 = idModifier2;
    }
}
