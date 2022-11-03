public class Apartment extends Building{
    double costPerFloor;
    double totalCost;

    public Apartment(double newCostPerFloor) {
        costPerFloor = newCostPerFloor;
        totalCost = this.getTotalCost();
    }

    public double getCostPerFloor() {
        return costPerFloor;
    }

    public double getTotalCost() {
        return (double)super.getFloors() + costPerFloor;
    }

    public double calcCost(double getTax) {
        return (getTax+1)*totalCost;
    }

    public int compareTo(Building building) {
        return (int)(this.calcCost(tax) - building.calcCost(tax));
    }
}
