public class Car extends Vehicle {

    private int doors;
    private double maxSpeed;

    public Car(double mpg, double fuel, double mileage, String name, int doors, double maxSpeed) {
        super(mpg, fuel, mileage, name);
        this.doors = doors;
        this.maxSpeed = maxSpeed;
    }

    public Car() {
        this.doors = 2;
        this.maxSpeed = 100;
    }

    public boolean moveDistance(double miles) {
        while(miles > 0) {
            super.moveOneMile();
            miles -= 1;
        }
        return true;
    }

    public void oilChange() {
        super.setMileage(0);
    }

    public void upgrade() {
        maxSpeed += 10;
    }
    public void downgrade() {
        maxSpeed -= 10;
    }

    public String toString() {
        return super.toString() + " Doors: " + doors + " MaxSpeed: " + maxSpeed;
    }

    public boolean equals(Car otherCar) {
        if(
                otherCar.getDoors() == this.getDoors() &&
                otherCar.getMaxSpeed() == this.getMaxSpeed() &&
                otherCar.getFuel() == super.getFuel() &&
                otherCar.getMpg() == super.getMpg() &&
                otherCar.getMileage() == super.getMileage()
                ) {
            return true;
        }
        return false;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
