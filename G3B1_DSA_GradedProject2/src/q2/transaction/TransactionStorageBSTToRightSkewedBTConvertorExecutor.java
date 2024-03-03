/**
 * Question 2 MARKS: 30
 * 
 * You are working in an MNC, which manages the Transactions, where only BST is used as a
 * Data Structure. The company stores all the data of transactions in BST such that the tree is
 * always a complete BST.
 * A new business requirement has arrived where the BST should not contain any left node.
 * You are required to modify the existing BST and display the node values present in ascending order.
 * 
 * Hint: ( Convert the Binary Search Tree into a Skewed Tree).
 */
package q2.transaction;

/**
 *
 * Provided Inputs: 1. List<Integer> {50,30,60,10,20,55} as breadth/level order
 * traversal for sample BST
 * 
 * Driver class
 * 
 * @author Varun_Kaushik/Sarthak/Richa_Gautam(G3B1)
 */
public class TransactionStorageBSTToRightSkewedBTConvertorExecutor {

	/**
	 * Start of program
	 * @param args
	 */
	public static void main(String[] args) {
		TransactionStorageBSTToRightSkewedBTConvertor transactionStorageBSTToRightSkewedBTConvertor = null;
		try {
			System.out.println("--------------------- Start -----------------");
			transactionStorageBSTToRightSkewedBTConvertor = new TransactionStorageBSTToRightSkewedBTConvertor();
			transactionStorageBSTToRightSkewedBTConvertor.execute();
			System.out.println("--------------------- Stop -----------------");
		} catch (Exception ex) {
			System.out.println("\n Exception occurred on execution.");
			ex.printStackTrace();
			return;
		}
	}

}
