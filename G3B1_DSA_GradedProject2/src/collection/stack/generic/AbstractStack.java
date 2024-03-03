/**
 * 
 */
package collection.stack.generic;

/**
 * @author Varun Kaushik
 */
public abstract class AbstractStack {
   
	/**
	 * Stack constants
	 */
	public static final String STACK_OVERFLOW = "ELEMENTS_HAVE_BEEN_PUSHED_UPTO_STACK_SIZE";
	public static final String STACK_UNDERFLOW = "ALL_ELEMENTS_HAVE_BEEN_POPED";
	public static final String STACK_EMPTY = "TOP_OF_STACK_IS_LESS_THAN_FIRST_INDEX_OF_STACK";
	public static final String STACK_FULL = "TOP_OF_STACK_IS_EQUAL_TO_STACK_SIZE";
	
	
	/**
	 * To push an element into the stack
	 * @param element
	 * @return
	 * @throws Exception
	 */
	protected abstract boolean push(int element) throws Exception;
	
	/**
	 * To pop the top most element from the stack
	 * @return
	 * @throws Exception
	 */
	protected abstract int pop() throws Exception;
	
	/**
	 * To peek into the stack 
	 * for knowing the top most element of the stack
	 * @return
	 * @throws Exception
	 */
	protected abstract int peek() throws Exception;
	
	/**
	 * To check whether stack is empty or not
	 * @return
	 * @throws Exception
	 */
	public abstract boolean isEmpty() throws Exception;
	
	/**
	 * To check whether stack is full or not
	 * @return
	 * @throws Exception
	 */
	public abstract boolean isFull() throws Exception;
	
}
