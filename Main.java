package SORT_BINARY_TREE;

public class Main {

	public static void main(String[] args) {
		BinaryTreeStructure tree1 = new BinaryTreeStructure();
		tree1.addNode(34);
		tree1.addNode(23);
		tree1.addNode(25);
		tree1.addNode(24);
		
		tree1.addNode(20);
		tree1.addNode(40);
		tree1.addNode(45);
		tree1.addNode(39);
		tree1.addNode(43);
		tree1.addNode(44);
		tree1.remove(23);
		
		tree1.inOrderT(tree1.root);
		
	}

}
