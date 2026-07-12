
 public class MethodOverLoad{
    public static void main(String[] args){
        int num1 = 12;
        int num2 = 16;
        int num3 = 25;
        MethodOverloading m = new MethodOverloading();
        int result1 = m.add(num1 , num3);
        System.out.println("The sum of " + num1 + " and " + num3 + " is: " + result1);

        int result2 = m.add(num1 , num2 , num3);
        System.out.println("The sum of " + num1 + " , " + num2 + " and " + num3 + " is: " + result2);

    }
}

 class MethodOverloading {
    public int add(int a , int b){
        System.out.println("Method1 of MethodOverloading class");
        return a+b;
    }
    public int add(int a, int b, int c){
        System.out.println("Method2 of MethodOverloading class");
        return a+b+c;
    }
}
