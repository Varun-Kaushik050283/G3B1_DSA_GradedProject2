/**
 * 
 */
package collection.dataStructures;

import java.util.Arrays;
import java.util.Scanner;

import collection.queue.generic.CircularQueue;
import collection.util.Util;

/**
 * @author Varun Kaushik
 */
public class CustomizedCircularQueue extends CircularQueue {


	public void initializeQueueAttributes(int queueSize) {
		setQueueSize(queueSize);
		setFront(-1);
		setRear(-1);
		setQueueOfStrings(new String[queueSize]);
		Arrays.fill(getQueueOfStrings(), BLANK_STRING);
	}

	public void pushAnElementIntoTheQueue(String element) throws Exception {
		enqueue(element);
	}

	public String pushAnElementOutOfTheQueue() throws Exception {
		return dequeue();
	}

}
