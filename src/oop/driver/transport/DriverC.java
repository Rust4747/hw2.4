package oop.driver.transport;

import oop.driver.transport.Driver;

public class DriverC extends Driver<Truck> {
    public DriverC(String fullName,  String category, int drivinExperience, Truck car) {
        super(fullName,"C", drivinExperience, car);
    }
}
