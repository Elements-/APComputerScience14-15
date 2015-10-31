public class BMWM4 extends Car {

    private boolean wingUp;
    private int inchesFromGround;

    public BMWM4(double mpg, double fuel, double mileage, String name, int doors, double maxSpeed, boolean wingUp, int inchesFromGround) {
        super(mpg, fuel, mileage, name, doors, maxSpeed);
        this.wingUp = wingUp;
        this.inchesFromGround = inchesFromGround;
    }

    public BMWM4() {
        this.wingUp = false;
        this.inchesFromGround = 5;
    }

    public void upgrade() {
        wingUp = true;
        inchesFromGround = 2;
        super.upgrade();
    }

    public void downgrade() {
        wingUp = false;
        inchesFromGround = 5;
        super.downgrade();
    }

    public String toString() {
        return super.toString() + " Wing: " + wingUp + " Height: " + inchesFromGround;
    }

    public boolean equals(BMWM4 otherBMWM4) {
        if (
                otherBMWM4.getDoors() == super.getDoors() &&
                        otherBMWM4.getMaxSpeed() == super.getMaxSpeed() &&
                        otherBMWM4.getFuel() == super.getFuel() &&
                        otherBMWM4.getMpg() == super.getMpg() &&
                        otherBMWM4.getMileage() == super.getMileage() &&
                        otherBMWM4.isWingUp() == this.isWingUp() &&
                        otherBMWM4.getInchesFromGround() == this.getInchesFromGround()
                ) {
            return true;
        }
        return false;
    }

    public boolean isWingUp() {
        return wingUp;
    }

    public void setWingUp(boolean wingUp) {
        this.wingUp = wingUp;
    }

    public int getInchesFromGround() {
        return inchesFromGround;
    }

    public void setInchesFromGround(int inchesFromGround) {
        this.inchesFromGround = inchesFromGround;
    }
}
