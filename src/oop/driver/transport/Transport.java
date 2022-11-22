package oop.driver.transport;

public abstract class Transport {

    public String brand;

    public String model;

    private final float  enginevolume;



    public Transport(String brand, String model, float enginevolume) {
        this.brand = brand;
        this.model = model;
        this.enginevolume = enginevolume;
    }

    public abstract void startMovement();

    public abstract void stopMovement();


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEnginevolume() {
        return enginevolume;
    }

}
