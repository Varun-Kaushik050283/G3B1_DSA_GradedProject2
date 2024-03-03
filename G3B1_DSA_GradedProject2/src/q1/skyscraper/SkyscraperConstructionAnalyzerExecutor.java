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

/**
 * Driver Class
 * 
 * @author Varun Kaushik/Sarthak/Richa_Gautam(G3B1)
 */
public class SkyscraperConstructionAnalyzerExecutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SkyscraperConstructionAnalyzer skyscraperConstructionAnalyzer = null;
		try {
			System.out.println("--------------------- Start -----------------");
			skyscraperConstructionAnalyzer = new SkyscraperConstructionAnalyzer();
			skyscraperConstructionAnalyzer.execute();
			System.out.println("--------------------- Stop -----------------");
		} catch (Exception ex) {
			System.out.println("\n Exception occurred on execution.");
			ex.printStackTrace();
			return;
		} finally {
			try {
				if (null != skyscraperConstructionAnalyzer.getScanner()) {
					skyscraperConstructionAnalyzer.getScanner().close();
				}
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
				ex.printStackTrace();
			}
		}
	}
}
