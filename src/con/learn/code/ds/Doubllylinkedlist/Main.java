package con.learn.code.ds.Doubllylinkedlist;


public class Main {

	public static void main(String[] args) {
		
		EmployeeD employee1 = new EmployeeD("ArunKumar", 35);
		EmployeeD employee2 = new EmployeeD("Dhivya", 26);
		EmployeeD employee3 = new EmployeeD("Kayalvizhi", 4);
		
		//Add Employee
		EmployeeDoublyLinkedList empList = new EmployeeDoublyLinkedList();
		empList.addToFront(employee1);
		empList.addToFront(employee2);
		empList.addToFront(employee3);
		
		//Print List
		empList.printList();
		
		//Add to Last
		EmployeeD employee4 = new EmployeeD("Adding Last", 54);
		empList.addToLast(employee4);
		
		//Print List
		System.out.println(" ADD TO LAST ");
		empList.printList();
		
		System.out.println(" PRINT REVERSE ");
		
		empList.reversePrint();
		
		//Find EmployeeName
		//Boolean isFound = empList.find("Naresh");
		//System.out.println(" Employee Name is "+isFound);
		
		

	}

}
