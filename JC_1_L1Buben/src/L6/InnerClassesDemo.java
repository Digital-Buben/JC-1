package L6;

import L6.domain.Computer;

public class InnerClassesDemo {
    public static void main(String[] args) {
        Computer.CPU cpu = new Computer().new CPU();
        cpu.setCpuName("cpu");
        cpu.setMaxCpuPowerConsumption(135);
        Computer.Memory memory = new Computer().new Memory();
        memory.setMemoryName("mem");
        memory.setMaxMemoryPowerConsumption(120);
        Computer.HDD hdd = new Computer().new HDD("HDD", 200);
        cpu.setCpuName("HDD");
        cpu.setMaxCpuPowerConsumption(200);
        Computer.PowerSupply powerSupply = new Computer().new PowerSupply();
        powerSupply.setPowerSupplyName("ps");
        powerSupply.setTotalConsumptionValue(powerSupply.totalConsumption(cpu.getMaxCpuPowerConsumption(), memory.getMaxMemoryPowerConsumption(), hdd.getMaxHddPowerConsumption()));
        Computer computer = new Computer(hdd, memory, cpu, powerSupply);
        System.out.println(computer);

        //anon
        Computer.PowerSupply powerSupply1 = new Computer().new PowerSupply() {
            @Override
            public int totalConsumption(int maxHddPowerConsumption, int maxMemoryPowerConsumption, int maxCpuPowerConsumption) {
                int totalConsumptionValue = 30 * (maxHddPowerConsumption + maxMemoryPowerConsumption + maxCpuPowerConsumption) / 10;
                return totalConsumptionValue;
            }
        };
        powerSupply1.setPowerSupplyName("ps");
        powerSupply1.setTotalConsumptionValue(powerSupply1.totalConsumption(cpu.getMaxCpuPowerConsumption(), memory.getMaxMemoryPowerConsumption(), hdd.getMaxHddPowerConsumption()));

        Computer computer1 = new Computer(hdd, memory, cpu, powerSupply1) {

        };
        System.out.println(computer1);
        // local

        class LocalClass {
            private String smthLocal = "Прощай мир!";

            public LocalClass(String smthLocal) {
                this.smthLocal = smthLocal;
            }

            public String getSmthLocal() {
                return smthLocal;
            }

            public void setSmthLocal(String smthLocal) {
                this.smthLocal = smthLocal;
            }
        }
        LocalClass localClass = new LocalClass("Local string");
        System.out.println(localClass.getSmthLocal());


        System.out.println(666);

    }


}
