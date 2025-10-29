import java.util.ArrayList;

public class AssetManager {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        // create houses
        House house1 = new House("My House", "2025", 350000, "123 Main St", 1, 1800, 4000);
        House house2 = new House("Vacation Home", "2018", 300000, "999 Lake Rd", 2, 2000, 5000);

        // create vehicles
        Vehicle car1 = new Vehicle("My Car", "2022", 30000, "BMW", 2022, 33000);
        Vehicle truck1 = new Vehicle("Tom’s Truck", "2016", 40000, "Ford F150", 2015, 120000);

        assets.add(house1);
        assets.add(house2);
        assets.add(car1);
        assets.add(truck1);

        for (Asset a : assets) {
            System.out.println("-------------------");
            System.out.println("Name: " + a.getDescription());
            System.out.println("Date: " + a.getDateAcquired());
            System.out.println("Cost: " + a.getOriginalCost());
            System.out.println("Value: " + a.getValue());

            if (a instanceof House) {
                House h = (House) a;
                System.out.println("Address: " + h.getAddress());
            } else if (a instanceof Vehicle) {
                Vehicle v = (Vehicle) a;
                System.out.println("Year/Model: " + v.getYear() + " " + v.getMakeModel());
            }
        }
    }
}