import java.util.Scanner;

class AgeCal {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter Your Age: ");
		int age = scan.nextInt();
		
		if(0<age && age<122) {
			if(age>=18) {
				System.out.println("Adult");
			}
			else {
				System.out.println("Child");
			}
		}
		else {
			System.out.println("Invalid Age");
		}
	}
}