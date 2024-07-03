package inheritance.challenge;

public class Car {
    private final String name;
    private final String brand;
    private Integer currentSpeed;

    protected Car(String name, String brand, Integer currentSpeed) {
        this.name = name;
        this.brand = brand;
        this.currentSpeed = currentSpeed;
    }

    protected String getName() {
        return name;
    }

    protected String getBrand() {
        return brand;
    }

    protected Integer getCurrentSpeed() {
        return currentSpeed;
    }

    protected void setCurrentSpeed(Integer currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    protected void accelerate() {
        this.currentSpeed += 5;
    }

    protected void brakeSlowly() {
        this.currentSpeed -= 2;
    }

    protected void fullyBrake() {
        this.currentSpeed = 0;
    }
}
