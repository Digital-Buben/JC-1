package L4.domain;

import L4.util.RoadTransportUtil;
import L5.enums.ChassisType;
import L5.enums.PropulsionSystem;
import L5.enums.TypeOfUse;
import L5.enums.WayType;

public class RoadTransport extends GroundTransport{

    WayType wayType = WayType.ROAD;

    ChassisType chassisType = RoadTransportUtil.generateChassisType();

    PropulsionSystem propulsionSystem = RoadTransportUtil.generatePropulsionSystem();

    protected int roadTransportID;

    protected TypeOfUse typeOfUse = RoadTransportUtil.generateTypeOfUse();

    public RoadTransport() {
    }

    public int getRoadTransportID() {
        return roadTransportID;
    }

    public void setRoadTransportID() {
        this.roadTransportID = groundTransportID*10 + this.typeOfUse.getGroundIdModifier();
    }

    public TypeOfUse getTypeOfUse() {
        return typeOfUse;
    }

   public RoadTransport(TypeOfUse typeOfUse) {
        this.typeOfUse = typeOfUse;
    }


    public void setTypeOfUse(TypeOfUse typeOfUse) {
        this.typeOfUse = typeOfUse;
    }

    @Override
    public void setGroundTransportID() {
        groundTransportID = propulsionSystem.getIdModifier1()*100 + chassisType.getIdModifier2() * 10 + wayType.getIdModifier3();
    }
}
