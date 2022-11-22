package oop.driver.transport;

import oop.driver.transport.Driver;

public class DriverD extends Driver<Bus> {
    public DriverD(String fullName, String category, int drivinExperience, Bus car) {
        super(fullName, "D", drivinExperience, car);
    }
}
