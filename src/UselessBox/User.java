package UselessBox;

public class User extends Thread {

    @Override
    public void run() {
        final int SLEEP_TIME = 2500;
        final int NUMBER_OF_ITERATIONS = 7;
        Tumbler tumbler = Tumbler.getTumbler();
        for (int i = 0; i < NUMBER_OF_ITERATIONS; i++) {
            tumbler.setTumblerCondition(true);
            System.out.println("Коробку открыли");
            try {
                Thread.sleep(SLEEP_TIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Коробкой перестали пользоваться");
    }
}
