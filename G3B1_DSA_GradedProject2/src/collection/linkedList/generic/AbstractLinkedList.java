/**
 * 
 */
package collection.linkedList.generic;

/**
 * @author Varun Kaushik
 */
public abstract class AbstractLinkedList {

	
	/**
	 * 
	 * @param data
	 * @throws Exception
	 */
	protected abstract void insertFirstNode(int data) throws Exception;
	
	/**
	 * 
	 * @param data
	 * @param position
	 * @throws Exception
	 */
	protected abstract void insertMiddleNode(int data, int position) throws Exception;
	
	/**
	 * 
	 * @param data
	 * @throws Exception
	 */
	protected abstract void insertLastNode(int data) throws Exception;
	
	/**
	 * 
	 * @throws Exception
	 */
	protected abstract void deleteFirstNode() throws Exception;
	
	/**
	 * @param position
	 * @throws Exception
	 */
	protected abstract void deleteMiddleNode(int position) throws Exception;
	
	/**
	 * 
	 * @throws Exception
	 */
	protected abstract void deleteLastNode() throws Exception;
	
	/**
	 * 
	 * @throws Exception
	 */
	protected abstract void displayLinkedNodes() throws Exception;
}
