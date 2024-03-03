/**
 * 
 */
package collection.stack.generic;

/**
 * @author Varun Kaushik
 */
public abstract class Stack  extends AbstractStack{

	/**
	 * Stack implementation instance variables
	 */
	protected int topOfStack;
	protected int stackSize;
	protected Integer[] integersStack;
	
	public Stack() {
		topOfStack = -1;
	}

	public boolean isEmpty() throws Exception{
		return getTopOfStack() < 0;
	}


	public boolean isFull() throws Exception{
	    return getTopOfStack() >= getStackSize()-1;	
	}
	
	protected boolean push(int element) throws Exception {
		if (isFull()) {
			throw new Exception(STACK_FULL);
		}
		setTopOfStack(getTopOfStack() + 1);
		getIntegersStack()[getTopOfStack()] = element;
		return peek() == element;
	}

	protected int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception(STACK_EMPTY);
		}
		int elementToPop = getIntegersStack()[getTopOfStack()];
		getIntegersStack()[getTopOfStack()] = 0;
		setTopOfStack(getTopOfStack() - 1);
		return elementToPop;
	}
	
	protected int peek() throws Exception{
		return getIntegersStack()[getTopOfStack()];
	}
	
	/**
	 * @return the topOfStack
	 */
	protected int getTopOfStack() {
		return topOfStack;
	}

	/**
	 * @param topOfStack the topOfStack to set
	 */
	protected void setTopOfStack(int topOfStack) {
		this.topOfStack = topOfStack;
	}

	/**
	 * @return the stackSize
	 */
	protected int getStackSize() {
		return stackSize;
	}

	/**
	 * @param stackSize the stackSize to set
	 */
	protected void setStackSize(int stackSize) {
		this.stackSize = stackSize;
	}

	/**
	 * @return the integersStack
	 */
	protected Integer[] getIntegersStack() {
		return integersStack;
	}

	/**
	 * @param integersStack the integersStack to set
	 */
	protected void setIntegersStack(Integer[] integersStack) {
		this.integersStack = integersStack;
	}

}
