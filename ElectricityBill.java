import java.util.Scanner;

class ElectricityBill {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Your Units: ");
		int units = scan.nextInt();
		
		double bill = 0;
		
		if(units > 0) {
			if(units <= 90){
				bill = units * 3.00;
			}
			else if(units <= 150){
				bill = (90 * 3.00) + ((units - 90) * 5.00);
			}
			else if(units <= 300){
				bill = (90 * 3.00) + (60 * 5.00) + ((units - 150) * 10.00);
			}
			else{
				bill = (90 * 3.00) + (60 * 5.00) + (150 * 10.00) + ((units - 300) * 10.00);
			}

			System.out.println("Total Amount: " + bill);
		}
		else {
			System.out.println("Enter Correct Unit.");
		}
	}
}