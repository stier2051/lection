package Era;

public abstract class Battery {
    abstract double getPower(); //returns of battery in watts
    abstract double getLifeTime(); //time to live in seconds
}

class ToshibaBattery extends Battery {

    double voltage; //U
    double currency; //I
    double energy;//A
    double extraEnergy;

    public ToshibaBattery() {
    }

    public ToshibaBattery(double voltage, double currency, double energy, double extraEnergy) {
        this.voltage = voltage;
        this.currency = currency;
        this.energy = energy;
        this.extraEnergy = extraEnergy;
    }

    @Override
    double getPower() {
        return voltage * currency;
    }

    @Override
    double getLifeTime() {
        return (energy / (voltage * currency)) * 60; //in seconds
    }
}

class DuracellBattery extends Battery {

    double voltage;
    double currency;
    double energy;
    double internalVoltage;

    public DuracellBattery() {
    }

    public DuracellBattery(double voltage, double currency, double energy, double internalVoltage) {
        this.voltage = voltage;
        this.currency = currency;
        this.energy = energy;
        this.internalVoltage = internalVoltage;
    }

    @Override
    double getPower() {
        return voltage * currency;
    }

    @Override
    double getLifeTime() {
        return (energy / (voltage * currency)) * 60; //in seconds
    }
}

class FlashLight {
    Battery batteries[];

    public FlashLight(Battery[] batteries) {
        this.batteries = batteries;
    }

    double getTotalPower() {
        double totalPower = 0;
        for (Battery battery : batteries) {
            totalPower = totalPower + battery.getPower();
        }
        return totalPower;
    }
    double getTotalEnergy() {
        double totalEnergy = 0;

        return totalEnergy;
    }
    double getTotalLifeTime() {
        return getTotalEnergy() / getTotalPower();
    }

    public static void main(String[] args) {
        ToshibaBattery toshibaBattery1 = new ToshibaBattery(1,5,6, 0);
        ToshibaBattery toshibaBattery2 = new ToshibaBattery(2,4,6, 0);
        ToshibaBattery toshibaBattery3 = new ToshibaBattery(3,3,6, 0);
        ToshibaBattery toshibaBattery4 = new ToshibaBattery(4,2,6, 0);
        ToshibaBattery toshibaBattery5 = new ToshibaBattery(5,1,6, 0);

        DuracellBattery duracellBattery1 = new DuracellBattery(6,10,5,0);
        DuracellBattery duracellBattery2 = new DuracellBattery(7,9,5,0);
        DuracellBattery duracellBattery3 = new DuracellBattery(8,8,5,0);
        DuracellBattery duracellBattery4 = new DuracellBattery(9,7,5,0);
        DuracellBattery duracellBattery5 = new DuracellBattery(10,6,5,0);

        FlashLight flashLight1 = new FlashLight(new ToshibaBattery[]{toshibaBattery1, toshibaBattery2, toshibaBattery3});
        FlashLight flashLight2 = new FlashLight(new ToshibaBattery[]{toshibaBattery4, toshibaBattery3, toshibaBattery5});
        FlashLight flashLight3 = new FlashLight(new DuracellBattery[]{duracellBattery1, duracellBattery3, duracellBattery4});
        FlashLight flashLight4 = new FlashLight(new DuracellBattery[]{duracellBattery4, duracellBattery5, duracellBattery2});
        FlashLight flashLight5 = new FlashLight(new DuracellBattery[]{duracellBattery3, duracellBattery2, duracellBattery1});

        double[] lifeTimeArray = new double[] {flashLight1.getTotalLifeTime(), flashLight2.getTotalLifeTime(), flashLight3.getTotalLifeTime(), flashLight4.getTotalLifeTime(), flashLight5.getTotalLifeTime()};
        double sumOfLifeTime = 0;
        double maxLifeTime = 0;
        for (double v : lifeTimeArray) {
            sumOfLifeTime = sumOfLifeTime + v;
            if (v > maxLifeTime) {
                maxLifeTime = v;
            }
        }
        System.out.println(sumOfLifeTime);
        System.out.println(maxLifeTime);


    }
}
