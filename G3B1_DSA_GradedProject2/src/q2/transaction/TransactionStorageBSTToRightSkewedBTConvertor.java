/**
 * 
 */
package q2.transaction;

import java.util.Arrays;
import java.util.List;

import collection.dataStructures.bst.BinarySearchTree;
import collection.dataStructures.bst.Node;
import collection.dataStructures.bst.SampleBinarySearchTree;
import collection.dataStructures.bst.StackInorderTraversalOperation;

/**
 * Provided Inputs: 1. List<Integer> {50,30,60,10,20,55} as breadth/level
 * order traversal for sample BST
 * 
 * @author Varun Kaushik/Sarthak/Richa_Gautam(G3B1)
 */
public class TransactionStorageBSTToRightSkewedBTConvertor {

	private static final List<Integer> sampleBinarySearchTreeData = Arrays
			.asList(new Integer[] { 50, 30, 60, 10, 20, 55 });

	/**
	 * 
	 * @param node
	 */
	private static void printingTree(Node node) {
		if (node != null) {
			System.out.print(node.getData() + " ");
			printingTree(node.getLeftNode());
			printingTree(node.getRightNode());
		} else {
			return;
		}
	}

	/**
	 * Start of program
	 * 
	 * @param args
	 */
	public void execute() {

		System.out.println("Provided data :-");
		for(Integer transaction: sampleBinarySearchTreeData) {
			System.out.println(transaction +" ");
		}
		System.out.println();
		System.out.println();
		// Step 1. Constructing Initial BST from sample data and empty resultant right skewed BT
		BinarySearchTree bst = SampleBinarySearchTree.constructSampleBST(sampleBinarySearchTreeData);
		BinarySearchTree resultantRightSkewedBT = new BinarySearchTree();

		// Step 2. Printing provided BST
		System.out.println("Binary Search Tree provided in the problem statement:-");
		printingTree(bst.getRoot());
		System.out.println();
		System.out.println();

		// Step 3. Traversing provided BST in InorderTraversal format 
		// to convert Provided BST into Right skewed BT
		StackInorderTraversalOperation operation = new StackInorderTraversalOperation(bst,resultantRightSkewedBT);
		operation.perform();
		System.out.println();
		System.out.println();

		// Step 3. Getting final output 
		System.out.println("Right skewed binary tree got after Inorder Traversal Operation:-");
		printingTree(resultantRightSkewedBT.getRoot());
		System.out.println();
		System.out.println();

	}

}
