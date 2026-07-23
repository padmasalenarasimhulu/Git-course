public class ConstructorExp {
    public ConstructorExp() {
        System.out.println("Constructor called");
    }
}
class Main {
    public static void main(String[] args) {
        ConstructorExp obj = new ConstructorExp();
    }
}