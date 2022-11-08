public class OfficeSpace extends Building {
    double costPerFloor;
    double totalCost;
    double sqrftPerFloor;

    public OfficeSpace(double newCostPerFloor, double newSqrftPerFloor) {
        costPerFloor = newCostPerFloor;
        totalCost = this.getTotalCost();
        sqrftPerFloor = newSqrftPerFloor;
    }

    public double getCostPerFloor() {
        return costPerFloor;
    }

    public double getTotalCost() {
        return (double)(((super.getFloors()*costPerFloor) + super.tax) + (sqrftPerFloor * 2.75));
    }

    public double calcCost(double getTax) {
        return (getTax+1)*totalCost;
    }

    public int compareTo(Building building) {
        return (int)(this.calcCost(super.tax) - building.calcCost(super.tax));
    }
}
