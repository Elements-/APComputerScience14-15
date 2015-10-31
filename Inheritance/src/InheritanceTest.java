public class InheritanceTest {
    public static void main(String[] args) {
        Car c = new Car();
        c.setFuel(30);
        c.setDoors(4);
        c.setMileage(25000);
        c.setMpg(3);
        System.out.println(c);
        c.moveDistance(100);
        System.out.println(c);
        BMWM4 bmw = new BMWM4(30, 100, 31000, "Cam's Car", 4, 120, true, 5);
        System.out.println(bmw);
        bmw.moveDistance(10);
        bmw.upgrade();
        System.out.println(bmw);
    }
}
