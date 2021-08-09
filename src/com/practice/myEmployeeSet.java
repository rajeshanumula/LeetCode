package com.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class myEmployeeSet {
	
	class Employee{
		int empId;
		String empName;
		public Employee(int id, String name) {
			this.empId=id;
			this.empName=name;
		}
		
		@Override
		public int hashCode() {
			return this.empName.hashCode();
		}
		@Override
		public boolean  equals(Object e) {
			
			Employee emp=(Employee) e;
			if(emp.empName==this.empName) {
				emp.empId=this.empId;
				return true;
			}
			return false;
		}
	}
	
	public void check(Employee[] list) {
		Set<Employee> set=new HashSet<myEmployeeSet.Employee>();
		for(Employee emp: list) {
			set.add(emp);
		}
		//System.out.println();
	}
	public static void main(String[] args) {
		myEmployeeSet emp=new myEmployeeSet();
		myEmployeeSet.Employee emp1=emp. new Employee(1, "Rajesh");
		Employee emp2=emp. new Employee(2, "Reddy");
		Employee emp3=emp. new Employee(3, "Rajesh");
		Employee emp4=emp. new Employee(4, "Rajesh");
		Employee emp5=emp. new Employee(5, "SaiPrasad");
		
		Employee[] list=new Employee[]{emp1,emp2,emp3,emp4,emp5};
		emp.check(list);
	}

}
