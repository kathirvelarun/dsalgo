package con.learn.code.ds.linkedlist;

public class EmployeeLinkedList {
	
	private EmployeeNode head;
	
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
	}
	
	public void printList() {
		EmployeeNode current = head;
		System.out.print("HEAD"); 
		
		while(current!=null) {
			
			System.out.println(current);
			System.out.print("--->"); 
			current = current.getNext();
		}
		System.out.print("NULL"); 
	}

	public boolean find(String empName) {
		
		EmployeeNode current = head;
		while(current!=null) {
			if(current.getEmployee().getName().equals(empName)) {
				return true;
			}
			current = current.getNext();
		}
		return false;
		
	}

}
