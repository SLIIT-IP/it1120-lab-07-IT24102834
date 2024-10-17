import java.util.Scanner; 


public class IT24102834Lab7Q1B{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Loop for 3 students
        for (int student = 1; student <= 3; student++) {
            // Step 2: Ask for and store marks for four subjects in a single line
            System.out.println("Student " + student);
			System.out.print("Enter marks:"  );
            
            // Read all four marks in one line
            int mark1 = input.nextInt();
            int mark2 = input.nextInt();
            int mark3 = input.nextInt();
            int mark4 = input.nextInt();
            
            
            int total = mark1 + mark2 + mark3 + mark4;
            double average = total / 4.0; // Calculate average (using 4.0 to ensure floating-point division)

            // Step 4: Use if-else to determine the grade based on the average
            String grade; // Variable to store the grade
            if (average >= 75 && average <= 100) {
                grade = "Distinction";
            } else if (average >= 50 && average < 75) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }
			

            // Step 5: Display the result for the current student
            System.out.println("Average is : " + average);
			System.out.println("Overall Grade is : " + grade);
        }

        // Close the Scanner
        input.close();
    }
}
