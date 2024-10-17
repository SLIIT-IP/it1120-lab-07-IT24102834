public class IT24102834Lab7Q2A{
    public static void main(String[] args) {
        // Outer loop for 4 rows
        for (int row = 1; row <= 4; row++) {
            // Inner loop for 5 dollar symbols in each row
            for (int col = 1; col <= 5; col++) {
                System.out.print("$ "); // Print dollar symbol followed by space
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
