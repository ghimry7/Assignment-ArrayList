package com.monocept.test;

import java.util.ArrayList;

import com.monocept.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeTest empTest = new EmployeeTest();
		Employee e1 = new Employee(101, "Gagan", 569863);
		Employee e2 = new Employee(102, "Harsh", 236985);
		Employee e3 = new Employee(103, "Patil", 698563);
		Employee e4 = new Employee(104, "Dep", 569874);
		Employee e5 = new Employee(105, "Latum", 789652);

		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		
		System.out.println("Ascending Sort:");

		ArrayList<Employee> ascSortEmp = empTest.ascSort(employees);

		for (Employee emp : ascSortEmp) {
			System.out.println(emp);
		}
		
		System.out.println("Decending Sort:");

		ArrayList<Employee> decSortEmp = empTest.decSort(employees);

		for (Employee emp : decSortEmp) {
			System.out.println(emp);
		}

	}

	public ArrayList<Employee> ascSort(ArrayList<Employee> emp) {
		for (int i = 0; i < emp.size(); i++) {
			for (int j = i + 1; j < emp.size(); j++) {
				if (emp.get(i).getSalary() > emp.get(j).getSalary()) {
					Employee temp = emp.get(j);
					emp.remove(j);
					emp.add(j, emp.get(i));
					emp.remove(i);
					emp.add(i, temp);

				}
			}
		}

		return emp;
	}
	
	public ArrayList<Employee> decSort(ArrayList<Employee> emp) {
		for (int i = 0; i < emp.size(); i++) {
			for (int j = i + 1; j < emp.size(); j++) {
				if (emp.get(i).getSalary() < emp.get(j).getSalary()) {
					Employee temp = emp.get(j);
					emp.remove(j);
					emp.add(j, emp.get(i));
					emp.remove(i);
					emp.add(i, temp);

				}
			}
		}

		return emp;
	}

}
