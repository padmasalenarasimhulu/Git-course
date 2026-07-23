public class ConstructorOverloading {
    int Rollno;
    String Name;
    public ConstructorOverloading() {
        System.out.println("Default constructor called");
    }
    public ConstructorOverloading(int rollno, String name) {
        this.Rollno = rollno;
        this.Name = name;
        System.out.println("Parameterized constructor called");
    }
}
class Main {
    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(101, "John");
        System.out.println("Roll No: " + obj1.Rollno + ", Name: " + obj1.Name);
        System.out.println("Roll No: " + obj2.Rollno + ", Name: " + obj2.Name);
    }
}
