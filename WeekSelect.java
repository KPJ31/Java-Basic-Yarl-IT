import java.util.Scanner;

class WeekSelect {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter a number to select a day: ");
		int week = scan.nextInt();
		
		if(1 == week || 2 == week || 3 == week || 4 == week || 5 == week || 6 == week || 7 == week) {
			if(1 == week) {
				System.out.println("Monday");
			}
			else if(2 == week) {
				System.out.println("Tuesday");
			}
			else if(3 == week) {
				System.out.println("Wednesday");
			}
			else if(4 == week) {
				System.out.println("Thursday");
			}
			else if(5 == week) {
				System.out.println("Friday");
			}
			else if(6 == week) {
				System.out.println("Saturday");
			}
			else {
				System.out.println("Sunday");
			}
		}
		else {
			System.out.println("A week has only seven days.");
		}
	}
}