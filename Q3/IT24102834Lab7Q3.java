import java.util.Scanner;

public class IT24102834Lab7Q3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalDiscount = 0; // To track total discount given

        // Loop for 5 customers
        for (int i = 1; i <= 5; i++) {
			System.out.println("Customer " +i);
            System.out.print("Enter the total bill amount : "  );
            double billAmount = scanner.nextDouble();  // Read the total bill amount

            System.out.print("Enter the mode of payment (C/c for cash, O/o for other):"  );
            char paymentMode = scanner.next().charAt(0);  // Read the payment mode

            if (paymentMode == 'C' || paymentMode == 'c') {
                // Apply 5% discount if payment is by cash
                double discount = billAmount * 0.05;
                double amountToPay = billAmount - discount;
                totalDiscount += discount;  // Accumulate discount for all customers

                System.out.println("Discount applied: Rs " + discount);
                System.out.println("Amount to be paid: Rs " + amountToPay);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                // No discount for other payment modes
                System.out.println("No discount applicable.");
                System.out.println("Amount to be paid: Rs " + billAmount);
            } else {
                // Invalid payment mode
                System.out.println("Payment Mode is Not Valid");
            }
        }

       
    }
}
