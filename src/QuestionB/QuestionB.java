package QuestionB;

public class QuestionB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result;
		
		result = compareVersionString("1.2.1", "1.2.1");
		System.out.println(result);

	}
	
	public static String compareVersionString(String a, String b) {
		
		String[] firstVersion = new String[a.length()];
		firstVersion = a.split("\\.");
		String[] secondVersion = b.split("\\.");

		if (firstVersion.length < secondVersion.length) {
			for(int i = 0; i < firstVersion.length; i++) {
				
				int first = Integer.parseInt(firstVersion[i]);
				int second = Integer.parseInt(secondVersion[i]);

				if(first < second) {
					return b;
				} else if (first > second){
					return a;
				}
			}
			return b;
		} else {
			for(int i = 0; i < secondVersion.length; i++) {
			
				int first = Integer.parseInt(firstVersion[i]);
				int second = Integer.parseInt(secondVersion[i]);
			
				if(first < second) {
					return b;
				} else if (first > second){
					return a;
				}
			}
			
			if (firstVersion.length == secondVersion.length) {
				return "A and B are equal";
			}
			
			return a;
						
		}
	}
	
	

}
