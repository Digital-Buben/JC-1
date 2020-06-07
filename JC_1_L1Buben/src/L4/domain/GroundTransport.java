package L4.domain;

import L4.enums.Propulsion_system;
import L4.enums.TypeENV;
import L4.util.TransportUtil;

public class GroundTransport extends Transport {

    private final String groundTransportID = "111";// = 1 for ground transport and 2 digit for chassis type

    private final String chassisType = "11"; // можно "обмазаться" энамами с двойной классификацией шасси, но я уже продемонстрировал
    // работу с энамами и поэтому задам FINAL(только для машин), но при этом оставлю SETTER(словно этот параметр изменяемый и
    // находится в 2 энамах). Следовательно, ID будет тоже фиксированным.

    public String getGroundTransportID() {
        return groundTransportID;
    }

    /*public void setGroundTransportID(String groundTransportID) {
        groundTransportID = groundTransportID;
    }*/

    public String getChassisType() {
        return chassisType;
    }

    public GroundTransport(String[] transportID, TypeENV typeENV, Propulsion_system propulsionSystem, String typeOfUse) {
        super(transportID, typeENV, propulsionSystem, typeOfUse);
        setTransportID();
    }

    public GroundTransport(){

    }

    @Override
    public void setTransportID() {
        this.transportID[0] = TransportUtil.generateTypeOfUse();
        this.transportID[1] = groundTransportID;
        this.transportID[2] = super.getPropulsionSystem().getIdModifier2();
    }

    /*public void setChassisType(String chassisType) {
        chassisType = chassisType;
    }*/
}
