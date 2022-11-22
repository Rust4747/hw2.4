package oop.driver.transport;

import java.util.concurrent.ThreadLocalRandom;

public class Car extends Transport implements Compete {
    public Car(String brand, String model, float enginevolume) {
        super(brand, model, enginevolume);
    }





    @Override
    public void pitStop() {
        System.out.printf("oop.driver.transport.Car %s %s performed pit-stop",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void startMovement() {
        System.out.printf("oop.driver.transport.Car %s %s start moving",
                this.getBrand(),
                this.getModel());

    }

    @Override
    public void stopMovement() {
        System.out.printf("oop.driver.transport.Car %s %s stop moving",
                this.getBrand(),
                this.getModel());

    }

    @Override
    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(1,100);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(1,400);
    }

    @Override
    public String name() {
        return null;
    }


}
