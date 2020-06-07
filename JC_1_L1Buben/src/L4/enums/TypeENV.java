package L4.enums;

public enum TypeENV {
    GROUND("Ground transport", "10 "),
    WATER("Water transport", "20 "),
    AIR_AND_SPACE("Air transport", "30 "),
    OTHER("Аmphibian and other", "40 ");

    private String typeDescription1;
    private String idModifier1;


    TypeENV(String typeDescription1, String idModifier1) {
    }

    public String getTypeDescription1() {
        return typeDescription1;
    }

    public String getIdModifier1() {
        return idModifier1;
    }

    public void setIdModifier1(String idModifier1) {
        this.idModifier1 = idModifier1;
    }
}
