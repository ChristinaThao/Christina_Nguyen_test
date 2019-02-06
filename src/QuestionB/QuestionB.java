package QuestionB;

import com.myLibrary.VersionStrings;

public class QuestionB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result = "";
		
		VersionStrings case1 = new VersionStrings("1.1", "1.2");
		result = case1.compareVersionString();
		System.out.println(result);
		
		VersionStrings case2 = new VersionStrings("1.2", "1.1");
		result = case2.compareVersionString();
		System.out.println(result);
		
		VersionStrings case3 = new VersionStrings("1.2.1", "1.2");
		result = case3.compareVersionString();
		System.out.println(result);
		
		VersionStrings case4 = new VersionStrings("10.20.0", "11.2.1");
		result = case4.compareVersionString();
		System.out.println(result);
		
		VersionStrings case5 = new VersionStrings("1.0.2", "1.0.1");
		result = case5.compareVersionString();
		System.out.println(result);
		
		VersionStrings case6 = new VersionStrings("1.2.1", "1.2.1");
		result = case6.compareVersionString();
		System.out.println(result);
		
		VersionStrings case7 = new VersionStrings("1.2.10", "1.2.1");
		result = case7.compareVersionString();
		System.out.println(result);
		
	}

}
