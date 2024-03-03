/**
 * 
 */
package collection.queue.generic;

/**
 * @author Varun Kaushik
 */
public abstract class AbstractQueue {

	/**
	 * Stack constants
	 */
	public static final String QUEUE_OVERFLOW = "ELEMENTS_HAVE_BEEN_INSERTED_UPTO_QUEUE_SIZE";
	public static final String QUEUE_UNDERFLOW = "ALL_ELEMENTS_HAVE_BEEN_DELETED";
	public static final String QUEUE_EMPTY = "FRONT_OF_QUEUE_IS_EQUAL_TO__MINUS_ONE";
	public static final String QUEUE_FULL = "REAR_OF_QUEUE_IS_EQUAL_TO__QUEUE_SIZE_MINUS_ONE";
	public static final String BLANK_STRING = "";
	
	
	/**
	 * To insert an element into the queue
	 * @param element
	 * @return
	 * @throws Exception
	 */
	protected abstract void enqueue(String element) throws Exception;
	
	/**
	 * To delete an element from the queue
	 * @return
	 * @throws Exception
	 */
	protected abstract String dequeue() throws Exception;
	
	/**
	 * To check whether queue is empty or not
	 * @return
	 * @throws Exception
	 */
	protected abstract boolean isEmpty() throws Exception;
	
	/**
	 * To check whether queue is full or not
	 * @return
	 * @throws Exception
	 */
	protected abstract boolean isFull() throws Exception;
}
