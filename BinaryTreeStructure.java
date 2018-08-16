package SORT_BINARY_TREE;

public class BinaryTreeStructure {
	BinaryNode root;
	
	public void inOrderT(BinaryNode current) {
		if(current != null) {
			inOrderT(current.getLeftChild());
			System.out.println(current);
			inOrderT(current.getRightChild());
		}
	}
	
	public void remove(int item) {
		if(root == null) {
			System.out.println("Tree is empty");
			return;
		}
		
		BinaryNode current = root;
		@SuppressWarnings("unused")
		boolean isLeftChild = true;
		while(true) {
			if(current.getData() == item) {
				//found item
				//leaf Node
				if(current.getLeftChild() == null 
						&& current.getRightChild() == null) {
					
					if(current.getParent().getData() > current.getData()) {
						current.getParent().setLeftChild(null);
						break;
					} else {
						current.getParent().setRightChild(null);
						break;
					}
					
				}//only a right child 
				else if(current.getLeftChild() == null 
						&& current.getRightChild() != null) {
					//left
					if(current.getParent().getData() > current.getData()) {
						//right child
						current.getParent().setLeftChild(current.getRightChild());
						break;
					} else {
						current.getParent().setRightChild(current.getRightChild());
						break;
					}
				}//only left child
				else if(current.getLeftChild() != null 
						&& current.getRightChild() == null) {
					if(current.getParent().getData() > current.getData()) {
						//right child
						current.getParent().setLeftChild(current.getLeftChild());
						break;
					} else {
						current.getParent().setRightChild(current.getLeftChild());
						break;
					}
				}//both child
				else if(current.getLeftChild() != null 
						&& current.getRightChild() != null) {
					BinaryNode least = current.getRightChild();
					
					while(least.getLeftChild() != null) {
						least = least.getLeftChild();
					}
					current.setData(least.getData());
					if(least.getRightChild() != null) {
						least.getParent().setLeftChild(least.getRightChild());
					} else {
						//current.setData(least.getData());
						least.getParent().setLeftChild(null);
					}
					break;				
				}
				
			} else if(current.getData() > item) {
				//left
				if(current.getLeftChild() == null) {
					System.out.println("Item not Found");
					break;
				} else {
					current = current.getLeftChild();
				}
			}  else if(current.getData() < item) {
				//right
				if(current.getRightChild() == null) {
					System.out.println("Item not Found");
					break;
				} else {
					current = current.getRightChild();
				}
			}
		}
	}
	
	public void addNode(int item) {
		if(root == null) {
			root = new BinaryNode(item);
			return;
		}
		
		BinaryNode current = root;
		
		while(true) {
			//talking to the left
			if(item < current.getData()) {
				if(current.getLeftChild() == null) {
					BinaryNode newNode = new BinaryNode(item);
					current.setLeftChild(newNode);
					newNode.setParent(current);
					break;
				} else {
					current = current.getLeftChild();
				}
			} else if(item >= current.getData()) {
				if(current.getRightChild() == null) {
					BinaryNode newNode = new BinaryNode(item);
					current.setRightChild(newNode);
					newNode.setParent(current);
					break;
				} else {
					current = current.getRightChild();
				}
			}	
		}
	}
}
