public class TypeCasting {
    public static void main(String[] args) {
        //implicit type casting
        byte b = 120;
        int i = b; //byte is automatcally converted to int
        System.out.println("Int value :"+ i);

        //explicit type casting
        int j = 258;
        byte c = (byte) j; // int is eexplicity converted to byte
        System.out.println("Byte value :"+ c);
    }
}
