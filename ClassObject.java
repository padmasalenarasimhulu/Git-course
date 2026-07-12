 class Calculator{
    public int add(int a , int b){
        System.out.println("Method of Calculator class");
        return a + b;
    }
}

class ClassObject {
    public static void main(String[] args){
        int num1 = 12;
        int num2 = 13;
        Calculator c = new Calculator();
        int result = c.add(num1 , num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);

    }
}
