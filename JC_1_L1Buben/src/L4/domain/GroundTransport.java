package L4.domain;

public class GroundTransport extends Transport {
    private final String GroundTransportID = "111";// = 1 for ground transport and 2 digit for chassis type

    private final String ChassisType = "11"; // можно "обмазаться" энамами с двойной классификацией шасси, но я уже продемонстрировал
    // работу с энамами и поэтому задам FINAL(только для машин), но при этом оставлю SETTER(словно этот параметр изменяемый и
    // находится в 2 энамах). Следовательно, ID будет тоже фиксированным.

    public String getGroundTransportID() {
        return GroundTransportID;
    }

    /*public void setGroundTransportID(String groundTransportID) {
        GroundTransportID = groundTransportID;
    }*/

    public String getChassisType() {
        return ChassisType;
    }

    /*public void setChassisType(String chassisType) {
        ChassisType = chassisType;
    }*/
}
