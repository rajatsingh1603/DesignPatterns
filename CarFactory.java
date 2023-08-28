public class CarFactory {
    public static Car getPrice(String name) {
        if (name == "harrier") {
            return new Harrier();
        } else {
            return new Porsche();
        }
    }
}
