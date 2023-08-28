public class Main {
    public static void main(String[] args) {
        Car c = CarFactory.getPrice("porsche");
        System.out.println(c.price());
    }
}
