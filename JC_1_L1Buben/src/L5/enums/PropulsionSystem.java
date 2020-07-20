package L5.enums;

public enum PropulsionSystem {
    MOTOR_TRANSPORT("Motor transport", 1),
    ANIMAL_POWERED_TRANSPORT("Animal-powered transport", 2 ),
    OTHER("Human-powered transport and other types", 3);

    private String typeDescription1;
    private int idModifier1;


    PropulsionSystem(String typeDescription2, int idModifier2) {
        this.typeDescription1 = typeDescription2;
        this.idModifier1 = idModifier2;
    }

    public int getIdModifier1() {
        return idModifier1;
    }

    public String getTypeDescription1() {
        return typeDescription1;
    }
}
