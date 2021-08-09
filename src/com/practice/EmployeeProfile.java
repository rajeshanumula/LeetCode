package com.practice;

 abstract class Employee1{
//	private int salary;
//	private String grade;
	abstract void setSalary(int salary);
	abstract int getSalary();
	abstract void setGrade(String grade);
	abstract String getGrade();
	public void label() {
		System.out.println("Employee's Data");
		System.out.println("GRADE :"+getGrade());
		System.out.println("SALARY :"+getSalary());
	}
}
 class Engineer extends Employee1{
		private int salary;
		private String grade;
		
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public String getGrade() {
			return grade;
		}
		public void setGrade(String grade) {
			this.grade = grade;
		}
 }
 class Manager extends Employee1{
		private int salary;
		private String grade;
		
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public String getGrade() {
			return grade;
		}
		public void setGrade(String grade) {
			this.grade = grade;
		}
}
 
public class EmployeeProfile {
	
	public static void main(String[] args) {
		Employee1 employee1=new Manager();
		employee1.setSalary(50000);
		employee1.setGrade("A");
		employee1.label();
		Employee1 employee2=new Engineer();
		employee1.setSalary(20000);
		employee1.setGrade("B");
		employee1.label();
	}

}
