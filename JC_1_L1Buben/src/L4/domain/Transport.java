package L4.domain;

import L4.enums.Propulsion_system;
import L4.util.TransportUtil;

public abstract class Transport {
    private String[] TransportID;//Transport ID = (1 digit for type of use) + (3 digits for
    //typeENV) + (2 digits for propulsionSystem).
    //In other words transport ID is not unique.

    private String typeENV;// movement environment: ground, air  and so on

    private String propulsionSystem;

    private String typeOfUse; //civic, military

    @Override
    public String toString() {
        String s ="";
        for (int i = 0; i <TransportID.length ; i++) {
            s+=TransportID[i];
        }
        return s;
    }

    public String[] getTransportID() {
        return TransportID;
    }
// считает статиком сеттер, не знаю почему
    public void setTransportID(String[] TransportID) {
        this.TransportID[0] = TransportUtil.generateTypeOfUse();
        this.TransportID[1] = GroundTransport.getGroundTransportID();
        this.TransportID[2] = Propulsion_system.getIdModifier2();

    }

    public String getTypeENV() {
        return typeENV;
    }

    public void setTypeENV(String typeENV) {
        this.typeENV = typeENV;
    }

    public String getPropulsionSystem() {
        return propulsionSystem;
    }

    public void setPropulsionSystem(String propulsionSystem) {
        this.propulsionSystem = propulsionSystem;
    }

    public String getTypeOfUse() {
        return typeOfUse;
    }

    public void setTypeOfUse(String typeOfUse) {
        this.typeOfUse = typeOfUse;
    }


}
