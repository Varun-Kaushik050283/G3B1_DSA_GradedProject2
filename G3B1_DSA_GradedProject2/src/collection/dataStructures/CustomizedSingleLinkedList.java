/**
 * 
 */
package collection.dataStructures;

import collection.linkedList.generic.SingleLinkedList;

/**
 * @author Varun Kaushik
 */
public class CustomizedSingleLinkedList extends SingleLinkedList {
	
	public void insertFirstNode(Integer element) throws Exception {
			insertFirstNode(element);
	}

	public void displayList() throws Exception {
		if (getSizeOfList() == 0) {
			System.out.println("The list is empty.");
			return;
		}
		displayLinkedNodes();
	}

}
