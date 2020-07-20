package L5.enums;

public enum TypeOfUse {
    MILITARY("For army", 1),
    POLICE("For police", 2),
    FIRE_DEPT("For fire department", 3),
    MEDIC("For medical service", 4),
    OTHER_SERVICES("For other emergency services", 5),
    CIVIC("Civilian transport", 6);

    private String groundTypeDescription;
    private int groundIdModifier;

    TypeOfUse(String groundTypeDescription, int groundIdModifier) {
        this.groundTypeDescription = groundTypeDescription;
        this.groundIdModifier = groundIdModifier;
    }

    public String getGroundTypeDescription() {
        return groundTypeDescription;
    }

    public int getGroundIdModifier() {
        return groundIdModifier;
    }
}
