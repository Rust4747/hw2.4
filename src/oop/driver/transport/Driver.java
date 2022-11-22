package oop.driver.transport;

import com.sun.jdi.connect.Transport;


public abstract class Driver<T extends Transport>  {

    private final String fullName;

    private final String category;

    private final int drivinExperience;

    private final T car;

    protected Driver(String fullName, String category, int drivinExperience, T car) {
        this.fullName = fullName;
        this.category = category;
        this.drivinExperience = drivinExperience;
        this.car = car;

    }

    public void startMovement() {
        System.out.printf("Driver %s started moving", this.fullName);
        this.car.startMovement();
    }
    public void stopMovement() {
        System.out.printf("Driver %s stop moving", this.fullName);
        this.car.stopMovement();
    }
    public void refill() {
        System.out.printf("Driver %s refilling the %s %s",
                this.fullName, this.car.getClass(), this.car());
    }




    public String getFullName() {
        return fullName;
    }

    public String getCategory() {
        return category;
    }

    public int getDrivingExperience() {
        return drivinExperience;
    }

    @Override
    public String toString() {
        return String.format(
                "Водитель %s управляет автомобилем %s %s и участвуют в заезде",
                this.fullName,this.car.getBrand(),this.car.getModel());
    }
}
