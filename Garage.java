public class Garage implements interfaceCar{
    Car car;

    public Garage(Car car) {
        this.car = car;
    }

    public void showCar() {
        System.out.println(car);
    }

    public static void main(String[] args) {
        new Garage(new Car("BMW", "GT05", 1000000, "Blue", "Diesel", true)).showCar();
        new Garage(new Car("Mercedes", "GT05", 4000000, "White", "Diesel", true)).showCar();
    }

    @Override
    public void speed() {
        System.out.println("Speed is 76km per hour");
        
    }

    @Override
    public void meow() {
        System.out.println("meow meow");
        
    }
}
