package com.imp;

import java.util.HashMap;
import java.util.Map;

public class SameEmployee {
	public void addEmployees(Employee[] emps) {
		HashMap<Employee, Integer> map=new HashMap<>();
		int i=0;
		for(Employee emp: emps) {
			map.put(emp, emp.getSalary());
		}
		for(Map.Entry<Employee, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey().getId() +"::"+entry.getKey().getName()+"::"+entry.getKey().getSalary()+"-->"+entry.getValue());
		}
	}
	public static void main(String[] args) {
		SameEmployee obj=new SameEmployee();
		Employee emp1=new Employee(1, "Rajesh", 10);
		Employee emp2=new Employee(2, "Rajesh", 20);
		Employee emp3=new Employee(3, "Rajesh", 30);
		Employee emp4=new Employee(1, "Rajesh", 40);
		Employee emp5=new Employee(3, "Rajesh", 50);
		emp5.setSalary(60);
		Employee[] arr= {emp1,emp2, emp3, emp4, emp5};
		obj.addEmployees(arr);
	}

}
class Employee{
	private int id;
	private String name;
	private int salary;
	public Employee(int id, String name, int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		System.out.println(Integer.hashCode(this.id));
		return Integer.hashCode(this.id);
	}
	@Override
	public boolean equals(Object emp) {
		if(this==emp) return true;
		if(this.getClass()!=emp.getClass() || emp==null) return false;
		Employee employee=(Employee)emp;
		System.out.println(employee.id==this.id);
		return employee.id==this.id;
	}
}
