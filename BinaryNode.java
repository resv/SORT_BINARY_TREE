package SORT_BINARY_TREE;

public class BinaryNode {
	private int data;
	private BinaryNode leftChild;
	private BinaryNode rightChild;
	private BinaryNode parent;
	
	public BinaryNode(int data) {
		this.data = data;
		this.leftChild = null;
		this.rightChild = null;
		this.parent = null;
	}
	
	public String toString() {
		return "Current BinaryNode -> " + this.data;
	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * @return the leftChild
	 */
	public BinaryNode getLeftChild() {
		return leftChild;
	}

	/**
	 * @param leftChild the leftChild to set
	 */
	public void setLeftChild(BinaryNode leftChild) {
		this.leftChild = leftChild;
	}

	/**
	 * @return the rightChild
	 */
	public BinaryNode getRightChild() {
		return rightChild;
	}

	/**
	 * @param rightChild the rightChild to set
	 */
	public void setRightChild(BinaryNode rightChild) {
		this.rightChild = rightChild;
	}

	/**
	 * @return the parent
	 */
	public BinaryNode getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(BinaryNode parent) {
		this.parent = parent;
	}
}
