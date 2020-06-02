package con.learn.code.ds.Doubllylinkedlist;

public class EmployeeDoublyLinkedList {
	
	private EmployeeDNode head;
	private EmployeeDNode tail;
	
	public void addToFront(EmployeeD employee1) {
		
		EmployeeDNode createNode = addNode(employee1);
		if(head == null) {
			head = createNode;
			return;
		}
		//Set Previous nodes address new node
		head.setPrevious(createNode);
		//Set the new node 
		createNode.setNext(head);
		// Current Head new node
		head = createNode;
		
		
	}
	
	public void addToLast(EmployeeD employee1) {
		
		EmployeeDNode tempNode = head;
		EmployeeDNode createNode = addNode(employee1);
		if(head == null) {
			head = createNode;
			return;
		}
		while(tempNode.getNext()!=null) {
			tempNode = tempNode.getNext();
		}
		tempNode.setNext(createNode);
		createNode.setPrevious(tempNode);
		
	}
	
	public void reversePrint() {
		
		EmployeeDNode tailNode = head;
		while(tailNode.getNext()!=null) {
			tailNode = tailNode.getNext();
		}
		//Traverse from Tail Node with previous addr
		while(tailNode!=null) {
			System.out.println(" Employee Name "+tailNode.getEmployee().getName());
			tailNode = tailNode.getPrevious();
		}
		
		
	}
	
	public EmployeeDNode addNode(EmployeeD employee1) {
		
		EmployeeDNode node = new EmployeeDNode(employee1);
		node.setNext(null);
		node.setPrevious(null);
		
		return node;
	}
	
	public void printList() {
		EmployeeDNode current = head;
		System.out.print("HEAD"); 
		
		while(current!=null) {
			
			System.out.println(current);
			System.out.print("--->"); 
			current = current.getNext();
		}
		System.out.print("NULL"); 
	}

	public boolean find(String empName) {
		
		EmployeeDNode current = head;
		while(current!=null) {
			if(current.getEmployee().getName().equals(empName)) {
				return true;
			}
			current = current.getNext();
		}
		return false;
		
	}

}
