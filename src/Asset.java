public class Asset {
    private String description;
    private String dateAcquired;
    private double originalCost;

    public Asset(String desc, String date, double cost) {
        this.description = desc;
        this.dateAcquired = date;
        this.originalCost = cost;
    }

    public String getDescription() { return description; }
    public String getDateAcquired() { return dateAcquired; }
    public double getOriginalCost() { return originalCost; }

    public double getValue() { return originalCost; } // default
}
