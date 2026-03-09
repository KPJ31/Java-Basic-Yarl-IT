import java.util.Scanner;

class Marks {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter Your Marks: ");
		int marks = scan.nextInt();
		
		if(0>=marks && 100<=marks) {
			System.out.println("Enter Correct Marks.");
		}
		else {
			
			if(75<=marks && 100>=marks) {
				System.out.println("A");
			}
			else if(65<=marks && 74>=marks) {
				System.out.println("B");
			}
			else if(55<=marks && 64>=marks) {
				System.out.println("C");
			}
			else if(45<=marks && 54>=marks) {
				System.out.println("D");
			}
			else {
				System.out.println("F");
			}
		}
	}
}