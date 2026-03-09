import java.util.Scanner;

class PhoneNum {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter Your Phone Number Code: ");
		int phoneCode = scan.nextInt();
		
		if(70 == phoneCode || 75 == phoneCode || 77 == phoneCode || 78 == phoneCode) {
			if(70 == phoneCode) {
				System.out.println("You have Mobital SIM");
			}
			else if(75 == phoneCode) {
				System.out.println("You have Airtel SIM");
			}
			else if(77 == phoneCode) {
				System.out.println("You have Dialog SIM");
			}
			else {
				System.out.println("You have Hutch SIM");
			}
		}
		else {
			System.out.println("Invalid Phone Number Code");
		}
	}
}