package oop.driver.transport;

import com.sun.jdi.connect.Transport;

import java.util.concurrent.ThreadLocalRandom;

public class Truck extends oop.driver.transport.Transport implements Compete {

    public Truck(String brand, String model, float enginevolume) {
        super(brand, model, enginevolume);
    }

    @Override
    public void pitStop() {
        System.out.printf("oop.driver.transport.Truck %s %s started moving",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void startMovement() {
        System.out.printf("oop.driver.transport.Truck %s %s started moving",
                this.getBrand(),
                this.getModel());

    }

    @Override
    public void stopMovement() {
        System.out.printf("oop.driver.transport.Truck %s %s performed pit-stop",
                this.getBrand(),
                this.getModel());

    }

    @Override
    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(1,100);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 400);
    }
}

