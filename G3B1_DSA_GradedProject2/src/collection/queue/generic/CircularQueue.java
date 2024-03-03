/**
 * 
 */
package collection.queue.generic;

/**
 * @author Varun Kaushik
 */
public abstract class CircularQueue extends AbstractQueue {

	private int queueSize;
	private int front;
	private int rear;
	private String[] queueOfStrings;

	@Override
	protected void enqueue(String element) throws Exception {
		if (isFull()) {
			System.out.println("\nCannot perform choosen operation, Queue is full.\n");
			return;
		}
		if (getFront() == -1) {
			setFront(0);
		}
		setRear((getRear() + 1) % getQueueSize());
		getQueueOfStrings()[getRear()] = element;
	}

	@Override
	protected String dequeue() throws Exception {
		if (isEmpty()) {
			System.out.println("\nCannot perform choosen operation, Queue is empty.\n");
			return BLANK_STRING;
		}
		String element = getQueueOfStrings()[getFront()];
		getQueueOfStrings()[getFront()] = BLANK_STRING;
		if (getFront() == getRear()) {
			setFront(-1);
			setRear(-1);
		} else {
			setFront((getFront() + 1) % getQueueSize());
		}
		return element;
	}

	@Override
	protected boolean isEmpty() throws Exception {
		return getFront() == -1;
	}

	@Override
	protected boolean isFull() throws Exception {
		return (getRear() + 1) % getQueueSize() == getFront();
	}

	/**
	 * @return the queueSize
	 */
	protected int getQueueSize() {
		return queueSize;
	}

	/**
	 * @param queueSize the queueSize to set
	 */
	protected void setQueueSize(int queueSize) {
		this.queueSize = queueSize;
	}

	/**
	 * @return the front
	 */
	protected int getFront() {
		return front;
	}

	/**
	 * @param front the front to set
	 */
	protected void setFront(int front) {
		this.front = front;
	}

	/**
	 * @return the rear
	 */
	protected int getRear() {
		return rear;
	}

	/**
	 * @param rear the rear to set
	 */
	protected void setRear(int rear) {
		this.rear = rear;
	}

	/**
	 * @return the queueOfStrings
	 */
	protected String[] getQueueOfStrings() {
		return queueOfStrings;
	}

	/**
	 * @param queueOfStrings the queueOfStrings to set
	 */
	protected void setQueueOfStrings(String[] queueOfStrings) {
		this.queueOfStrings = queueOfStrings;
	}

}
