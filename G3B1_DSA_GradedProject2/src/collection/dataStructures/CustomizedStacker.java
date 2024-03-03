/**
 * 
 */
package collection.dataStructures;

import java.util.Arrays;

import collection.stack.generic.Stack;

/**
 * @author Varun Kaushik
 */
public class CustomizedStacker extends Stack {

	public void initializeStackerAttributes(Integer stackSize) {
		setStackSize(stackSize);
		setIntegersStack(new Integer[getStackSize()]);
		Arrays.fill(getIntegersStack(), 0);
	}

	public void pushAnElement(Integer element) throws Exception {
		push(element);
	}

	public Integer popElement() throws Exception {
		return pop();
	}

	public Integer peekElement() throws Exception {
		return peek();
	}

}
