package com.employee;

import java.util.Scanner;

public class Employee {
	//trường thuộc tính
	private int id;
	private String name;
	private double salary;
	//constructor rỗng
	public Employee() {
		id=0;
		name=null;
		salary=0;
	}
	//constructor đầy đủ tham số
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	//getter, setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//read()
	public void read() {
		Scanner sc=new Scanner(System.in);
		System.out.print("id: ");
		this.id=sc.nextInt();
		sc.nextLine();
		System.out.println("name: ");
		this.name=sc.nextLine();
		System.out.println("salary: ");
		this.salary=sc.nextDouble();
	}
	//display()
	public void display() {
		System.out.println("id= "+this.id);
		System.out.println("name= "+this.name);
		System.out.println("salary= "+this.salary);
	}
	//trường tĩnh count
	public static int count;
	// khối tĩnh khởi tạo giá trị count
	static {
		count =0;
	}
	// tăng count lên 1 dv
	public static int increment() {
		return count++;
	}
	

}
