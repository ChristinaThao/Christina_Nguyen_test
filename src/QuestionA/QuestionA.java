package QuestionA;

public class QuestionA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		boolean result;
		
		//Case 1 (1,5) & (2,6)
		result = overlaps(1, 5, 2, 6);
		System.out.println(result);
		
		//Case 2 (1,5) & (6,8)
		result = overlaps(1, 5, 6, 8);
		System.out.println(result);
		
		//Case 3 (4,7) & (1,5)
		result = overlaps(4, 7, 1, 5);
		System.out.println(result);
		
		//Case 4 (1,5) & (5,7)
		result = overlaps(1, 5, 5, 7);
		System.out.println(result);
	}
	
	public static boolean overlaps(int x1, int x2, int x3, int x4) {
		
		// assume that x1 and x2 are the end points for line 1 and x3 and x4 the end points for line 2
		// if line 1 ends at x5 and line 2 starts at x5 consider it NOT an overlap (would usually ask stakeholder for more detail)
		
		if ((x3 > x1 && x3 < x2) || (x4 > x1 && x4 < x2)) {
			return true;
		}
		
		return false;
	}

}
