package application2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities2.Employee2;
import entities2.OutsourcedEmployee;


public class ProgramEmployee2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee2> list = new ArrayList<>();

		System.out.println("Enter the number of employees: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.println("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("value per hour: ");
			double valuePerHour = sc.nextDouble();

			if (ch == 'y') {
				System.out.println("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				Employee2 emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
			} else {
				list.add(new Employee2(name, hours, valuePerHour));
			}

		}
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee2 emp : list) {
			System.out.println(emp.getName() + "- $ " + String.format("%.2f", emp.payment()));

		}

		sc.close();

	}

}
