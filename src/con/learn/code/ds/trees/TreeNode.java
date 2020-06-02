package con.learn.code.ds.trees;

public class TreeNode {

	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	public TreeNode createNewNode(int value) {
		TreeNode node = new TreeNode();
		node.setData(value);
		node.setLeftChild(null);
		node.setRightChild(null);

		return node;
	}

	public void insert(int value) {

		// Base Condition
		if (value == data) {
			return;
		} else if (value < data) {

			if (leftChild == null) {
				leftChild = new TreeNode();
				leftChild.setData(value);
			} else {
				leftChild.insert(value);
			}

		} else if (value > data) {

			if (rightChild == null) {
				rightChild = new TreeNode();
				rightChild.setData(value);
			} else {
				rightChild.insert(value);
			}

		}

	}
	
	public TreeNode find(int value) {
		
		//Check the both data and value are same
		if(this.data == value) {
			return this;
		}
		
		else if(leftChild!=null && value < this.data) {
			return leftChild.find(value);
		}
		else if(rightChild!=null && value > this.data) {
			return rightChild.find(value);
		}
		
		return null;


	}
	
	
    public int min() {
        if (leftChild == null) {
            return data;
        }
        else {
            return leftChild.min();
        }
    }
    
    public int max() {
        if (rightChild == null) {
            return data;
        }
        else {
            return rightChild.max();
        }
    }
    
    public void traverseInOrder() {
        if (leftChild != null) {
            leftChild.traverseInOrder();
        }
        System.out.print(data + ", ");
        if (rightChild != null) {
            rightChild.traverseInOrder();
        }
    }
    
    public void traversePreOrder() {
        System.out.print(data + ", ");

        
        if (leftChild != null) {
            leftChild.traversePreOrder();
        }
        if (rightChild != null) {
            rightChild.traversePreOrder();
        }
    }
    
    public void traversePostOrder() {
        if (leftChild != null) {
            leftChild.traversePostOrder();
        }
        if (rightChild != null) {
            rightChild.traversePostOrder();
        }
        
        System.out.print(data + ", ");

    }
	

}
