package inheritance.challenge;

public class Fusca extends Car {
    public Fusca() {
        super("Fusca", "Volkswagen", 20);
    }

    @Override
    protected void accelerate() {
        int newAccelerationValue = super.getCurrentSpeed() + 10;
        super.setCurrentSpeed(newAccelerationValue);
    }

    @Override
    protected void brakeSlowly() {
        int newBrakeSlowlyValue = super.getCurrentSpeed() - 5;

        if (super.getCurrentSpeed() > 0) {
            super.setCurrentSpeed(newBrakeSlowlyValue);
        } else {
            throw new IllegalArgumentException("Speed cannot be negative");
        }
    }
}
