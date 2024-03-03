/**
 * 
 */
package collection.dataStructures.bst;

import java.util.List;

/**
 * 
 */
public class SampleBinarySearchTree {

	/**
	 * @param args
	 */
	public static BinarySearchTree constructSampleBST(List<Integer> sampleBinarySearchTreeData) {
		
		BinarySearchTree bst = new BinarySearchTree();
		
		for (Integer nodeData : sampleBinarySearchTreeData)
			bst.insert(nodeData,TreeType.NORMAL);
		
		return bst;
	}

}
