package con.learn.code.ds.Intlinkedlist;

public class IntegerLinkedList {
	
	private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {

        // assumption: the list is sorted

        if (head == null || head.getValue() >= value) {
            addToFront(value);
            return;
        }

        // find the insertion point
        IntegerNode current = head.getNext();
        IntegerNode previous = head;
        System.out.println("current "+current.getValue());
        System.out.println("previous "+previous.getValue());
        while (current != null && current.getValue() < value) {
        	
            System.out.println("current in while "+current.getValue());
            System.out.println("previous in while  "+previous.getValue());
            
            previous = current;
            
            System.out.println("previous = current -- current "+current.getValue());
            System.out.println("previous = current -- previous "+previous.getValue());
            
            
            
            current = current.getNext();
            
            System.out.println("current.getNext() -- current "+current);
           // System.out.println("current.getNext() -- previous "+previous.getValue());
        }

        IntegerNode newNode = new IntegerNode(value);
        newNode.setNext(current);
        previous.setNext(newNode);

        size++;

    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

	public void reverse() {
		
		IntegerNode curr = head, prev = null, next = null;
		
		while(curr!=null) {
			
			next= curr.getNext();
			curr.setNext(prev);
			
			prev = curr;
			curr = next;
			
			
			
		}
		head = prev;
		
		
	}

}
