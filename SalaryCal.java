import java.util.Scanner;

class SalaryCal {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter Your Salary: ");
		int salary = scan.nextInt();
		
		if(salary>=100000) {
			double tax = salary * 0.18;
			System.out.print("You Must pay tax: " + tax);
		}
		else {
			System.out.println("No tax for your salary");
		}
	}
}