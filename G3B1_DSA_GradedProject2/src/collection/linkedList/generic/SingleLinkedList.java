/**
 * 
 */
package collection.linkedList.generic;

/**
 * @Author Varun Kaushik
 */
public abstract class SingleLinkedList extends AbstractLinkedList {

	private Node headNode;
	private int sizeOfList;

	/**
	 * Inner class Node
	 */
	protected class Node {

		private int data;
		private Node nextNode;

		Node(int data) {
			this.data = data;
		}

		/**
		 * @return the data
		 */
		protected int getData() {
			return data;
		}

		/**
		 * @param data the data to set
		 */
		protected void setData(int data) {
			this.data = data;
		}

		/**
		 * @return the nextNode
		 */
		protected Node getNextNode() {
			return nextNode;
		}

		/**
		 * @param nextNode the nextNode to set
		 */
		protected void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}

	}

	/**
	 * 
	 * @param data
	 * @return
	 * @throws Exception
	 */
	protected Node createNode(int data) throws Exception {
		Node node = new Node(data);
		return node;
	}

	@Override
	protected void insertFirstNode(int data) throws Exception {
		Node newHeadNode = createNode(data);
        newHeadNode.setNextNode(getHeadNode());
		setHeadNode(newHeadNode);
		setSizeOfList(getSizeOfList() + 1);
	}

	@Override
	protected void insertMiddleNode(int data, int position) throws Exception {
		Node newMiddleNode = createNode(data);
		Node tempNode = getHeadNode();
		for (int index = 1; index < position-1; index++) {
			tempNode = tempNode.getNextNode();
		}
		newMiddleNode.setNextNode(tempNode.getNextNode());
		tempNode.setNextNode(newMiddleNode);
		setSizeOfList(getSizeOfList() + 1);
	}

	@Override
	protected void insertLastNode(int data) throws Exception {
		Node newLastNode = createNode(data);
		Node tempNode = getHeadNode();
		while(tempNode.getNextNode() != null) {
			tempNode = tempNode.getNextNode();
		}
		tempNode.setNextNode(newLastNode);
		setSizeOfList(getSizeOfList() + 1);
	}

	@Override
	protected void deleteFirstNode() throws Exception {
        setHeadNode(getHeadNode().getNextNode());
		if (getSizeOfList() != 0) {
			setSizeOfList(getSizeOfList() - 1);
		}
	}

	@Override
	protected void deleteMiddleNode(int position) throws Exception {
		Node tempNode = getHeadNode();
		for(int index = 1; index < position-1; index++) {
		     tempNode = tempNode.getNextNode();	
		}
		tempNode.setNextNode(tempNode.getNextNode().getNextNode());
		if (getSizeOfList() != 0) {
			setSizeOfList(getSizeOfList() - 1);
		}
	}

	@Override
	protected void deleteLastNode() throws Exception {
		Node tempNode = getHeadNode();
		while(tempNode.getNextNode().getNextNode() != null) {
			tempNode = tempNode.getNextNode();
		}
		tempNode.setNextNode(null);
		if (getSizeOfList() != 0) {
			setSizeOfList(getSizeOfList() - 1);
		}
	}
	
	protected void displayLinkedNodes() throws Exception{
		Node tempNode = getHeadNode();
		while(tempNode != null) {
			System.out.print(tempNode.getData()+"->");
			tempNode = tempNode.getNextNode();
		}
		System.out.println("X");
	}

	/**
	 * @return the headNode
	 */
	public Node getHeadNode() {
		return headNode;
	}

	/**
	 * @param headNode the headNode to set
	 */
	public void setHeadNode(Node headNode) {
		this.headNode = headNode;
	}

	/**
	 * @return the sizeOfList
	 */
	public int getSizeOfList() {
		return sizeOfList;
	}

	/**
	 * @param sizeOfList the sizeOfList to set
	 */
	public void setSizeOfList(int sizeOfList) {
		this.sizeOfList = sizeOfList;
	}

}
