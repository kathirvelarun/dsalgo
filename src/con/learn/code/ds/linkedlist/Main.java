package con.learn.code.ds.linkedlist;

public class Main {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("ArunKumar", 35);
		Employee employee2 = new Employee("Dhivya", 26);
		Employee employee3 = new Employee("Kayalvizhi", 4);
		
		//Add Employee
		EmployeeLinkedList empList = new EmployeeLinkedList();
		empList.addToFront(employee1);
		empList.addToFront(employee2);
		empList.addToFront(employee3);
		
		//Print List
		empList.printList();
		
		//Find EmployeeName
		Boolean isFound = empList.find("Naresh");
		System.out.println(" Employee Name is "+isFound);
		
		

	}

}
