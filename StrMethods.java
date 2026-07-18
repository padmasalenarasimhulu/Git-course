import java.util.Scanner;
public class StrMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        // length() method
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // charAt() method
        System.out.print("Enter an index to get the character at that position: ");
        int index = sc.nextInt();
        if (index >= 0 && index < length) {
            char ch = str.charAt(index);
            System.out.println("Character at index " + index + ": " + ch);
        } else {
            System.out.println("Index out of bounds.");
        }

        // substring() method
        System.out.print("Substring from index 2 to 5: " + str.substring(2, 5));

        // toUpperCase() method
        String upperStr = str.toUpperCase();
        System.out.println("\nString in uppercase: " + upperStr);

        // toLowerCase() method
        String lowerStr = str.toLowerCase();
        System.out.println("String in lowercase: " + lowerStr);

        // trim() method
        String trimmedStr = str.trim();
        System.out.println("String after trimming: " + trimmedStr);

        //replace() method
        System.out.print("Enter a character to replace: ");
        char oldChar = sc.next().charAt(0);
        System.out.print("Enter a new character: ");
        char newChar = sc.next().charAt(0);
        String replacedStr = str.replace(oldChar, newChar);
        System.out.println("String after replacing '" + oldChar + "' with '" + newChar + "': " + replacedStr);
        

        sc.close();
    }
}
