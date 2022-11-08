public class Main {
    public static void main(String[] args) {
        Building one = new OfficeSpace(15.5, 20);

        one.calcCost(12.5);
        System.out.println(one.toString());
    }
}