package mycollection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("soumen");
		list.add("sahu");
		list.add("Monti");
		list.add("Ghonti");
		list.add("Pochu");
		for(String data:list) {
			System.out.println(data);
		}
		/*use arraylist : only when you have only fetch data
		 * if you have more insert and delete operation then don't
		 * choose this data structure
		 * as it will have lots of shifting operations
		 * */
		
		//custom arraylist
		ArrayList<Employee> empList=new ArrayList<ArrayListDemo.Employee>();
		empList.add(new Employee("soumen", 1001));
		empList.add(new Employee("Sahu", 1002));
		for(Employee emp:empList) {
			System.out.println("Id: "+emp.id);
			System.out.println("Name: "+emp.name);
			System.out.println("********************");
		}
	}
	static class Employee{
		String name;
		int id;
		Employee(String name,int id){
			this.name=name;
			this.id=id;
		}
	}
}
