
class ArrayEx {
	
	public static void main(String args[]) {

        double[] salaries = {85000, 100000, 120000, 150000, 95000, 200000};

        double totalSalary = 0;
        double totalTax = 0;

        System.out.println("Salary\t\tMonth Tax\tNet Salary");

        for (int i = 0; i < salaries.length; i++) {
            double salary = salaries[i];
            double tax = 0;

            
            if (salary > 100000) {
                tax = salary * 0.18;
            }

            double netSalary = salary - tax;

            totalSalary += salary;
            totalTax += tax;

            System.out.println(salary + "\t\t" + tax + "\t\t" + netSalary);
        }

        System.out.println("---------------------------------------------");
        System.out.println("Total Salary = " + totalSalary);
        System.out.println("Total Tax    = " + totalTax);
		
	}
}