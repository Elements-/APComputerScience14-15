public abstract class Vehicle {

    private double mpg;
    private double fuel;
    private double mileage;
    private String name;

    public Vehicle(double mpg, double fuel, double mileage, String name) {
        this.mpg = mpg;
        this.fuel = fuel;
        this.mileage = mileage;
        this.name = name;
    }

    public Vehicle() {
        this.mpg = 0;
        this.fuel = 0;
        this.mileage = 0;
        this.name = "New Vehicle";
    }

    public abstract boolean moveDistance(double miles);

    public void moveOneMile() {
        if((fuel - 1/mpg) > 0) {
            fuel -= 1 / mpg;
            mileage++;
        }
    }

    public String toString() {
        return name + " >> MPG: " + mpg + " Fuel: " + (int)fuel + " Mileage: " + mileage;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
