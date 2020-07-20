package L6.domain;

public class Computer {
    private HDD hdd = new HDD();
    private Memory memory = new Memory();
    private CPU cpu = new CPU();
    private PowerSupply powerSupply = new PowerSupply();

//inner
    public class HDD {
        private String hddName;

        private int maxHddPowerConsumption;

        public HDD() {
        }

        public HDD(String hddName, int maxHddPowerConsumption) {
            this.hddName = hddName;
            this.maxHddPowerConsumption = maxHddPowerConsumption;
        }

        public String getHddName() {
            return hddName;
        }

        public void setHddName(String hddName) {
            this.hddName = hddName;
        }

        public int getMaxHddPowerConsumption() {
            return maxHddPowerConsumption;
        }

        public void setMaxHddPowerConsumption(int maxHddPowerConsumption) {
            this.maxHddPowerConsumption = maxHddPowerConsumption;
        }

        @Override
        public String toString() {
            return "HDD{" +
                    "hddName='" + hddName + '\'' +
                    ", maxHddPowerConsumption=" + maxHddPowerConsumption +
                    '}';
        }
    }

    public class Memory {
        private String memoryName;

        private int maxMemoryPowerConsumption;

        public Memory() {
        }

        public Memory(String memoryName, int maxMemoryPowerConsumption) {
            this.memoryName = memoryName;
            this.maxMemoryPowerConsumption = maxMemoryPowerConsumption;
        }

        public String getMemoryName() {
            return memoryName;
        }

        public void setMemoryName(String memoryName) {
            this.memoryName = memoryName;
        }

        public int getMaxMemoryPowerConsumption() {
            return maxMemoryPowerConsumption;
        }

        public void setMaxMemoryPowerConsumption(int maxMemoryPowerConsumption) {
            this.maxMemoryPowerConsumption = maxMemoryPowerConsumption;
        }

        @Override
        public String toString() {
            return "Memory{" +
                    "MemoryName='" + memoryName + '\'' +
                    ", maxMemoryPowerConsumption=" + maxMemoryPowerConsumption +
                    '}';
        }
    }

    public class CPU {
        private String cpuName;

        private int maxCpuPowerConsumption;

        public CPU() {
        }

        public CPU(String cpuName, int maxCpuPowerConsumption) {
            this.cpuName = cpuName;
            this.maxCpuPowerConsumption = maxCpuPowerConsumption;
        }

        public String getCpuName() {
            return cpuName;
        }

        public void setCpuName(String cpuName) {
            this.cpuName = cpuName;
        }

        public int getMaxCpuPowerConsumption() {
            return maxCpuPowerConsumption;
        }

        public void setMaxCpuPowerConsumption(int maxCpuPowerConsumption) {
            this.maxCpuPowerConsumption = maxCpuPowerConsumption;
        }

        @Override
        public String toString() {
            return "CPU{" +
                    "cpuName='" + cpuName + '\'' +
                    ", maxCpuPowerConsumption=" + maxCpuPowerConsumption +
                    '}';
        }
    }

    public class PowerSupply {
        private String powerSupplyName;

        private int totalConsumptionValue = totalConsumption(hdd.getMaxHddPowerConsumption(), memory.getMaxMemoryPowerConsumption(), cpu.getMaxCpuPowerConsumption());

        public int totalConsumption(int maxHddPowerConsumption, int maxMemoryPowerConsumption, int maxCpuPowerConsumption) {
            int totalConsumptionValue = 15 * (maxHddPowerConsumption + maxMemoryPowerConsumption + maxCpuPowerConsumption) / 10;
            return totalConsumptionValue;
        }

        public PowerSupply() {
            setTotalConsumptionValue(totalConsumptionValue);
        }

        public PowerSupply(String powerSupplyName, int totalConsumptionValue) {
            this.powerSupplyName = powerSupplyName;
            this.totalConsumptionValue = totalConsumptionValue;
        }

        public PowerSupply(String powerSupplyName) {
            this.powerSupplyName = powerSupplyName;
            setTotalConsumptionValue(totalConsumptionValue);
        }

        public String getPowerSupplyName() {
            return powerSupplyName;
        }

        public void setPowerSupplyName(String powerSupplyName) {
            this.powerSupplyName = powerSupplyName;
        }

        public int getTotalConsumptionValue() {
            return totalConsumptionValue;
        }

        public void setTotalConsumptionValue(int totalConsumptionValue) {
            this.totalConsumptionValue = totalConsumptionValue;
        }

        @Override
        public String toString() {
            return "PowerSupply{" +
                    "powerSupplyName='" + powerSupplyName + '\'' +
                    ", totalConsumptionValue=" + totalConsumptionValue +
                    '}';
        }


    }

    public Computer(HDD hdd, Memory memory, CPU cpu, PowerSupply powerSupply) {
        this.hdd = hdd;
        this.memory = memory;
        this.cpu = cpu;
        this.powerSupply = powerSupply;
    }

    public Computer() {
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "hdd=" + hdd +
                ", memory=" + memory +
                ", cpu=" + cpu +
                ", powerSupply=" + powerSupply +
                '}';
    }
}

