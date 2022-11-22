package oop.driver.transport;

import oop.driver.transport.Driver;

public class DriverB extends Driver<Car> {


    public DriverB(String fullName, String category, int drivinExperience, Car car) {
        super(fullName, "B",  drivinExperience, car);
    }
}
