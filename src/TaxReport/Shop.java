package TaxReport;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shop {
    Random random = new Random();
    private List<Integer> profit;

    public Shop(int size, int maxValue) {
        profit = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            profit.add(random.nextInt(maxValue));
        }

        System.out.println("Выручка магазина: " + profit);//выведем для проверки
    }

    public List<Integer> getProfit() {
        return profit;
    }
}
