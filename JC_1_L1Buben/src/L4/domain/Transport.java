package L4.domain;

import L4.enums.Propulsion_system;
import L4.enums.TypeENV;

public abstract class Transport {
    protected String[] transportID;//Transport ID = (1 digit for type of use) + (3 digits for
    //typeENV) + (2 digits for propulsionSystem).
    //In other words transport ID is not unique.

    private TypeENV typeENV;// movement environment: ground, air  and so on

    private Propulsion_system propulsionSystem;

    private String typeOfUse; //civic, military

    public Transport(String[] transportID, TypeENV typeENV, Propulsion_system propulsionSystem, String typeOfUse) {
        this.transportID = transportID;
        this.typeENV = typeENV;
        this.propulsionSystem = propulsionSystem;
        this.typeOfUse = typeOfUse;
    }

    protected Transport() {
    }

    @Override
    public String toString() {
        String s ="";
        for (int i = 0; i < transportID.length ; i++) {
            s+= transportID[i];
        }
        return s;
    }

    public String[] getTransportID() {
        return transportID;
    }


// считает статиком сеттер, не знаю почему
    public abstract void setTransportID();

    public void setTransportID(String transportID, String transportID1, String transportID2 ) {
        this.transportID[0] = transportID;
        this.transportID[1] = transportID1;
        this.transportID[2] = transportID2;
    }

    public TypeENV getTypeENV() {
        return typeENV;
    }

    public void setTypeENV(TypeENV typeENV) {
        this.typeENV = typeENV;
    }

    public Propulsion_system getPropulsionSystem() {
        return propulsionSystem;
    }

    public void setPropulsionSystem(Propulsion_system propulsionSystem) {
        this.propulsionSystem = propulsionSystem;
    }

    public String getTypeOfUse() {
        return typeOfUse;
    }

    public void setTypeOfUse(String typeOfUse) {
        this.typeOfUse = typeOfUse;
    }
}
