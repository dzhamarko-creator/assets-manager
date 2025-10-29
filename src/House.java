public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String desc, String date, double cost,
                 String address, int condition, int squareFoot, int lotSize) {
        super(desc, date, cost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() { return address; }

    @Override
    public double getValue() {
        double rate;
        if (condition == 1) rate = 180;
        else if (condition == 2) rate = 130;
        else if (condition == 3) rate = 90;
        else rate = 80;

        double value = (rate * squareFoot) + (0.25 * lotSize);
        return value;
    }
}