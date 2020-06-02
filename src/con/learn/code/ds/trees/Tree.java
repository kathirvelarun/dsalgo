package con.learn.code.ds.trees;

public class Tree {
	
	private TreeNode treeNode;
	
	public void insert(int value) {
		
	if(treeNode == null) {
		treeNode = new TreeNode();
		treeNode.setData(value);
	}
	else {
		treeNode.insert(value);
	}
		
	}
	
	public TreeNode find(Integer data) {
		if (treeNode != null)
			return treeNode.find(data);
		return null;
	}
	
	public Integer findSmallest() {
			return treeNode.min();
	}
	
	public Integer findLargest() {
		return treeNode.max();
}

	public void traverseInOrder() {
		 treeNode.traverseInOrder();
		
	}

	public void traversePreOrder() {
		treeNode.traversePreOrder();	
	}

	public void traversePostOrder() {
		treeNode.traversePostOrder();
		
	}


}
