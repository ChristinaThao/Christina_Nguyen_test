package QuestionA;

public class QuestionA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean result;
		
		//Case 1 (1,5) & (2,6)
		result = overlaps("(1,5)","(2,6)");
		System.out.println(result);
		
		//Case 2 (1,5) & (6,8)
		result = overlaps("(1,5)", "(6,8)");
		System.out.println(result);
		
		//Case 3 (4,7) & (1,5)
		result = overlaps("(4,7)", "(1,5)");
		System.out.println(result);
		
		//Case 4 (1,5) & (5,7)
		//Assumption: this case is not considered and overlap (in real life would ask for more clarifications)
		result = overlaps("(1,5)", "(5,7)");
		System.out.println(result);
		
		//Case 5 (4,5) & (2,6)
		result = overlaps("(4,5)", "(2,6)");
		System.out.println(result);
		
		//Case 6 (-4,-2) (-6, -1)
		result = overlaps("(-4,-2)", "(-3,1)");
		System.out.println(result);
		
		//Case 7 (-1,1) (-5,4)
		result = overlaps("(-5,4)", "(-1,1)");
		System.out.println(result);
		
	}
	
	
	/**
	 * 
	 * Method checks if either ends of the smaller line is between the ends of the longer line
	 * if this is true, the lines would be overlapping
	 * 
	 * @param a first line assuming the string is in the format (x1,x2) and x1 < x2
	 * @param b second line assuming the string is in the format (x3,x4) and x3 < x4
	 * @return true if the lines overlaps
	 */
	public static boolean overlaps(String a , String b) {
		
		a = a.substring(1, a.length()-1);
		b = b.substring(1, b.length()-1);
		
		String[] line1 = a.split(",");
		String[] line2 = b.split(",");
		
		if (line1.length == 2 && line2.length == 2) {
			
			int x1 = Integer.parseInt(line1[0]);
			int x2 = Integer.parseInt(line1[1]);
			
			int x3 = Integer.parseInt(line2[0]);
			int x4 = Integer.parseInt(line2[1]);
			
			
			int lengthLine1 = Math.abs(x2 - x1);
			int lengthLine2 = Math.abs(x4 - x3);
			
			if (lengthLine1 >= lengthLine2) {
				if ((x3 > x1 && x3 < x2) || (x4 > x1 && x4 < x2)) {
					return true;
				}
				return false;
			}
			
			if ((x1 > x3 && x1 < x4) || (x2 > x3 && x2 < x4)) {
				return true;
			}
			return false;
		}
		System.out.println("Error in the String inputs");
		return false;
	}
}