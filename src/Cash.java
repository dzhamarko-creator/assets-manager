public class Cash extends Asset {
    public Cash(String desc, String date, double cost) {
        super(desc, date, cost);
    }

    @Override
    public double getValue() {
        return getOriginalCost();
    }
}