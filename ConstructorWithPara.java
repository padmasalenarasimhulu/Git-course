public class ConstructorWithPara {
    public ConstructorWithPara(int a) {
        
        System.out.println("Constructor called with parameter: " + a);
    }
}
class Main {
    public static void main(String[] args) {
        ConstructorWithPara obj = new ConstructorWithPara(10);
    }
}
