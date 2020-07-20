package L4.domain;

import L5.enums.ChassisType;
import L5.enums.PropulsionSystem;
import L5.enums.WayType;

public abstract class GroundTransport {
    protected int groundTransportID;

    protected PropulsionSystem propulsionSystem;

    protected ChassisType chassisType;

    protected WayType wayType;

    public int getGroundTransportID() {
        return groundTransportID;
    }

    public abstract void setGroundTransportID();

    public PropulsionSystem getPropulsionSystem() {
        return propulsionSystem;
    }

    public void setPropulsionSystem(PropulsionSystem propulsionSystem) {
        this.propulsionSystem = propulsionSystem;
    }

    public ChassisType getChassisType() {
        return chassisType;
    }

    public void setChassisType(ChassisType chassisType) {
        this.chassisType = chassisType;
    }

    public WayType getWayType() {
        return wayType;
    }

    public void setWayType(WayType wayType) {
        this.wayType = wayType;
    }

    protected GroundTransport(PropulsionSystem propulsionSystem, ChassisType chassisType, WayType wayType) {
        this.propulsionSystem = propulsionSystem;
        this.chassisType = chassisType;
        this.wayType = wayType;
    }

    protected GroundTransport() {
    }
}
