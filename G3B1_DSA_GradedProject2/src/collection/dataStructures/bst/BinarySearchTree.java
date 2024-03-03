/**
 * 
 */
package collection.dataStructures.bst;

/**
 * @author Varun Kaushik
 */
public class BinarySearchTree {

	private Node root;

	/**
	 * Constructor
	 */
	public BinarySearchTree() {
		root = null;
	}

	/**
	 * @return the root
	 */
	public Node getRoot() {
		return root;
	}

	/**
	 * 
	 * @param value
	 */
	public void insert(int value,TreeType treeType) {
		insertInternal(root, value, treeType);
	}

	/**
	 * 
	 * @param currentNode
	 * @param value
	 */
	private void insertInternal(Node currentNode, Integer value,TreeType treeType) {
		Node newNode = new Node(value);
		if (root == null) {
			root = newNode;
		} else {
			NodeInsertionDetails nid = calculateNodeInsertionDetails(currentNode, value);
			Node parentNode = nid.getParentNode();
			switch(treeType) {
			case NORMAL:
				NodeDirection nodeDirection = nid.getNodeDirection();
				if (nodeDirection.equals(NodeDirection.LEFT)) {
					parentNode.setLeftNode(newNode);
				} else {
					parentNode.setRightNode(newNode);
				}
				break;
			case RIGHT_SKEWED:
				parentNode.setRightNode(newNode);
				break;
			case LEFT_SKEWED:
				parentNode.setLeftNode(newNode);
				break;
			}
			
		}
	}

	/**
	 * 
	 * @param value
	 * @return
	 */
	public Node newNode(Integer value) {
		Node newNode = new Node(value);
		return newNode;
	}

	/**
	 * 
	 * @param currentNode
	 * @param value
	 */
	public NodeInsertionDetails calculateNodeInsertionDetails(Node currentNode, Integer value) {
		NodeInsertionDetails nid = new NodeInsertionDetails();
		traverseTree(currentNode, value, nid);
		return nid;
	}

	/**
	 * 
	 * @param currentNode
	 * @param value
	 * @param nid
	 */
	private void traverseTree(Node currentNode, int value, NodeInsertionDetails nid) {
		if (value <= currentNode.getData()) {
			Node leftNode = currentNode.getLeftNode();
			if (leftNode != null) {
				traverseTree(leftNode, value, nid);
			} else {
				nid.set(currentNode, NodeDirection.LEFT);
			}
		} else { // RIGHT
			Node rightNode = currentNode.getRightNode();
			if (rightNode != null) {
				traverseTree(rightNode, value, nid);
			} else {
				nid.set(currentNode, NodeDirection.RIGHT);
			}
		}
	}

}
