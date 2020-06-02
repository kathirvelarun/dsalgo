package con.learn.code.ds.trees;

public class Main {
	

	public static void main(String args[]) {
	
	    Tree intTree = new Tree();
	    intTree.insert(2);
	    intTree.insert(3);
	    intTree.insert(1);
	    

	    
	    System.out.println(" intTree " +intTree.find(1));
	    
	    System.out.println(" Smallest " +intTree.findSmallest());
	    System.out.println(" Largest " +intTree.findLargest());
	    
        intTree.traverseInOrder(); // left data right
        System.out.println();
        
        intTree.traversePreOrder(); // root left right
        System.out.println();
        
        intTree.traversePostOrder(); // left right root
        System.out.println();

	
	}


}
