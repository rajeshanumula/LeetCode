package com.practice;
import java.io.*;
import java.util.*;

public class myCollections {
	public void helper() {
		Queue<Integer> q=new LinkedList<Integer>();
		q.offer(3);
		q.offer(4);
		q.offer(5);
		q.offer(6);
		q.offer(7);
		q.offer(8);
		q.offer(9);
		q.offer(10);
		System.out.println(q.poll());
		System.out.println(q.remove());
		System.out.println(q.poll());
		System.out.println(q.remove(9));
		System.out.println(q);
		q.poll();
		int[] arr= {1,2,3,4,5,6,7,8,9,0,5,4,3,265,5};
		Arrays.sort(arr);
		Set<Integer> set=new HashSet<Integer>();
		set.add(1);
		set.add(3);
		set.add(2);
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public List<Employee> helper2(List<Employee> list) {
		Collections.sort(list, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.empId-e2.empId;
			}
		});
		return list;
	}
	public static void main(String[] args) throws IOException {
		myCollections col=new myCollections();
		col.helper();
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Employee> list=new ArrayList<Employee>();
		System.out.println("Enter the size of Employees");
		int size=Integer.parseInt(reader.readLine());
		for(int i=0;i<size;i++) {
			System.out.println("Enter Employee ID and Salary");
			int empID=Integer.parseInt(reader.readLine());
			int salary=Integer.parseInt(reader.readLine());
			list.add(new Employee(empID,salary));
		}
		col.helper2(list);
		for(Employee emp: list) {
			System.out.println(emp.empId +"--->"+emp.salary);
		}
	}
}

class Employee{
	int empId;
	int salary;
	public Employee() {
		
	}
	public Employee(int ID, int Salary) {
		this.empId=ID;
		this.salary=Salary;
	}
}
