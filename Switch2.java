public class Switch2 {
    public static void main(String[] args) {
        int n = 8;
        String result = "";
        switch (n) {
            case 1 -> result = "Monday";
            case 2 -> result = "Tuesday";
            case 3 -> result = "Wednesday";
            case 4 -> result = "Thursday";
            case 5 -> result = "Friday";
            case 6 -> result = "Saturday";
            case 7 -> result = "Sunday";
            default -> 
                System.out.println("Enter a valid number between 1 and 7");
                
            }
            System.out.println(result);
        
        
    }
}
            