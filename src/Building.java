public abstract class Building implements Comparable<Building> {
    int floors;
    double tax;

    public Building() {
        floors = 5;
        tax = 0.05;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int newFloors) {
        floors = newFloors;
    }

    public abstract double calcCost(double getTax);

    public abstract int compareTo(Building building);

    public String toString() {
        return ("Building Cost: " + calcCost(tax));
    }
}
