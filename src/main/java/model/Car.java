package model;

public class Car {
    private String model;
    private String license;
    private String owner;

    public Car(String model, String license, String owner) {
        this.model = model;
        this.license = license;
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public String getLicense() {
        return license;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString(){
        return "model: " + model + " license: " + license + " owner: " + owner;
    }
}

