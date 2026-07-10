public class LogicalOp {
    public static void main(String[] args) {
        int a = 12;
        int b = 14;
        int c = 18;

        //Logical AND
        boolean result = (a < b) && (b < c);
        System.out.println("Logical AND:" + result);

        //Logical OR
        boolean result1 = ( a > b) || (b < c);
        System.out.println("Logical OR:" + result1);

        //Logical Not
        System.out.println("Logical Not:" + !result1);
    }
}
