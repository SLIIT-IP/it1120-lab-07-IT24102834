public class IT24102834Lab7Q2B{
    public static void main(String[] args) {
        for (int num = 1; num <= 5; num++) {
            System.out.print(num + " - ");
            
            // Inner loop to print stars according to the number
            for (int star = 1; star <= num; star++) {
                System.out.print("* "); 
            }
            
         
            System.out.println();
        }
    }
}