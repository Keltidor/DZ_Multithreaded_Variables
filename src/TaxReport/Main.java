package TaxReport;

import java.util.concurrent.atomic.LongAdder;

public class Main {
    public static void main(String[] args) {
        Shop shop1 = new Shop(5, 1000);
        Shop shop2 = new Shop(10, 1500);
        Shop shop3 = new Shop(15, 2000);

        LongAdder longAdder = new LongAdder();

        Thread shop1Thread = new Thread(() -> shop1.getProfit().forEach(longAdder::add));
        Thread shop2Thread = new Thread(() -> shop2.getProfit().forEach(longAdder::add));
        Thread shop3Thread = new Thread(() -> shop3.getProfit().forEach(longAdder::add));

        shop1Thread.start();
        shop2Thread.start();
        shop3Thread.start();

        try {
            shop1Thread.join();
            shop2Thread.join();
            shop3Thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Общая выручка: " + longAdder.sum());
    }
}