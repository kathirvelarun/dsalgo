package con.learn.code.ds.Doubllylinkedlist;

public class EmployeeDNode {
	
	private EmployeeD employee;
	private EmployeeDNode next;
	private EmployeeDNode previous;
	
	public EmployeeDNode(EmployeeD employee) {
		this.employee = employee;
		
	}

	public EmployeeD getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeD employee) {
		this.employee = employee;
	}

	public EmployeeDNode getNext() {
		return next;
	}

	public void setNext(EmployeeDNode next) {
		this.next = next;
	}
	
	

	public EmployeeDNode getPrevious() {
		return previous;
	}

	public void setPrevious(EmployeeDNode previous) {
		this.previous = previous;
	}

	@Override
	public String toString() {
		return "EmployeeNode [Name=" + employee .getName()+ "Age=" + employee .getAge()+ "]";
	}
	
	

}
