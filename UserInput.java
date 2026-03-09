import java.util.Scanner;

class UserInput {
	public static void main(String args[]) {
		/*
		String name="";
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		name=scan.next();
		System.out.println("Your name is: " + name);
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Your First Name: ");
		String fname = scan.next();
		
		System.out.print("Enter Your Last Name: ");
		String lname = scan.next();
		
		System.out.print("Enter Your Grade: ");
		String grade = scan.next();
		
		System.out.print("Enter Your DOB: ");
		String dob = scan.next();
		
		System.out.println("**************************");
		System.out.println("Student Information");
		System.out.println("**************************");
		System.out.println("First Name:\t" + fname);
		System.out.println("Last Name:\t" + lname);
		System.out.println("Grade:\t" + grade);
		System.out.println("Date Of Birth:\t" + dob);
		System.out.println("**************************");
		System.out.println("**************************");
	}
}