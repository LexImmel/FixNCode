public class ServiceStation {
    public void check(WheeledTransport wheeledTransport) {
        wheeledTransport.check();
    }

    public void test(WheeledTransport wheeledTransport) {
        System.out.println("Обслуживаем " + wheeledTransport.getModelName());
        for (int i = 0; i < wheeledTransport.getWheelsCount(); i++) {
            wheeledTransport.updateTyre();
        }
    }
}