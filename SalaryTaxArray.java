import java.util.Scanner;

public class SalaryTaxArray {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        double salary[] = new double[12];
        double totalNetSalary = 0;
        double totalTax = 0;

        for (int i = 0; i < 12; i++) {
            System.out.print("Enter salary for month " + (i + 1) + ": ");
            salary[i] = scan.nextDouble();
        }

        System.out.println("Month\tSalary\t\tTax\t\tNet Salary");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < 12; i++) {

            double tax = 0;

            if (salary[i] > 100000) {
                tax = salary[i] * 0.18;
            }

            double netSalary = salary[i] - tax;

            totalNetSalary += netSalary;
            totalTax += tax;

            System.out.println((i + 1) + "\t" + salary[i] + "\t\t" + tax + "\t\t" + netSalary);
        }

        System.out.println("------------------------------------------------");
        System.out.println("Total Tax : " + totalTax);
        System.out.println("Total Net Salary : " + totalNetSalary);
        
    }
}