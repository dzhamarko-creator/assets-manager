public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String desc, String date, double cost,
                   String makeModel, int year, int odometer) {
        super(desc, date, cost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() { return makeModel; }
    public int getYear() { return year; }

    @Override
    public double getValue() {
        int age = 2025 - year;
        double value;

        if (age > 10) value = 1000;
        else if (age <= 3) value = getOriginalCost() * (1 - 0.03 * age);
        else if (age <= 6) value = getOriginalCost() * (1 - 0.06 * age);
        else value = getOriginalCost() * (1 - 0.08 * age);

        if (odometer > 100000 &&
                !(makeModel.toLowerCase().contains("honda") ||
                        makeModel.toLowerCase().contains("toyota"))) {
            value = value * 0.75;
        }

        return value;
    }
}