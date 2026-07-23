public class ConstructorChaining {
    public ConstructorChaining() {
        this(10); 
        System.out.println("Default constructor called");
    }
    public ConstructorChaining(int num) {
        this(num, "Hello"); 
        System.out.println("Parameterized constructor with int called: " + num);
    }
    public ConstructorChaining(int num, String str) {
        System.out.println("Parameterized constructor with int and String called: " + num + ", " + str);
    }

}
class Main {
    public static void main(String[] args) {
        ConstructorChaining obj = new ConstructorChaining();
    }
}