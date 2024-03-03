/**
 * Question 1  MARKS : 20
 * 
 * Your friend is a chief architect, who is working on building a skyscraper, in Mumbai. The
 * construction is in such a way that the floors will be constructed in other factories and they will be
 * assembled. All the constructed sizes will be distinct.
 * 
 * The skyscraper needs to be constructed in N days with the following conditions :-
 * a) Every day a floor is constructed in a separate factory of distinct size.
 * b) The floor with the larger size must be placed at the bottom of the building.
 * c) The floor with the smaller size must be placed at the top of the building.
 * 
 * Note: A floor cannot be assembled in the building until all floors larger in size are placed.
 * As a friend he wants you to build a small program that will help him analyze the construction
 * process, to avoid manual work and errors.
 *
 * Input
 * First Line: contains the total floors N in the building
 * Second Line onwards: Contains N inputs in which the ith integer denotes the size of the floor
 * that will be given to architect by factories on the ith day.
 *
 * Output
 * You are required to print N lines. Print the size of the floor in descending order, which can be
 * assembled.
 * 
 * If no floor can be assembled on the ith day, leave the line empty.
 *
 */
package q1.skyscraper;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import collection.dataStructures.CustomizedStacker;

/**
 * @author Varun Kaushik/Sarthak/Richa_Gautam(G3B1)
 */
public class SkyscraperConstructionAnalyzer {

	private final Scanner scanner;
	private Integer totalFloors;
	private final CustomizedStacker floorSizeStack;
	private final Map<Integer, String> floorsAssemblingMap;

	public SkyscraperConstructionAnalyzer() {
		scanner = new Scanner(System.in);
		floorSizeStack = new CustomizedStacker();
		floorsAssemblingMap = new HashMap<>();
	}

	/**
	 * initializing attributes
	 */
	private void initializer() {
		getFloorSizeStack().initializeStackerAttributes(getTotalFloors());
	}

	public void execute() throws Exception {

		/**
		 * Step 1: Ask user for number of floors (Input 1)
		 */
		askUserForSizeOfSkyscraper();

		/**
		 * Step 2: Ask user for floor size of every floor to be constructed (Input 2)
		 */
		for (int dayCount = 1; dayCount <= getTotalFloors(); dayCount++) {
			prepareAssemblingPlan(dayCount, askUserForFloorSizePerDayBasis(dayCount));
		}

		/**
		 * Step 3: Provide day wise assembly plan to user (Final Output)
		 */
		System.out.println("\n The order of construction is as follows:- ");
		for (int dayCount = 1; dayCount <= getTotalFloors(); dayCount++) {
			System.out.println(" Day [" + dayCount + "] : " + getFloorsAssemblingMap().get(dayCount));
		}

		System.out.println("\n Thank you for using 'Skyscraper Construction Analyzer'.");
	}

	private void askUserForSizeOfSkyscraper() throws Exception {
		System.out.print("\n Please enter the total number of floors in the building : ");
		setTotalFloors(this.getScanner().nextInt());
		getScanner().nextLine();
		initializer();
	}

	private Integer askUserForFloorSizePerDayBasis(Integer dayCount) throws Exception {
		System.out.print("\n Please enter the floor size given on day [" + dayCount + "] : ");
		Integer floorSizeOnCurrentDay = (this.getScanner().nextInt());
		getScanner().nextLine();
		return floorSizeOnCurrentDay;
	}

	private void prepareAssemblingPlan(Integer dayCount, Integer floorSizeOnCurrentDay) throws Exception {

		/**
		 * Step A: If "floor size" at TOP of "floor-size stack(non empty)" is greater
		 * than "floor-size of current day", Then pop all the previous days floor sizes
		 * and collect data in inbuilt Java function (StringBuilder), till the "floor
		 * size at TOP of floor-size stack" comes less than or equal to "floor-size of
		 * current day"
		 */
		StringBuilder floorSizesToBeAssembled = new StringBuilder("");
		if (!getFloorSizeStack().isEmpty()) {
			while (!getFloorSizeStack().isEmpty() && getFloorSizeStack().peekElement() > floorSizeOnCurrentDay) {
				floorSizesToBeAssembled.append(getFloorSizeStack().popElement()).append(" ");
			}
		}

		/**
		 * Step B: Put day wise floor-sizes collected data into assembly map, which will
		 * be used at the time of printing the final output to user.
		 */
		if (!floorSizesToBeAssembled.toString().isEmpty()) {
			getFloorsAssemblingMap().put(dayCount - 1, floorSizesToBeAssembled.toString());
		}

		/**
		 * Step C: if current day is not last day then Push the "floor size of current
		 * day" into the "floor-size stack". Else collect "floor size of current day"
		 * and all other elements of the "floor-size stack" in inbuilt Java function
		 * (StringBuilder) and put all the collected data into assembly map.
		 */
		if (dayCount == getTotalFloors()) {
			floorSizesToBeAssembled = new StringBuilder("");
			floorSizesToBeAssembled.append(floorSizeOnCurrentDay).append(" ");
			while (!getFloorSizeStack().isEmpty()) {
				floorSizesToBeAssembled.append(getFloorSizeStack().popElement()).append(" ");
			}
			getFloorsAssemblingMap().put(dayCount, floorSizesToBeAssembled.toString());
		} else {
			if (getFloorsAssemblingMap().get(dayCount) == null) {
				getFloorsAssemblingMap().put(dayCount, "");
			}
			getFloorSizeStack().pushAnElement(floorSizeOnCurrentDay);
		}

	}

	/**
	 * @return the totalFloors
	 */
	protected Integer getTotalFloors() {
		return totalFloors;
	}

	/**
	 * @param totalFloors the totalFloors to set
	 */
	protected void setTotalFloors(Integer totalFloors) {
		this.totalFloors = totalFloors;
	}

	/**
	 * @return the scanner
	 */
	protected Scanner getScanner() {
		return scanner;
	}

	/**
	 * @return the floorSizeStack
	 */
	protected CustomizedStacker getFloorSizeStack() {
		return floorSizeStack;
	}

	/**
	 * @return the floorsAssemblingMap
	 */
	protected Map<Integer, String> getFloorsAssemblingMap() {
		return floorsAssemblingMap;
	}

}
