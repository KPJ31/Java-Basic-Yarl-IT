import java.util.Scanner;

class WaterBill {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter Your liters: ");
		double liters = scan.nextInt();
		
		if(0<liters) {

			if(liters <= 1000){
				liters = 500;
			}
			else if(liters <= 5000){
				liters = 500 + ((liters - 1000) * 3.00);
			}
			else if(liters <= 15000){
				liters = 500 + (4000 * 3.00) + ((liters - 5000) * 8.00);
			}
			else{
				liters = (500 + (4000 * 3.00) + (10000 * 8.00) + ((liters - 15000) * 10.00))*0.05;
			}

			System.out.println("Total Bill: " + liters);
		}
		else {
			System.out.println("No need to Pay");
		}
	}
}