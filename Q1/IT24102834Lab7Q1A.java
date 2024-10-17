import java.util.Scanner;

public class IT24102834Lab7Q1A{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
	
		
	System.out.println("Enter marks for four subjects:");
	System.out.print("Enter Susbject Mark1:"  );
	int mark1 = scanner.nextInt();
	
	System.out.print("Enter Susbject Mark2:"  );
	int mark2 = scanner.nextInt();
	
	System.out.print("Enter Susbject Mark3:"  );
	int mark3 = scanner.nextInt();
	
	System.out.print("Enter Susbject Mark4:"  );
	int mark4 = scanner.nextInt();
	
	int total = mark1 + mark2 + mark3 + mark4;
	double average = total/4.0;
	System.out.println("Average is : " + average);
	
	if (average >=75 && average<=100){
		System.out.println("Overall Grade is : Distinction");
	}
	else if (average <75 && average>=50){
		System.out.println("Overall Grade is : Credit");
	}
	else {
		System.out.println("Overall Grade is : Fail");
	}
    	
	
	}
}
	