public class Main {
    public static void main(String[] args) {
        Building one = new Apartment(50);
        Building two = new Apartment(30);

        System.out.println(one.compareTo(two));
    }
}