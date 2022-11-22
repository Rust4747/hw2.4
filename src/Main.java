import oop.driver.transport.Car;
import oop.driver.transport.DriverB;

public class Main {
    public static void main(String[] args) {


        Car bmw = new Car( "bmw", "m5", 4.0f);
        DriverB jon = new DriverB("jon", "B", 13, bmw);
        System.out.println(jon);


    }
}