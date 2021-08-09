package com.practice;

public class TSYS_sahith {
	class Employee {
		double salary;
		String name;
		int empId;
		public Employee(int id, String name, double salary) {
			this.empId=id;
			this.name=name;
			this.salary=salary;
		}
		
	}
	
	interface Company{
		void assignSalaries(int[] salaries);
		void averageSalary();
		void maxSalary();
		void minSalary();
	}
	class EngineerFirm implements Company{
		Employee[] emps;
		int[] income;
		int maxSalary;
		int minSalary;
		int sumSalaries;
		int noOfEmp;
		public EngineerFirm(int n) {
			this.income=new int[n];
			this.emps=new Employee[n];
			this.maxSalary=Integer.MIN_VALUE;
			this.minSalary=Integer.MAX_VALUE;
			this.sumSalaries=0;
			this.noOfEmp=0;
		}
		
		@Override
		public void assignSalaries(int[] salaries) {
			int i=0;
			for(;i<salaries.length && i<income.length;i++) {
				income[i]=salaries[i];
				if(salaries[i]>maxSalary) maxSalary=salaries[i];
				if(salaries[i]<minSalary) minSalary=salaries[i];
				sumSalaries+=salaries[i];
				
				emps[i]=new Employee(i,Double.toString(i+salaries[i]),salaries[i]);
			}
			
			
			this.noOfEmp= i;
		}

		@Override
		public void averageSalary() {
			String s=String.format("%.5f", this.sumSalaries/(double)this.noOfEmp);
			System.out.println(s);
		}

		@Override
		public void maxSalary() {
			System.out.println(this.maxSalary);
		}

		@Override
		public void minSalary() {
			System.out.println(this.minSalary);
		}
		
	}
	
	public static void main(String[] args) {
		TSYS_sahith ts=new TSYS_sahith();
		TSYS_sahith.EngineerFirm firm=ts.new EngineerFirm(5);
		int[] salaries= {6848,9329,9984,5543,7986};
		firm.assignSalaries(salaries);
		firm.averageSalary();
		firm.maxSalary();
		firm.minSalary();
	}

}




