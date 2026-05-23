package application;

import java.util.Locale;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, employeeId;
		double employeeSalary;
		String employeeName;
		
		
		System.out.print("How many employees will be registered? ");
		n = sc.nextInt();
		System.out.println(); 
		
		List<Employee> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++)  {
			System.out.println("Emplyoee #" + (1 + i) + ":");
			System.out.print("ID: ");
			employeeId = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			employeeName = sc.nextLine();
			System.out.print("Salary: ");
			employeeSalary = sc.nextDouble();
			list.add(new Employee(employeeId, employeeName, employeeSalary));
			System.out.println();
		}
		
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		Employee found = null;
		
		for (int i = 0; i <list.size(); i++) {
			if (id == list.get(i).getId()) {
			found = list.get(i);
			}
		}
		if (found == null) {
			System.out.println("This id does not exist!");
		} else {
		System.out.print("Enter the percentage: ");
			double porc = sc.nextDouble();
			found.increaseSalary(porc);
			}
		
		System.out.println();
		for (int i = 0; i <list.size(); i++) {
			System.out.print(list.get(i).getId() + ", " + list.get(i).getName() + ", " + String.format("%.2f%n", list.get(i).getSalary()));
		}
		sc.close();
	}

}
