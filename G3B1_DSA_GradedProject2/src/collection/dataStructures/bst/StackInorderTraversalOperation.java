/**
 * 
 */
package collection.dataStructures.bst;

import java.util.Stack;

/**
 * @author Varun Kaushik
 */
public class StackInorderTraversalOperation {

	private final BinarySearchTree providedBinarySearchTree;
	private final BinarySearchTree resultantRightSkewedTree;
	private Node rootNode;

	/**
	 * 
	 * @param Pre-filled Transaction Storage Binary Search Tree as
	 *                   providedBinarySearchTree
	 * @param Resultant  Transaction Storage Binary Tree Right-skewed tree as
	 *                   resultantRightSkewedTree
	 */
	public StackInorderTraversalOperation(BinarySearchTree providedBinarySearchTree,
			BinarySearchTree resultantRightSkewedTree) {
		this.providedBinarySearchTree = providedBinarySearchTree;
		this.rootNode = providedBinarySearchTree.getRoot();
		this.resultantRightSkewedTree = resultantRightSkewedTree;
	}

	/**
	 * Perform Stack Inorder Traversal Operation on provided Transaction Storage
	 * Binary Search Tree
	 */
	public void perform() {
		inorderInternal(getProvidedBinarySearchTree().getRoot());
	}

	private void inorderInternal(Node parameterNode) {

		/**
		 * Declaring and initializing all the necessary variables to be used during
		 * traversing the transaction storage binary search tree
		 */
		Stack<Node> stackForInorderTraversal = new Stack<Node>();

		/**
		 * resetting root node as parameterNode
		 */
		setRootNode(parameterNode);
		
		/**
		 * checking If the root node(parameterNode) that has been passed is null then
		 * return
		 */
		if (getRootNode() == null) {
			return;
		}

		/**
		 * Setting currentNode as rootNode(i.e parameterNode)
		 */
		Node currentNode = getRootNode();

		/**
		 * Traversing the transactions storage binary search tree in inorder traversal
		 * way
		 */
		while (currentNode != null || stackForInorderTraversal.size() > 0) {

			/**
			 * Finding the the left most Node of transaction storage binary search tree of
			 * the current Node
			 */
			while (currentNode != null) {
				/**
				 * Pushing the reference to the current node of transaction storage binary
				 * search tree on the stack for inorder traversal before the traversal of the
				 * current node's left subtree
				 */
				stackForInorderTraversal.push(currentNode);
				currentNode = currentNode.getLeftNode();
			}

			/**
			 * After traversing to the left most side of transactions storage binary search
			 * tree the newly referenced Current Node becomes Null, so no more nodes are
			 * left to traversed left side of the tree (reaching to leaf node). Hence,
			 * popping the the TOS element(reference to left most node) and storing the
			 * popped reference in currentNode reference variable (left most leaf node)
			 */
			currentNode = stackForInorderTraversal.pop();
			/**
			 * Now, inserting the transaction storage node data of the left most leaf node of transaction storage
			 * binary search tree into resultant Right skewed BT 
			 */
			getResultantRightSkewedTree().insert(currentNode.getData(), TreeType.RIGHT_SKEWED);

			/**
			 * As, left most leaf node of transaction storage binary search tree has been
			 * visited, now we can move to right side leaf node and making the current node
			 * as right node of current node.
			 */
			currentNode = currentNode.getRightNode();
			
		}
	}

	/**
	 * @return the providedBinarySearchTree
	 */
	public BinarySearchTree getProvidedBinarySearchTree() {
		return providedBinarySearchTree;
	}

	/**
	 * @return the resultantRightSkewedTree
	 */
	public BinarySearchTree getResultantRightSkewedTree() {
		return resultantRightSkewedTree;
	}

	/**
	 * @return the rootNode
	 */
	public Node getRootNode() {
		return rootNode;
	}

	/**
	 * @param rootNode the rootNode to set
	 */
	public void setRootNode(Node rootNode) {
		this.rootNode = rootNode;
	}

}
