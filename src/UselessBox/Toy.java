package UselessBox;

public class Toy extends Thread {

    @Override
    public void run() {
        Tumbler tumbler = Tumbler.getTumbler();
        Thread thread = Thread.currentThread();
        while (thread.isAlive() && !thread.isInterrupted()) {
            if (tumbler.isTumblerCondition()) {
                tumbler.setTumblerCondition(false);
                System.out.println("Коробка закрылась");
            }
        }
    }
}
