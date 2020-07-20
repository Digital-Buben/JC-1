package L4.util;

import L5.enums.ChassisType;
import L5.enums.PropulsionSystem;
import L5.enums.TypeOfUse;

import java.util.Random;

public class RoadTransportUtil {

    public static ChassisType generateChassisType(){
        int r = new Random().nextInt(3);
        ChassisType chassisType;
        switch (r) {
            case 0:
                chassisType = ChassisType.WHEEL;
                break;
            case 1:
                chassisType = ChassisType.CRAWLER;
                break;
            case 2:
                chassisType = ChassisType.MIXED;
                break;
            default:
                chassisType = ChassisType.NON_TRACTION;
                break;
        }
        return chassisType;
    }

    public static PropulsionSystem generatePropulsionSystem(){
        int r = new Random().nextInt(2);
        PropulsionSystem propulsionSystem;
        switch (r) {
            case 0:
                propulsionSystem = PropulsionSystem.MOTOR_TRANSPORT;
                break;
            case 1:
                propulsionSystem = PropulsionSystem.ANIMAL_POWERED_TRANSPORT;
                break;
            default:
                propulsionSystem = PropulsionSystem.OTHER;
                break;

        }
        return propulsionSystem;
    }

    public static TypeOfUse generateTypeOfUse(){
        int r = new Random().nextInt(5);
        TypeOfUse typeOfUse;
        switch (r) {
            case 0:
                typeOfUse = TypeOfUse.MILITARY;
                break;
            case 1:
                typeOfUse = TypeOfUse.POLICE;
                break;
            case 2:
                typeOfUse = TypeOfUse.FIRE_DEPT;
                break;
            case 3:
                typeOfUse = TypeOfUse.MEDIC;
                break;
            case 4:
                typeOfUse = TypeOfUse.OTHER_SERVICES;
                break;
            default:
                typeOfUse = TypeOfUse.CIVIC;
                break;
        }
        return typeOfUse;
    }
}
