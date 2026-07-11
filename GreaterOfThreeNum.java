public class GreaterOfThreeNum {
    public static void main(String[] args){
        int num1 = 14;
        int num2 = 25;
        int num3 = 18;

        if (num1 > num2 && num1 > num3){
            System.out.println(num1 + " is greter number");
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println(num2 + " is greater number");

        }
        else {
            System.out.println(num3 + " is greater number");
        }
    }
} 
