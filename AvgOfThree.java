import java.util.Scanner;
public class AvgOfThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3;
        double average = sum / 3.0;
        System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is: " + average);
        

    }
}
