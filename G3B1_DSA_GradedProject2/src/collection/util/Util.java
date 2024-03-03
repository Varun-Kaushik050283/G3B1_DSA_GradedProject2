/**
 * 
 */
package collection.util;

import java.util.Scanner;

/**
 * @author Varun Kaushik
 */
public class Util {

	/**
	 * 
	 * @param arr
	 * @param iterationCount
	 */
	public static final void displayItems(Integer[] arr, int iterationCount) {
		if (iterationCount > 0) {
			System.out.println("Iteration No." + iterationCount);
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}

	/**
	 * 
	 * @param scanner
	 * @return
	 */
	public static final Integer[] createArray(Scanner scanner) {
		try {
			System.out.print("Please enter length of an array:");
			int arrayLength = scanner.nextInt();
			Integer[] array = new Integer[arrayLength];
			for (int i = 0; i < arrayLength; i++) {
				System.out.print("Please enter [" + i + "] item of array between 1-99: ");
				int item = scanner.nextInt();
				if (item > 0 && item < 100) {
					array[i] = item;
				} else {
					throw new Exception("Invalid input entered, program terminating...");
				}
			}
			return array;
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return null;
		}
	}

	/**
	 * 
	 * @param scanner
	 * @return
	 */
	public static final int acceptingNumberBetween1And99(Scanner scanner) {
		try {
			System.out.print("\n Please enter a number between 1-99:");
			int item = scanner.nextInt();
			if (item > 0 && item < 100) {
				return item;
			} else {
				throw new Exception("\n Invalid input entered, program terminating...");
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return -1;
		}
	}
	
	/**
	 * 
	 * @param scanner
	 * @param sizeOfList
	 * @return
	 */
	public static final int acceptingNumberBetween1AndSizeOfList(Scanner scanner,int sizeOfList) {
		try {
			System.out.print("\n Please enter a number between 1-"+sizeOfList+":");
			int item = scanner.nextInt();
			if (item > 1 && item < sizeOfList) {
				return item;
			} else {
				throw new Exception("\n Invalid input entered, program terminating...");
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			return -1;
		}
	}
}
