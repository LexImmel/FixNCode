public class Main {
    public static void main(String[] args) {

        final Bicycle bicycle = new Bicycle("Bicycle1", 4);
        final Bicycle bicycle2 = new Bicycle("bicycle2", 4);

        final Car car = new Car("Corvette", 4);
        final Car car2 = new Car("Toyota", 4);

        final Truck truck = new Truck("Truck1", 8);
        final Truck truck2 = new Truck("Truck2", 8);

        final Checkable[] wheeledTransports = {car, car2, truck, truck2, bicycle, bicycle2};
        for (Checkable wheeledTransport : wheeledTransports) {
            wheeledTransport.check();
        }
    }
}