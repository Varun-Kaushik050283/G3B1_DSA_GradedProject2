/**
 * 
 */
package collection.dataStructures.bst;

/**
 * @Author Varun Kaushik
 */
public class NodeInsertionDetails {

	private Node parentNode;
	private NodeDirection nodeDirection;
	
	/**
	 * Default constructor
	 */
	public NodeInsertionDetails() {}
	
	/**
	 * 
	 * @param parentNode
	 * @param nodeDirection
	 */
	public NodeInsertionDetails(Node parentNode, NodeDirection nodeDirection) {
	  	this.parentNode = parentNode;
	  	this.nodeDirection = nodeDirection;
	}
	
	
	/**
	 * @return the parentNode
	 */
	public Node getParentNode() {
		return parentNode;
	}


	/**
	 * @param parentNode the parentNode to set
	 */
	public void setParentNode(Node parentNode) {
		this.parentNode = parentNode;
	}


	/**
	 * @return the nodeDirection
	 */
	public NodeDirection getNodeDirection() {
		return nodeDirection;
	}


	/**
	 * @param nodeDirection the nodeDirection to set
	 */
	public void setNodeDirection(NodeDirection nodeDirection) {
		this.nodeDirection = nodeDirection;
	}


	/**
	 * 
	 * @param parentNode
	 * @param nodeDirection
	 */
	public void set(Node parentNode, NodeDirection nodeDirection) {
		this.parentNode = parentNode;
		this.nodeDirection = nodeDirection;
	}

}
