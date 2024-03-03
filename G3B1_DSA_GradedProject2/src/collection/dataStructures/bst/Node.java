/**
 * 
 */
package collection.dataStructures.bst;

/**
 * @Author Varun Kauhik
 */
public class Node {

	private int data;
	private Node leftNode;
	private Node rightNode;

	public Node(Integer data) {
		this.data = data;
	}

	/**
	 * @return the data
	 */
	public Integer getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Integer data) {
		this.data = data;
	}

	/**
	 * @return the leftNode
	 */
	public Node getLeftNode() {
		return leftNode;
	}

	/**
	 * @param leftNode the leftNode to set
	 */
	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}

	/**
	 * @return the rightNode
	 */
	public Node getRightNode() {
		return rightNode;
	}

	/**
	 * @param rightNode the rightNode to set
	 */
	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", leftNode=" + leftNode + ", rightNode=" + rightNode + "]";
	}

}
