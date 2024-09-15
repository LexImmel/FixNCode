public class Car extends WheeledTransport {


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void check() {
        super.check();
        checkEngine();
    }

    @Override
    public void test(WheeledTransport wheeledTransport) {

    }

}