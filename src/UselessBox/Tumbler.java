package UselessBox;

public class Tumbler {

    private static Tumbler tumbler;
    private volatile boolean tumblerCondition;

    public static synchronized Tumbler getTumbler() {
        if (tumbler == null) {
            tumbler = new Tumbler();
        }
        return tumbler;
    }

    private Tumbler() {
        tumblerCondition = false;
    }

    public void setTumblerCondition(boolean tumblerCondition) {
        this.tumblerCondition = tumblerCondition;
    }

    public boolean isTumblerCondition() {
        return tumblerCondition;
    }
}
