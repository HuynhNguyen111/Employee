package com.employee;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee(0, null, 0);
		emp.display();
		emp.read();
		emp.display();
		System.out.println(Employee.count);
		Employee.increment();
		System.out.println(Employee.count);
	}

}
