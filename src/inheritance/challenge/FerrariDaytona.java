package inheritance.challenge;

public class FerrariDaytona extends Car {
    public FerrariDaytona() {
        super("Ferrari Daytona", "Ferrari", 300);
    }

    @Override
    protected void accelerate() {
        int newAccelerationValue = super.getCurrentSpeed() + 100;
        super.setCurrentSpeed(newAccelerationValue);
    }

    @Override
    protected void brakeSlowly() {
        int newBrakeSlowlyValue = super.getCurrentSpeed() - 200;

        if (super.getCurrentSpeed() > 0) {
            super.setCurrentSpeed(newBrakeSlowlyValue);
        } else {
            throw new IllegalArgumentException("Speed cannot be negative");
        }
    }
}
